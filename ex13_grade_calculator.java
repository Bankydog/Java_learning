import java.util.Scanner;
public class ex13_grade_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grade Calculator");
        System.out.print("enter your scores : ");
        int scores = (input.hasNextInt()) ? scores = input.nextInt() : -1;
        String result = (scores == -1) ? "Invalid input."
                : "Your grade is: " + calculateGrade(scores);

        System.out.println(result);
        input.close();
    }
    
    public static String calculateGrade (int scores) {
        return (scores >= 80) ? "A" 
        : (scores >= 70) ? "B"
        : (scores >= 60) ? "C"
        : (scores >= 50) ? "D" : "F" ;
    }

    
}
