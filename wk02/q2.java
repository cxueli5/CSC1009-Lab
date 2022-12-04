import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float sum = num1 + num2 + num3;
        float avg = sum / 3;
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + avg);
    }
}
