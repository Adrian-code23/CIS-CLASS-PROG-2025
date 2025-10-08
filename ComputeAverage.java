import java.util.Scanner;
public class ComputeAverage{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first double: ");
        double FirstDouble = input.nextDouble();
        
        System.out.print("Please enter second double: ");
        double SecondDouble = input.nextDouble();

        System.out.print("Please enter third double: ");
        double ThirdDouble = input.nextDouble();


        System.out.printf("The average is: %.2f", (FirstDouble + SecondDouble + ThirdDouble) / 3 );
    }
   
}