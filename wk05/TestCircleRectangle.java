public class TestCircleRectangle extends GeometricObject{
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        circle.setColor("white");
        circle.setFilled(false);
        System.out.println("colour:  " + circle.getColor() + " and filled: " + circle.isFilled());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        rectangle.setColor("white");
        rectangle.setFilled(false);
        System.out.println("colour:  " + rectangle.getColor() + " and filled: " + rectangle.isFilled());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
