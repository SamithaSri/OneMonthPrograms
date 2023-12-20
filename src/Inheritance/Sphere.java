package Inheritance;

class Sphere extends Circle{
//    private float radius;
    public Sphere(float radius){
        super(radius);
        System.out.println(radius);
    }
    public double calculateArea() {
//        System.out.println(super.getArea());
        return  super.calculateArea() * super.getRadius();
//        return super.getArea() * super.getRadius();
    }
}
