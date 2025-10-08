import java.util.Scanner;
public class EnterYourNameAndAge{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        double age;
        age = input.nextDouble();
        System.out.println("the age you entered is: " + age);

        input.nextLine();

        System.out.print("Enter your name as a single String: ");
        String name;
        name = input.nextLine();
        System.out.println("the name you entered is: " + name);
    }
}
