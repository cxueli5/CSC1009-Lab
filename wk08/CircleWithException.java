import java.util.Scanner;

class CircleWithException {
    double radius;
    double area;
    // public static final double PI = Math.PI; ////good to know

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        if (this.radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        } else {
            return this.radius;
        }
    }

    public double getArea() throws Exception {
        area = radius * radius * Math.PI;
        if (area > 1000) {
            throw new Exception("Area bigger than 1000");
        } else {
            return area;
        }
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public static void main(String[] args) {
        double x;
        CircleWithException circle1 = new CircleWithException();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for radius: ");

        try {
            x = scan.nextDouble();
            circle1.setRadius(x);
            scan.close();
            System.out.println("Radius: " + circle1.getRadius());
            System.out.println("Area: " + circle1.getArea());
            System.out.println("Diameter: " + circle1.getDiameter());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}