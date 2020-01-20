public class IntegerCalculator {
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

    public int add() {
        int sum = getFirstNumber() + getSecondNumber();
        return sum;
    }

    public int subtract() {
        int difference = getFirstNumber() - getSecondNumber();
        return difference;
    }

    public int multiply() {
        int composition = getFirstNumber() * getSecondNumber();
        return composition;
    }

    public int divide() {
        int quotient = getFirstNumber() / getSecondNumber();
        return quotient;
    }

    public static void main(String[] args) {
//        IntegerCalculator integerCalculator = new IntegerCalculator();
//        integerCalculator.setFirstNumber(3);
//        integerCalculator.setSecondNumber(4);
//        int result = integerCalculator.add();
    }
}