import java.util.Scanner;
public class UsingScanner{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter an integer: ");
        int x;
        x = input.nextInt();
        System.out.println("I read an integer: " + x);

        System.out.print("please enter a double: ");
        double y;
        y = input.nextDouble();
        System.out.println("I read a double: " + y);

        input.nextLine();

        System.out.print("please enter a String: ");
        String z;
        z = input.nextLine();
        System.out.println("I read a String: " + z);
    }
}
