/**
 * @class: MaleStudent
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: January 26, 2023
 *
 * Description: This class calculates how many male students there are in a school
 * while only being given the amount of total students and female students.
 */

public class MaleStudent {
    public static void main(String[] args){

        int totalStudents = 389;
        int femaleStudents = 175;
        int maleStudents = totalStudents - femaleStudents;

        System.out.println("There are " + maleStudents + "male students in this middle school.");

    }
}
