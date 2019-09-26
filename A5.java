/*
 *Matthew Cupp
 * 
 *Assignment #5
 *
 *09/26/2019
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class A5 {

    public static void main(String[] args) {
                    
            System.out.println("Welcome to the Average Monthly Rainfall Calculator!\n Let's start with the number of years you are analysing.");
            Scanner uinp = new Scanner(System.in);
int years;
//quick while loop to verify user input is an int and greater than 0
do{
    System.out.println("Please enter a number >= 1:");
while (!uinp.hasNextInt()) {
        System.err.println("That's not a valid number! Try Again");
        uinp.next(); // this is important!  without this the input wont be passed to years
    }
    years = uinp.nextInt(); 
}while ( years <= 0);
//set max months to make sure we dont get any out of bounds exceptions
int MAX_MONTHS = years*12;
//instantiate empty arraylist to add to later
List<Integer> monthList = new ArrayList<>();

int mnthSum = 0;//will be added to later
int rnfl;
for (int i = 0; i < MAX_MONTHS; i++) {
    System.out.println("Next the amount of rainfall in inches for month number " + (monthList.size() + 1));//fixes binary count
//quick while loop to verify user input is an int and greater than 0
    do{
    System.out.println("Please enter a number >= 0");
while (!uinp.hasNextInt()) {
        System.err.println("That's not a valid number! Try Again");
        uinp.next(); // this is important!  without this the input wont be passed to rnfl
    }
    rnfl = uinp.nextInt(); 
}while ( rnfl <= -1);
//if rnfl is an int greater than -1 it will be passed here to arraylist as a new list item.
    monthList.add(rnfl);
    //get the value of each iteration/month and add it to the mnthSum from earlier 
        mnthSum += monthList.get(i);


}
    System.out.println("Done!\nThe total rainfall was "+ mnthSum +" inches over the course of "+ monthList.size() +" months. \n"
    + "The average monthly rainfall (truncated) over the course of "+ monthList.size() +" months was " + (mnthSum / monthList.size()) +" inches.\n");    
}
}
