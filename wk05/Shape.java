abstract class Shape{
    double dim1, dim2;
    double PI = Math.PI;
    public double getDim1(){
        return dim1;
    }
    public void setDim1(double dim1){
        this.dim1=dim1;
    }
    public double getDim2(){
        return dim2;
    }
    public void setDim2(double dim2){
        this.dim2=dim2;
    }
    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract double area();
    public abstract void printTitle();

    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        Shape figref;
        figref = r;
        r.printTitle();
        System.out.println("Area is " + figref.area());
        figref = t;
        t.printTitle();
        System.out.println("Area is " + figref.area());
        figref = c;
        c.printTitle();
        System.out.println("Area is " + String.format("%.1f", figref.area()));
        figref = e;
        e.printTitle();
        System.out.println("Area is " + figref.area());
        figref = s;
        s.printTitle();
        System.out.println("Area is " + figref.area());
    }
}

class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return dim1*dim2;
    }

    public void printTitle(){
        System.out.println("Inside Area for Rectangle.");
    }
    
}

class Triangle extends Shape{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (dim1*dim2)/2;
    }

    public void printTitle(){
        System.out.println("Inside Area for Triangle.");
    }
    
}

class Circle extends Shape{

    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return PI *dim1 *dim2;
    }

    public void printTitle(){
        System.out.println("Inside Area for Circle.");
    }    
}

class Ellipse extends Shape{

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return 3.14 *dim1 *dim2;
    }

    public void printTitle(){
        System.out.println("Inside Area for Ellipse.");
    }    
}

class Square extends Shape{

    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return dim1*dim2;
    }   

    public void printTitle(){
        System.out.println("Inside Area for Square.");
    }
}