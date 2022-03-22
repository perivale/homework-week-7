package week7_homework;

import java.time.Year;
import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year:::");
        year = input.nextInt();
        input.close();
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = false;
        } else{
            isLeap = false;
    }
    if(isLeap==true)
        System.out.println(year+ "is a Leap year.");
    else
        System.out.println(year +"is not a leap year");

}

            }





