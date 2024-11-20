import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Calculator =====");

        double num1 = getValidNumber(input, "Enter first number: ");

        char operator = getValidOperator(input, "Enter an operator (+, -, *, /): ");

        double num2;
        while (true) {
            num2 = getValidNumber(input, "Enter second number: ");
            if (operator == '/' && num2 == 0) {
                System.out.println("Cannot divide by zero. Please try again.");
            } else {
                break;
            }
        }

        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);

        input.close(); 
    }

    public static double getValidNumber(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Not a valid number. Please try again.");
                input.next(); 
            }
        }
    }

    public static char getValidOperator(Scanner input, String message) {
        while (true) {
            System.out.print(message);
            char operator = input.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                return operator;
            } else {
                System.out.println("Not a valid operator. Please enter (+, -, *, /):");
            }
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}



// import java.util.Scanner;

// public class ex07_operator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input a number1: ");
//         int num1 = sc.nextInt();

//         System.out.print("Input operation (+, -, *, /): ");
//         String oper = sc.nextLine();

//         System.out.print("Input a number2: ");
//         int num2 = sc.nextInt();

//         int result = 0;
//         boolean validOperation = true;

//         switch (oper) {
//             case "+":
//                 result = num1 + num2;
//                 break;
//             case "-":
//                 result = num1 - num2;
//                 break;
//             case "*":
//                 result = num1 * num2;
//                 break;
//             case "/":
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Cannot divide by zero.");
//                     validOperation = false;
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operation.");
//                 validOperation = false;
//                 break;
//         }
//         if (validOperation) {
//             System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
//         }
//         sc.close();
//     }
// }
