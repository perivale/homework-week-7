package week7_homework;

import java.util.Scanner;   //java scannerto write in console

public class Programme10 {
    public static void main(String[] args) {    //creating a main method
        char ch;
        Scanner input = new Scanner(System.in); //java scanner syntax
        System.out.println(("enter the first number"));
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();
        System.out.println("enter any operator(+,-,/,*)");
        ch = input.nextLine().charAt(0);

        if (ch == '+') {        //if ..else syntex for addition,multiplication,division,substarction
            System.out.println("\naddition of " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("\nsubstraction of " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("\nmultiplication of " + num1 + "*" + num2 + "=" + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("\ndivision of " + num1 + "/" + num2 + "=" + (num1 / num2));


        }


    }
    }