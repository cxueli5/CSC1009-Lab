public class checkingAccount {
    private double balance = 0;
    private int accountNumber;

    public void deposit(double dVal){
        balance += dVal;
    }

    public void withdraw(double wVal){
        try {
            double updateBal = balance - wVal;
            if (updateBal < 0) {
                throw new insufficientFundsException(updateBal);
            }
            balance = updateBal;
            System.out.println("The balance after withdraw is : $" + balance);
        } catch (insufficientFundsException e) {
            System.out.println("Sorry, but your account is short by : $" + e.getAmount());
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return accountNumber;
    }
}