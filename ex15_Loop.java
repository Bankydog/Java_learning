import java.util.Scanner;
public class ex15_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = {1, 2, 3, 4, 5} ;
        int count = 1;
        int z = 1;

        // While Loop
        while (true) {
            System.out.println("Hello World (" + count + ")");
            count++;
            if (count > 10) break;
        }

        while (z <= 10) {
            System.out.println("Tell Your Wolrd (" + z + ")");
            z++;
        }
        
        // For loop
        for(int i = 0   ; i < x.length; i++){
            System.out.println("Value at index " + i + " is: " + x[i]);
        }

        // Do-While loop
        int choice;
        do {
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        }   while (choice != 3);

        input.close();

    }
}
