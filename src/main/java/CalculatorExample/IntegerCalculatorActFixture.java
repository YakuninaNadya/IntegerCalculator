package CalculatorExample;

import fit.ActionFixture;

public class IntegerCalculatorActFixture extends ActionFixture {
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

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
