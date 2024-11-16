import java.util.Scanner;

public class ex10_BMI_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight
        System.out.print("Input your Weight (kg): ");
        double weight = input.nextDouble();

        // Input height
        System.out.print("Input your Height (m): ");
        double height = input.nextDouble();

        // Print entered weight and height
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");

        // Calculate BMI
        double bmi = weight / Math.pow(height, 2);

        // Print BMI
        System.out.println("BMI is: " + bmi);

        input.close(); // Close the scanner
    }
}
