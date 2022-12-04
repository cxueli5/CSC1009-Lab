import java.util.Scanner;

public class bankDemoTest {
    public static void main(String[] args) {
        checkingAccount acc1 = new checkingAccount();
        Scanner scan = new Scanner(System.in);

        System.out.print("Deposit amount: $");
        double depositValue = scan.nextDouble();

        acc1.deposit(depositValue);

        System.out.print("Withdraw amount: $");
        double withdrawValue = scan.nextDouble();

        scan.close();

        acc1.withdraw(withdrawValue);
    }
}
