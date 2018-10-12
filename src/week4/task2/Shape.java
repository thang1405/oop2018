package week4.task2;

public class Shape {
    private
    String Color = "red";
    boolean Filled = true;
    public Shape(){}
    public Shape(String color,boolean filled)
    {
        Color=color;
        Filled=filled;
    }

    public void setColor(String color) {
        Color = color;
    }
    public String getColor() {
        return Color;
    }

    public boolean isFilled() {
        return Filled;
    }
    public void setFilled(boolean filled) {
        Filled = filled;
    }
    public String toString(){
        return "Color: "+this.Color+"\n"+"Filled: "+this.Filled;
    }
    public static void main(String[] args){
        Shape shape = new Shape("red",true);
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println(shape.toString());
    }
}
