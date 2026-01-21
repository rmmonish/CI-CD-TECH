import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = input.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /):");
        char operator = input.next().charAt(0);
        
        double result;

        // Perform operation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);
        input.close(); // Close the scanner to release resources
    }
}
