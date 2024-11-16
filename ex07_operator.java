import java.util.Scanner;

public class ex7_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number1: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Input operation (+, -, *, /): ");
        String oper = sc.nextLine();

        System.out.print("Input a number2: ");
        int num2 = sc.nextInt();

        int result = 0;
        boolean validOperation = true;

        switch (oper) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                validOperation = false;
                break;
        }
        if (validOperation) {
            System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
        }
        sc.close();
    }
}
