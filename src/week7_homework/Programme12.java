package week7_homework;

import java.util.Scanner;//use java scanner for write on console

public class Programme12 {
    public static void main(String[] args) {            //create main method
        Scanner input =new Scanner(System.in);          //Use scaneer syntax
        System.out.println("Enter any charcter");
        char ch =input.next().charAt(0);
        if ((ch >='c' && ch <='z')){                    //ch && alphabet
            System.out.println(ch +"is C ALPHABET");
        }else if(ch>='0' && ch <= '9') {
            System.out.println(ch + "is C DIGIT.");     //char
        }else {
            System.out.println(ch + "is A SPECIAL CHARCTER.");


        }

    }
}
