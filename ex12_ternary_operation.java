import java.util.Scanner;
public class ex12_ternary_operation {
    public static void main(String[] args) {
        System.out.println("Find even and odd numbers Program");
        System.out.print("put a number ");
        Scanner input = new Scanner(System.in);
        int number =  input.nextInt();
        String  result;

        // variable = (condition)? true : false
        result = (number%2 == 0) ? number + " is Odd" : number + " is Even" ;

        // old code
        // if(number%2 == 0){
        //      result = number + "is Odd" ;
        // } else {
        //     result = number + "is Even ";
        // }
        System.out.print(result);

        input.close();
    }
}
