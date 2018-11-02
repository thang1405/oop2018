package week5_6;


public class Circle extends Shape{

    private int radius;
    private Point Center;

    public Circle(int radius, int x, int y){
        this.Center= new Point(x,y);
        this.radius=radius;
    }
    public int getRadius() {
        return this.getLength();
    }

    public void setRadius(int radius) {
        this.setLength(radius);
        this.setWidth(radius);
    }
    public void MoveTo(Point p){
    this.Center=p;
    }
    public String toString(){
        return "I'm Circle";
    }

}