/**
 * @class: SpeedLight
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: January 26, 2023
 *
 * Description: This class will calculate the distance to a lightning strike based on the time elapsed between the flash and the sound of thunder.
 */

public class SpeedLight {
    public static void main(String[] args){

        int soundSpeed = 340;
        int soundDelay = 5;
        int lightningDistance = soundSpeed * soundDelay; //calculates distance by multiplying velocity by time

        System.out.println("The lightning is " + lightningDistance + " meters away.");
    }
}
