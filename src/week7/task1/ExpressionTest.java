package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Expression square = new Square(new Numeral(10));
        Expression numeral = new Numeral(1);
        Expression multiplication = new Multiplication(new Numeral(2), new Numeral(3));//phép nhân
        Expression subtraction = new Subtraction(square,numeral);//phép trừ
        Expression addition = new Addition(multiplication,subtraction);// thêm
        Expression square1 = new Square(addition);
        System.out.println(square.evaluate());
        System.out.println(square1.toString());

        Expression division = new Division(new Numeral(10), new Numeral(0));
        System.out.println(division.evaluate());
    }
}

class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+(right.toString())+")";
    }
}

class Multiplication extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();

    }

    @Override
    public String toString() {
        return "("+left.toString()+"*"+right.toString()+")";
    }
}

class Division extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
    public int evaluate(){
        try{
            int x = this.left.evaluate() / this.right.evaluate();
            return x;
        }catch(ArithmeticException e){
            System.out.print("Error!Can't division with ");
        }
        return 0;
    }
    @Override
    public String toString() {
        return "("+this.left.toString()+"/"+right.toString()+")";
    }
}
