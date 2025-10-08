import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number grade: ");
        String gradeStr = input.nextLine();  // Read as String

        // Check that it has a decimal point and ends in .0 or .5
        if (!gradeStr.contains(".") || !(gradeStr.endsWith(".0") || gradeStr.endsWith(".5"))) {
            System.out.println("ERROR: " + gradeStr);
            return;
        }

        // Convert to double (safe because format is checked first)
        //double gradeValue = Double.parseDouble(gradeStr);

        // Check if it's in the valid range 0.0 to 10.0
        if (gradeValue < 0.0 || gradeValue > 10.0) {
            System.out.println("ERROR: " + gradeStr);
            return;
        }

        // Translate to letter grade
        if (gradeValue >= 8.5 && gradeValue <= 10.0) {
            System.out.println("letter grade is A");
        } else if (gradeValue == 8.0 || gradeValue == 7.5) {
            System.out.println("letter grade is B");
        } else if (gradeValue == 7.0 || gradeValue == 6.5) {
            System.out.println("letter grade is C");
        } else if (gradeValue == 6.0 || gradeValue == 5.5) {
            System.out.println("letter grade is D");
        } else if (gradeValue >= 0.0 && gradeValue <= 5.0) {
            System.out.println("letter grade is F");
        } else {
            System.out.println("ERROR: " + gradeStr);
        }
    }
}