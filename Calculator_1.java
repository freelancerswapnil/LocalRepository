public class Calculator_1 {
    public static void main(String[] args) {
        // Assign specific values to num1 and num2
        double num1 = 10.5;
        double num2 = 5.5;

        System.out.println("Welcome to Calculator!");

        // You can continue with the rest of your code as before...
        System.out.println("Please choose an operation (+, -, *, /, ^, sqrt, cbrt, 4rt, !, ln, sin, cos, tan, exp, abs, rem):");
        char operator = '+'; // You can choose any operator you want here

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
            case '4':
                result = fourthRoot(num1);
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
            case 'e':
                result = exponential(num1);
                break;
            case 'a':
                result = absoluteValue(num1);
                break;
            case 'r':
                result = remainder(num1, num2);
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

    public static double fourthRoot(double num) {
        return Math.pow(num, 0.25);
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

    public static double exponential(double num) {
        return Math.exp(num);
    }

    public static double absoluteValue(double num) {
        return Math.abs(num);
    }
    
    public static double remainder(double num1, double num2) {
        return num1 % num2;
    }
}
