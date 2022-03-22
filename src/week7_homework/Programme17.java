package week7_homework;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {        //create main method
        int[] number = {123, 111, 456, 897, 678};       //any number
        String[] name = {"Monday", "Friday", "wednesday", "Thursday"};//any string name
        System.out.println("original numberic array:" + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("sorted numberic array:" + Arrays.toString(number));
        System.out.println("original string array:" + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("sorted string array: " + Arrays.toString(name));

    }
}
