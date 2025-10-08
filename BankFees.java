import java.util.Scanner;
public class BankFees{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter initial balance: ");
        double InitialBalance = input.nextDouble();
        
        System.out.print("enter number of checks written during the month: ");
        int NumberofChecks = input.nextInt();

        double totalFees = calculateTotalFees(InitialBalance, NumberofChecks);
        
        System.out.println("fees: " + totalFees);
    }
   


    public static double calculateTotalFees(double initialBalance, int TotalNumChecks){
        double finalFees = 0;

        if(initialBalance < 400){
            finalFees += 15;
        }


        if (TotalNumChecks<20) {
            finalFees += (0.15*TotalNumChecks);
        } else if (TotalNumChecks >= 20 && TotalNumChecks <= 39){
            finalFees += (0.08*TotalNumChecks);
        } else if(TotalNumChecks >=40 && TotalNumChecks <= 59){
            finalFees += (0.06 * TotalNumChecks);
        }else {
            finalFees += (0.04 * TotalNumChecks);
        }

        finalFees += 15.50;
        return finalFees;
    }
}