package week7_homework;

import java.util.Scanner;//java sceneer for write in console

public class Programme8 {
    public static void main(String[] args) {//create main method
        Scanner input = new Scanner(System.in);
        System.out.println("enter any alphabet feom A to F city name::");
       char city = input.nextLine().charAt(1);
        //if else statement
        if (city == 'A') {
            System.out.println("Aagra");
        } else if (city== 'B') {
            System.out.println("Bhopal");
        } else if (city == 'C') {
            System.out.println("channai");
        } else if (city == 'D') {
            System.out.println("delhi");
        } else if (city == 'E') {
            System.out.println("Edinburgh");
        }else if (city == 'F') {
            System.out.println("Faridabad");
        }else {
            System.out.println("enter invalid alphabet char");
        }


        }


    }

