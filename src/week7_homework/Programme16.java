package week7_homework;
//java scanner to write in a console

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {        //create a main method
        int number =100;
        Scanner input = new Scanner(System.in);      //java obj syntax
        Programme16 obj = new Programme16();
        System.out.println();
        if (number > 0) {           //100

            System.out.println(number + "  is a positive number::");
        } else if (number < 0) {
            System.out.println(number + "is a negative number");
        } else {
            System.out.println(number +"Enter zero number");
        }
    }


}


