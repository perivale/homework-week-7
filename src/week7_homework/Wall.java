package week7_homework;

import java.awt.geom.Area;

public class Wall {     // creating a public method
    double width;
    double height;

    public Wall(double width, double height) {
        if (width <= 0 && width <= 0) {
        } else {
            width = 0;
            if (height <= 0 && height <= 0) {
            } else {
                height = 0;

            }
        }
    }

    public double getWidth() {          //creating public double method
        return width;
    }

    public double getHeight() {             //creating public double method
        return height;
    }

    public void setWidth(double width1) {       //creating method with parameter
        if (width1 <= 0) {
            width = 0;      //by using parameter if..else
        } else {
            width = width1;
        }
    }


    public void setHeight(double height1) {         //creating method with parameter
        if (height1 <= 0) {
            height = 0;
        } else {            //by using if if..else statment
            height = height1;
        }
    }

    public double getArea() {       //creating method to ger area
        return width * height;
    }


    public static void main(String[] args) {           // creating main method
        System.out.println("set value accoring to width and height");   //set width and height
        Wall wall = new Wall(5, 4);         //parameter
        System.out.println("area =" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("result of height if height is less then 0:");
        System.out.println("height =" + wall.getHeight());
        wall.setWidth(70);
        System.out.println("result of height");
        System.out.println("height =" + wall.getHeight());
        System.out.println("result of area if height is less then 0:");
        System.out.println("width=" + wall.getWidth());
        System.out.println("area =" + wall.getArea());


    }
}