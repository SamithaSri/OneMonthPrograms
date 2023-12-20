package Inheritance;

import java.util.Scanner;

class Circle extends Shape{
    private float radius;
    private double area;
    public Circle() {

    }
    public Circle(float radius){
        this.radius=radius;
    }
    public double getArea(){
        return area;
    }
    public float getRadius(){
        System.out.println(radius);
        return radius;
    }
//    public void setRadius(float radius){
//        this.radius = radius;
//    }
    @Override
    public double calculatePerimeter(){
        double answer = 2 * 3.14 * radius;
        return answer;
    }
    @Override
    public double calculateArea(){
        double answer = 3.14 * (radius * radius);
        this.area = answer;
        return  answer;
    }

}
