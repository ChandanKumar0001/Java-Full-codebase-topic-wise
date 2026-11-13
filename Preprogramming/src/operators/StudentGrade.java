/*Define a method to display student grade according to marks */ 
 
package operators;
import java.util.Scanner;
public class StudentGrade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        String grade = getGrade(marks);
        System.out.println("The grade is: " + grade);
        sc.close();
    }

    public static String getGrade(int marks) {
        if (marks >= 85 && marks <= 100) {
            return "A*";
        } else if (marks >= 70 && marks < 85) {
            return "A";
        } else if (marks >= 55 && marks < 70) {
            return "B";
        } else if (marks >= 40 && marks < 55) {
            return "C";
        } else if (marks < 40) {
            return "F";
        } else {
            return "Invalid marks"; // This handles marks above 100 or negative values
        }
    }
}