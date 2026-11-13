// Define a method to check user entered date is valid or not

package operators;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class DateValidator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date in DD-MM-YYYY format: ");
        String date = sc.nextLine();
        boolean isValid = isValidDate(date);
        if (isValid) {
            System.out.println("The entered date is valid.");
        } else {
            System.out.println("The entered date is invalid.");
        }
        sc.close();
    }

    public static boolean isValidDate(String date) {
        // Regular expression to check the format DD-MM-YYYY
        String datePattern = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(date);
        
        // If the format is not valid, return false
        if (!matcher.matches()) {
            return false;
        }

        // Split the date into components
        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Validate the date components
        if (month == 2) { // February
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (day > (isLeapYear ? 29 : 28)) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { // April, June, September, November
            if (day > 30) {
                return false;
            }
        } else { // January, March, May, July, August, October, December
            if (day > 31) {
                return false;
            }
        }

        return true; // The date is valid
    }
}
