import java.util.Scanner;

public class Problem_1  {
    static class Calculator {
        double add(double a, double b) {
            return a + b;
        }

        double subtract(double a, double b) {
            return a - b;
        }

        double multiply(double a, double b) {
            return a * b;
        }

        double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String op = sc.next();

        double result = 0;
        switch (op.toLowerCase()) {
            case "add":
                result = calc.add(a, b);
                break;
            case "subtract":
                result = calc.subtract(a, b);
                break;
            case "multiply":
                result = calc.multiply(a, b);
                break;
            case "divide":
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation type.");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
