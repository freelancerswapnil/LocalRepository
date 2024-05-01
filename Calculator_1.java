import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Please choose an operation (+, -, *, /, ^, sqrt, cbrt, !, ln, sin, cos, tan):");
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
            case '!':
                result = factorial((int) num1);
                break;
            case 'l':
                result = naturalLog(num1);
                break;
            case 'i':
                result = sine(num1);
                break;
            case 'o':
                result = cosine(num1);
                break;
            case 't':
                result = tangent(num1);
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

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double naturalLog(double num) {
        return Math.log(num);
    }

    public static double sine(double num) {
        return Math.sin(Math.toRadians(num));
    }

    public static double cosine(double num) {
        return Math.cos(Math.toRadians(num));
    }

    public static double tangent(double num) {
        return Math.tan(Math.toRadians(num));
    }
}
