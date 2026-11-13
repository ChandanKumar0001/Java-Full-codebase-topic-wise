/*Define a method to display Day is based user entered number like 1-Sunday,
2-monday........7-Saturday using switch statement in Java */

package switchstatement;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();
        
        displayDay(dayNumber);
        scanner.close();
    }

    public static void displayDay(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number. Please enter a number between 1 and 7.";
                break;
        }
        System.out.println(day);
    }
}
