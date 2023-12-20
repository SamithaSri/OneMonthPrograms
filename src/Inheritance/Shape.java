package Inheritance;


public class Shape{

    public double calculateArea(){
        System.out.println("Area");
        return 0.0;
    }
    public double calculatePerimeter(){
        System.out.println("Perimeter");
        return 0.0;
    }

    public static void main(String[] args) {
        Circle cir =new Circle(2.0f);
        System.out.println("Circle... " + cir.getRadius());
        System.out.println("Perimeter : "+cir.calculatePerimeter());
        System.out.println("Area :  "+cir.calculateArea());

        cir = new Sphere(5);
        System.out.println("Sphere...");
        System.out.println("Area: "  +cir.calculateArea());

        Shape shape = new Square(6.0f);
        System.out.println("Square...");
        System.out.println("Perimeter : "+shape.calculatePerimeter());
        System.out.println("Area :  "+shape.calculateArea());


    }
}
