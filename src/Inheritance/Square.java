package Inheritance;

class Square  extends Shape {
    private float side;
    public Square(float side){
        this.side=side;
    }
    public float getSide(){
        return side;
    }
    public void setSide(float side){
        this.side = side;
    }

    @Override
    public double calculatePerimeter(){
        double answer = 4 * side;
        return answer;
    }
    @Override
    public double calculateArea(){
        double answer = side * side;
        return answer;
    }
}
