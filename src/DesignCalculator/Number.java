package DesignCalculator;

public class Number implements ArthematicExpression{
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }
}
