package DesignCalculator;

public class Expression implements ArthematicExpression{

    ArthematicExpression left;
    ArthematicExpression right;
    Operation operation;

    public Expression(ArthematicExpression left, ArthematicExpression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        switch(operation) {
            case ADDITION:
                return left.evaluate() + right.evaluate();
            case SUBTRACTION:
                return left.evaluate() - right.evaluate();
            case MULTIPLICATION:
                return left.evaluate() * right.evaluate();
            case DIVISION:
                return left.evaluate() / right.evaluate();
            default:
                return 0;
        }
    }
}
