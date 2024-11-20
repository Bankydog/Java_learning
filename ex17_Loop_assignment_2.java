// Multiplication table

import java.util.Scanner;
public class ex17_Loop_assignment_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a start number :");
        int start = (input.hasNextInt()) ? input.nextInt() : -1 ;

        System.out.print("Enter a stop number :");
        int stop = (input.hasNextInt()) ? input.nextInt() : -1 ;

        if (start == -1 || stop == -1) {
            System.out.println("Invalid input."); 
        }

        if (start > stop) {
            System.out.println("Start number should not be greater than stop number.");
        }

        for(int i = start; i <= stop; i++ ){
            System.out.println("multiplication is " + i);
            for(int j =1; j <= 12; j++){
                System.out.println( i + " * " + j + " = "+ (i*j));
            }
        }
        input.close();
    }
}
