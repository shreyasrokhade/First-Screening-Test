import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Select the operation:'addition','subtraction','multiplication','division'");
        System.out.println("Enter the operation: ");
        String operation = scanner.next();
        Calculator calculator = new Calculator(a, b, operation);
        switch (operation) {
            case "addition":
                System.out.println("The sum is: " + calculator.add());
                break;
            case "subtraction":
                System.out.println("The difference is: " + calculator.subtract());
                break;
            case "multiplication":
                System.out.println("The product is: " + calculator.multiply());
                break;
            case "division":
                System.out.println("The quotient is: " + calculator.divide());
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
