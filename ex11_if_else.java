import java.util.Scanner;

public class ex11_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("put your score :");
        int scores = input.nextInt();
        if(scores >= 51){
            System.out.println("PASS");
        } else {
            System.out.println("False");
        }
        input.close();
    }
}