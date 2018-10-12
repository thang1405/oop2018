package week4.task2;

public class Circle extends Shape {
    private
    double Radius= 1.0;
    final double PI=3.14;
    public Circle(){}
    public Circle(double radius){
        Radius=radius;
    }
    public Circle(double radius,String color, boolean filled){
        Radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
    public double getRadius() {
        return Radius;
    }

    public double getArea(){//dien tich
        return (Radius*Radius*PI);
    }
    public double getPerimeter(){
        return 2*PI*Radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBan kinh : "+Radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println("Dien tich: "+circle.getArea());
        System.out.println("chu vi: "+circle.getPerimeter());
        System.out.println(circle.toString());
    }
}