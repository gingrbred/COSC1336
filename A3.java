/*
 *Matthew Cupp
 * 
 *Assignment 3
 * 
 *09/12/19
*/
package A3;
/*
@gingrbred
*/
public class A3 {

    public static void main(String[] args) {
        int EnergyDrinks = 12467;
        int OneorMore = (int) (0.14*EnergyDrinks);
        int CitrusLovers = (int) (0.64*EnergyDrinks);
        System.out.println("A soft drink company recently surveyed 12,467 of its customers and found that approximately 14 percent of those surveyed purchase one or more energy drinks per week.\nOf those customers who purchase energy drinks, approximately 64 percent of them prefer citrus­flavored energy drinks.\n");
        System.out.println("The Total Number of consumers in the survey who purchased one or more energy drinks per week is " + OneorMore);
        System.out.println("That's at least " + OneorMore*52 + "(1 Drink/week) Energy Drinks sold a year and up to " + OneorMore*7*52 + "(7 Drinks/week) Energy Drinks sold a year!");
        System.out.println("The Total Number of consumers in the survey who prefered citrus-flavored energy drinks is " + CitrusLovers);
    }

}
