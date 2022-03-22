package week7_homework;

import java.util.Scanner;//java scanner to input in data

public class Programme4 {
    public static boolean isleapyear(int year) {            //public static method
        boolean x;
        x = true;
        if (year >= 1 && year <= 9999) {            //if else statement
            //      boolean a;
            //  a = true;
            if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
                System.out.println("year" + "year is leap year");
            } else {
                System.out.println("year" + " is not leap year");
            }
        } else {
            x = false;
            System.out.println("year" + "parameter is not in a range(   1-9999");
        }

        return x;

    }


    public static int getdaysinmonth(int year, int month) {            //public static method
        //by switch stetement
        int day;
        switch (month) {
            case 1:
                day = 31;
                break;
            case 2:
                boolean skp = isleapyear(year);     //to check days in feb month
                if (skp == true) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            case 3:
                day = 31;
                break;

            case 4:
                day = 30;
                break;

            case 5:
                day = 31;
                break;

            case 6:
                day = 31;
                break;
            case 7:
                day = 31;
                break;

            case 8:
                day = 30;
                break;

            case 9:
                day = 31;
                break;

            case 10:
                day = 30;
                break;
            case 11:
                day = 31;
                break;
            case 12:
                day = 31;
                break;
            default:
                day = -1;         //default since moth is invalid
        }

        return day;         //return day in main method

    }

    public static void main(String[] args) {            //creating a main method
        Scanner input = new Scanner(System.in);           //scanner syntax
        System.out.println("enter the year");
        int year = input.nextInt();
        System.out.println("isleap year(year 1)");      //
        System.out.println("enter the month");
        int month1 = input.nextInt();
        System.out.println("enter the year");
        int year1 = input.nextInt();
        System.out.println("month" + month1 + " has" + getdaysinmonth(year, month1) + "days");

    }

}
