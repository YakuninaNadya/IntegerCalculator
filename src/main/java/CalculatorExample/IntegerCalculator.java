package CalculatorExample;

public class IntegerCalculator {
    public IntegerCalculator() {

    }
    int firstNumber;
    int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int composition = firstNumber * secondNumber;
        return composition;
    }

    public int divide(int firstNumber, int secondNumber) {
        int quotient = firstNumber / secondNumber;
        return quotient;
    }

    public static void main(String[] args) {
//        IntegerCalculator integerCalculator = new IntegerCalculator();
//        integerCalculator.setFirstNumber(3);
//        integerCalculator.setSecondNumber(4);
//        int result = integerCalculator.add();
    }
}