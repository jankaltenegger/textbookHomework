/**
 * @class: Cycle
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: January 26, 2023
 *
 * Description: This class calculates how many tricycles there are while just being given
 * the amount of bicycles and total wheels in the store.
 */

public class Cycle {
    public static void main(String[] args){

        int bicycleWheels = 10 * 2; //Every bike has two wheels.
        int totalWheels = 47;
        int tricycles = (totalWheels - bicycleWheels) / 3; //Excluding the bicycles and dividing by amount of wheels on tricyle

        System.out.println("There are " + tricycles + " tricycles in the shop.");

    }
}
