import java.util.Date;

abstract class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated = new Date();

    public GeometricObject(){};
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "date is: " + dateCreated;
    }
}

class Circle extends GeometricObject{
    double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void printCircle(){
        System.out.println("The radius of circle is: " + radius + ", diameter is: " + getDiameter() + 
                            " , area is: " + getArea() + " , perimeter is: " + getPerimeter());
    }
}

class Rectangle extends GeometricObject{
    double width;
    double height;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}