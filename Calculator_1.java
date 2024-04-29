import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Please choose an operation (+, -, *, /, ^, sqrt, cbrt):");
        char operator = scanner.next().charAt(0);

        double result;

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
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case 's': // Changed 'sqrt' to 's' for square root
                result = squareRoot(num1);
                break;
            case 'c':
                result = cubeRoot(num1);
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double cubeRoot(double num) {
        return Math.cbrt(num);
    }
}
