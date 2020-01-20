public class IntegerCalculator {

    int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }

    int multiply(int firstNumber, int secondNumber) {
        int composition = firstNumber * secondNumber;
        return composition;
    }

    int divide(int firstNumber, int secondNumber) {
        int quotient = firstNumber / secondNumber;
        return quotient;
    }

    public static void main(String[] args) {
        IntegerCalculator integerCalculator = new IntegerCalculator();
        System.out.println(integerCalculator.divide(3, 4));
    }
}
