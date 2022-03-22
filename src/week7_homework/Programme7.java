package week7_homework;
//use scanner to write in console
import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {        //use scanner to write in console

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Sales ID::");   //any id number
        int salesID= input.nextInt();
        System.out.println("Enter seller's name::");    //any seller name
        String sellername = input.next();
        System.out.println("Enter sales amount::");     //sales amount
        int salesamount = input.nextInt();
        System.out.println("Enter basic salary::");     //basic salary
        int salary = input.nextInt();



        if(salesamount>=50000) {                                                    //use if
            System.out.println("sales amount is 35%:" + (50000*35 %100));
        }else if(salesamount>=30000){                                           //else if
            System.out.println("sales amount is 20%:" +(30000*20%100));
        }else if(salesamount>=20000) {                                              //else if
            System.out.println("sales amount is 10%:" + (20000*10 % 100));
        }else if(salesamount>=10000) {                                                  //else if
            System.out.println("sales amount is 5%:" + (10000 * 5 % 100));
        }else  {                                                                    //use else only
            System.out.println("sales amount is 2%: "+(10000*2%100));
        }







    }
}
