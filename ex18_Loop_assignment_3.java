
// find Max, Min, Totals, AVG

import java.util.Scanner;
public class ex18_Loop_assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNum = 0 , minNum = Integer.MAX_VALUE, count = 0, sum = 0;
        while (true) {
            System.out.print("Enter a number or -1 to end this's porgram : ");
            int num = (input.hasNextInt()) ? input.nextInt() : -1;

            if(num == -1) {
                System.out.println("invalid input");
                break;
            } 
                sum += num;
                count++;

            if(num > maxNum){
                maxNum = num;
            } if(num < minNum){
                minNum = num;
            }
            int avg = (count > 0) ? sum / count : 0;
            System.out.println("Max : " + maxNum + " Min : " + minNum + " Totals : " + sum + " AVG : " + avg);
        } 
        input.close();
    }
}
