import java.util.Scanner;

public class Apply {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        Loan apply1 = new Loan(2.5, 5, 1000);

        // apply1.setAnnualInterestRate(2.5);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();
        // System.out.println("Enter annual interest rate, for example, 8.25: " + apply1.getAnnualInterestRate());

        // apply1.setNumberOfYears(5);
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        // System.out.println("Enter number of years as an integer: " + apply1.getNumberOfYears());

        // apply1.setLoanAmount(1000);
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        // System.out.println("Enter loan amount, for example, 120000.95: " + apply1.getLoanAmount());

        System.out.println("The loan was created on " + apply1.getLoanDate());

        System.out.println("The monthly payment is " + String.format("%.2f", apply1.getMonthlyPayment()));

        System.out.println("The total payment is " + String.format("%.2f", apply1.getTotalPayment()));

    }
}