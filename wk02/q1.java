
import java.util.Scanner;

public class q1 {

    static final double PI = 3.14159;
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println("The byteValue is: " + byteValue);

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();
        System.out.println("The shortValue is: " + shortValue);

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();
        System.out.println("The intValue is: " + intValue);

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();
        System.out.println("The longValue is: " + longValue);

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();
        System.out.println("The floatValue is: " + floatValue);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}