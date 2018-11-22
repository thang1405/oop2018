package week7.task1;

public class Addition extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Addition(Expression left, Expression right ){
        this.left  = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    public int evaluate(){
        return left.evaluate()+right.evaluate();
    }

    @Override
    public String toString() {// Cộng
        return "("+ left.toString()+"+"+right.toString()+")";
    }
}