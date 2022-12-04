import java.util.Date;
import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate = new Date();

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public Date getLoanDate(){
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public void setLoanDate(Date loanDate){
        this.loanDate = loanDate;
    }

    // private double monthlyPayment = (this.loanAmount * this.annualInterestRate) / ( 1 - ( 1 / Math.pow( (1 + this.annualInterestRate), (this.numberOfYears * 12) ) ) );

    public double getMonthlyPayment(){
        // return monthlyPayment;
        return (this.loanAmount * (this.annualInterestRate / 12 / 100)) / ( 1 - ( 1 / Math.pow( (1 + (this.annualInterestRate / 12 / 100)), (this.numberOfYears * 12) ) ) );
    }

    // private double totalPayment = this.monthlyPayment * this.numberOfYears * 12;

    public double getTotalPayment(){
        // return totalPayment;
        return getMonthlyPayment() * this.numberOfYears * 12;
    }
}