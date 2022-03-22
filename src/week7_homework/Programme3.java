package week7_homework;

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {            //java sceneer to eritw in console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name");     //creatina all veriable
        String name=scanner.nextLine();
        System.out.println("roll no");
        int num =scanner.nextInt();
        System.out.println("subject name");
        System.out.println("mathes");
        int sub =scanner.nextInt();
        System.out.println("Science");
        int sub1 =scanner.nextInt();
        System.out.println("english");
        int sub2= scanner.nextInt();
        String result=" ";              //creating all empty variable
        String grade=" ";
        String total=" ";


        int marks = 0;
        float precentage = 273 * 3 / 100;
      //  String results;
      //  String grade;

        if (marks <= 0 && marks >= 80) {            //if else condition
            System.out.println("Grade A+");
        } else if (marks <= 80 && marks >= 60) {
            System.out.println("Grade A");
        } else if (marks <= 60 && marks >= 50) {
            System.out.println("Grade B");
        } else if (marks <= 50 && marks >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade C");
        }

                //mark sheet to print on console stetement
        System.out.println("-----------------------------------------------------");
        System.out.println("|                                                    |");
        System.out.println("|                     MARK SHEET                     | ");
        System.out.println("|      Name         :       "+name +"                |");
        System.out.println("|      RollNo:            "+num+"                    |  ");
        System.out.println(("|     subject     :            "+"  MARKS   "+"     |"));
        System.out.println(" |     maths      :           "+sub+"                |");
        System.out.println("|     Science                  "+sub1+"              | :");
        System.out.println("|     English      :            "+sub2+"             |");
        System.out.println("|      TOTAL       :           "+ total   +"          |");
        System.out.println("|                                                     |");
        System.out.println("|     Percentage   :          "+precentage+"          |");
        System.out.println("|      Result      :           "+result+"              |");
        System.out.println("|      Grade       :            "+grade+"              |");
        System.out.println("|                                                     |");
        System.out.println("|______________________________________________________|");


    }
}
