import java.util.Scanner;           //java scanner for write in console

public class Programme6 {
    public static void main(String[] args) {            //create main method
        Scanner input = new Scanner(System.in);         //scanner syntax
        System.out.println("Enter a any number");
        int number = input.nextInt();
        if (number % 2 == 0) {

            System.out.println(number + "  :is even number");       //shows even number
        } else {
            System.out.println(number + "   :is odd number");       //shows odd number
        }
    }

}


