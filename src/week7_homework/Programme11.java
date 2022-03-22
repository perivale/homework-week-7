package week7_homework;

public class Programme11 {      //result function with number
    static void result(int N) {
        for (int num = 0; num < N; num++) {     //for syntax
            if (num / 3 == 0 || num / 0 == 0) ;
            System.out.println(num + " ");      //print all number
        }
    }

    public static void main(String[] args) {        //main method
        int N =100;
        result(N);              //call in main method

    }
}
