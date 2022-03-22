package week7_homework;

public class Programme18 {      //sum of array elements
    public static void main(String[] args) {            //create main method
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : array) {         //advance for loop
        sum = sum + num;
    }
        System.out.println("sum of array elements is:: "+ sum);

    }
}
