package homework_week_5;

/**
 * Write a Java program that takes two numbers as input and display the
 * product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output : 25 x 5 = 125
 */
public class Programme10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //first number declaration
        int firstNumber = 25;
        //second number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        //expected output
        System.out.println(firstNumber + " x " + secondNumber + " = " + produced);
    }
}
