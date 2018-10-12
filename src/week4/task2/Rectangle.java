package week4.task2;

public class Rectangle extends Shape {
    private
    double Width=1.0, Length=1.0;
    public Rectangle(){}
    public Rectangle(double width,double length){
        Width=width;
        Length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        Width=width;
        Length=length;
        setColor(color);
        setFilled(filled);
    }

    public void setLength(double length) {
        Length = length;
    }
    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }
    public void setWidth(double width) {
        Width = width;
    }

    public double getArea(){
        return Length*Width;
    }
    public double getPerimeter(){
        return 2*Width+2*Length;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nChieu dai: "+Length+"\nChieu rong: "+Width;
    }

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(4.0,7.5);
        System.out.println("Dien tich : "+ rectangle.getArea());
        System.out.println("Chu vi : "+ rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
