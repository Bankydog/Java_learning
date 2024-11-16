import java.util.Scanner;
import java.time.LocalDate;

public class ex06_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

    // input String
        System.out.print("input your name ");
        String name = sc.nextLine(); //input text
        
    // input Integer
        System.out.print("input your year of birth");
        int number = sc.nextInt();//input number
        int age = currentYear - number;
        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);

        sc.close();
    }
}
