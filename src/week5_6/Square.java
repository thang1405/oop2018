package week5_6;

public class Square extends Rectangle{
    private int side;
    public Square(){
        super();

        Point a = super.getLeftAbove();
        Point b = new Point();
        b.setX(a.getX());
        b.setY(a.getY());
        super.setRightUnder(b);
    }
    public void MoveTo(Point p){
        Point b = new Point();
        b.setX(p.getX());
        b.setY(p.getY());
        super.moveTo(p, b);
    }

    public String toString(){
        return "I'm Square ";
    }

}