import java.util.Scanner;
import java.lang.Math;

public class mortgageCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("monthly payment: ");
        // long monthlyPayment = scanner.nextInt();
        
        System.out.print("principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("monthly interest rate: ");
        float monthlyInterestRate = scanner.nextFloat();
        
        System.out.print("number of payments: ");
        int numberOfPayments = scanner.nextInt();

        double upperBound = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments));
        double lowerBound = (Math.pow((1 + monthlyInterestRate), numberOfPayments)) - 1;

        double monthlyPayment = principal * (upperBound / lowerBound);
        
        System.out.print(Math.round(monthlyPayment * 100.0) / 100.0);
    }
}
