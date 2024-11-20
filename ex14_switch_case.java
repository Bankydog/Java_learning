import java.util.Scanner;
public class ex14_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of a month : ");
        int month = (input.hasNextInt()) ? input.nextInt() : -1 ;
        String result = (month != -1) ? (checkMonth(month)) : "Invalid input." ;
        System.out.print(result);

        input.close();
    }

    public static String checkMonth (int month) {
         switch (month) {
            case 1 : return "January";
            case 2 : return "febuary";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
}
