package week7_homework;
            //java scanner use for write in console
import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {       //create main method
        Scanner input =new Scanner(System.in);
        System.out.println(" Please enter any number");     //enter any number
        int number = input.nextInt();
        String stroutput =(number % 2==0)?" Even number:":" odd number:";   //show even or odd
        System.out.println(number +" is"+stroutput);
        input.close();

    }
}
