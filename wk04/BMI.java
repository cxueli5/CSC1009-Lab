import java.util.Scanner;
import java.lang.Math;

public class BMI {

    private double weight;
    private double height;
    private double BMI;

    public BMI(double weight, double height, double BMI){
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
    }

    public BMI(){
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setBMI(double BMI){
        this.BMI = BMI;
    }

    public double calculateBMI() {
        this.weight *= 0.45359237;
        this.height *= 0.0254;
        this.BMI = this.weight / Math.pow(this.height, 2);
        return this.BMI;
    }

    public void interpretBMI() {
        if (this.BMI < 18.5){
            System.out.print("Underweight");
        } else if (18.5 <= this.BMI || this.BMI < 25.0) {
            System.out.print("Normal");
        } else if (25.0 <= this.BMI || this.BMI < 30.0) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        // BMI  myBMI = new BMI (weight, height, 0);
        System.out.print("Enter weight in pounds: ");
        // myBMI.setWeight(input.nextDouble());
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        // myBMI.setHeight(input.nextDouble());
        double height = input.nextDouble();

        //ask prof / friends what if u dw a specific parameter inside BMI()
        BMI  myBMI = new BMI (weight, height, 0);
        System.out.println("BMI is " + myBMI.calculateBMI());
        myBMI.interpretBMI();
    }
}