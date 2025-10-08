import java.util.Scanner;
public class ConvertFeetToInches{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of feet: ");
        double userInput = input.nextDouble();
        System.out.println("you entered: " + userInput);

        double inches;
        inches = (userInput * 12);

        System.out.println("the equivalent number in inches is: " + inches);
    }
   
}