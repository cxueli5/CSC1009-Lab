import java.util.Scanner;

public class lab1ex2 {
    public static void main(String arg[])
    {
        String module;

        //Create Scanner object for keyboard input
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an input: ");
        module = console.nextLine();

        switch(module)
        {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            case "CSC1008":
                System.out.println("Data Structures");
                break;
            default:
                System.out.println("Unknown Currency");
                break;
        }
        System.out.println("After switch");
    }
}
