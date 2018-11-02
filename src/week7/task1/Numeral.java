package week7.task1;

public class Numeral extends Expression {
    private int value;
    public Numeral(){
        value=0;
    }
    public Numeral(int nu) {
        value = nu;
    }
    public String toString() {
        return ""+value;
    }
    public int evaluate() {
        return value;
    }
}
