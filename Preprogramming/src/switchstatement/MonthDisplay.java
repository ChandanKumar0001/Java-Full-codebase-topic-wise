/* Define a method to display month based on
 * the user entered number like 1-January, 2-February.............12-December */

package switchstatement;
import java.util.Scanner;

public class MonthDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-12): ");
        int monthNumber = scanner.nextInt();
        
        displayMonth(monthNumber);
        scanner.close();
    }

    public static void displayMonth(int monthNumber) {
        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }
        System.out.println(month);
    }
}

