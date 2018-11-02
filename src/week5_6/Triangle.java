package week5_6;

public class Triangle extends Shape{
    private int edge1;
    private int edge2;
    private int edge3;
    public Triangle(){
        super();
    }
    public Triangle(int side1,int side2, int side3, int x, int y){

        this.edge1=side1;
        this.edge2=side2;
        this.edge3=side3;
    }

    public int getSide1() {
        return edge1;
    }

    public void setSide1(int side1) {
        this.edge1 = side1;
    }

    public int getSide2() {
        return edge2;
    }

    public void setSide2(int side2) {
        this.edge2 = side2;
    }

    public int getSide3() {
        return edge3;
    }

    public void setSide3(int side3) {
        this.edge3 = side3;
    }

    public String toString(){
        return "I'm Triangle";
    }
}