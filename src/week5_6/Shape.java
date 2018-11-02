package week5_6;


public class Shape {
    private String color;
    private int width;
    private int length;
    public Shape(){
        color="green";
    }
    public Shape(String color) {
        this.color = color;
    }
    public Shape(int width, int length, int x , int y){
        this.width=width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void changeColor(String color){
        this.color=color;
    }

    public String toString(){
        return "I'm Shape" ;
    }

}