package week4.task2;

public class Square extends Rectangle {
    public Square(){
        super(1.0,1.0);
    }
    public Square(double side){
        super(side,side);
    }
    public  Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void  serLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args){
        Square square = new Square(4);
        System.out.println("Chu vi: "+square.getPerimeter());
        System.out.println("Dien tich: "+square.getArea());
        System.out.println(square.toString());
    }
}
