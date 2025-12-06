import java.util.Scanner;

public class FixedDepositNIB
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        char choice = 'y';
        while(choice =='y')
        {
            System.out.println("Enter the amount you would like to deposit(Minimum amount= Rs.1000): ");
            double Principal = scan.nextDouble();
            if(Principal<1000){
            System.out.println("The deposit amount must be at least Rs. 1000.");}
            System.out.println("Enter the annual rate(8%\t 9%\t 10%\t 11%\t 12%\t): ");
            double annualR = scan.nextDouble();
            System.out.println("Enter the timespan for the deposit in years(Maximum duration= 5 years): " );
            int T = scan.nextInt();
            if(T>5 || T<1){
               System.out.println("The deposit duration must be within 1 to 5 years.");
            }
            int months = (T*12);
            double monthlyR = (annualR/12)/100 ;
            double Amount = Principal;
            for (int i = 1; i <= months; i++) {
                Amount = Amount + (Amount * monthlyR);
            }
            double CI = Amount -Principal;
            double feeR = 0.005;
            double fee = Amount*feeR;
            double totalAmount = Amount - fee;
            System.out.println("=====================CALCULATION==========================");
            System.out.println("Principal: Rs."+Principal);
            System.out.println("Duration: "+T+ "years /"+months+ "months");
            System.out.println("Interest rate: "+annualR+ "(annual interest) /"+monthlyR+ "(monthly interest)");
            System.out.println("Compound interest: Rs." +CI);
            System.out.println("The total amount before processing fee rate(0.5%): Rs. "+Amount);
            System.out.println("The fee taken from amount : Rs. "+fee);
            System.out.println("The total amount after processing fee rate: Rs. "+totalAmount);
            System.out.println("==========================================================");
            System.out.println("Do you want to add another fixed deposit? (y/n)");
            choice= scan.next().charAt(0);
        }
        System.out.println("Thank you!");
        System.out.println("==============================================================");
    }
}