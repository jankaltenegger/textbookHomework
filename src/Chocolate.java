/**
 * @class: Chocolate
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: January 26, 2023
 *
 * Description: This class calculates how many bags you would need if every
 * bag can fit 3 instead of just 2 chocolates.
 */

public class Chocolate {
    public static void main(String[] args){

        int bags = 9;
        int chocolatesCurrently = 2; //The amount of chocolates that are currently held by one bag
        int chocolatesWanted = 3; //The amount of chocolates wished to be held by one bag.

        int amountBags = (bags * chocolatesCurrently) / chocolatesWanted; //Gets the total amount of chocolate and divides it by 3.

        System.out.println("You would need " + amountBags + " bags to hold all chocolates to maximum capacity.");

    }
}
