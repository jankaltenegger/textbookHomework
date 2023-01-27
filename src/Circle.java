/**
 * @class: Circle
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: January 26, 2023
 *
 * Description: This class calculates the area and perimeter of a circle
 * with a radius of 9.5.
 */

public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        System.out.println("The area of the circle is " + area + " and the perimeter is " + perimeter);
    }
}
