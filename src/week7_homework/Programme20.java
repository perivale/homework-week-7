package week7_homework;

public class Programme20 {
    public static boolean method(int[] array, int item) {
        for (int a : array) {
            if (item == a) {
                return true;
            }
        }
        return false;}

        public static void main(String[]args){
            int[] array1 = {
                    123, 205, 560, 450, 560, 456, 765, 324};
            System.out.println(method(array1, 560));
            System.out.println(method(array1, 304));
        }
    }






