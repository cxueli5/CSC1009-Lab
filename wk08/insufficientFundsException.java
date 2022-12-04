public class insufficientFundsException extends Exception {
    private double amount;

    public insufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
