package CalculatorExample;

import fit.ColumnFixture;


public class IntegerCalculatorFixture extends ColumnFixture {
    IntegerCalculator integerCalculator = new IntegerCalculator();
    public int firstNumber;
    public int secondNumber;


    public int checkAdd() {
        return integerCalculator.add(firstNumber, secondNumber);
    }

    public int checkSubtract() {
        return integerCalculator.subtract(firstNumber, secondNumber);
    }

    public int checkMultiply() {
        return integerCalculator.multiply(firstNumber, secondNumber);
    }

    public int checkDivide() {
        return integerCalculator.divide(firstNumber, secondNumber);
    }
}
