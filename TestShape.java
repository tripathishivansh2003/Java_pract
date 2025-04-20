interface Shape {
    double PI = 3.14;
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }
    public double area() { return PI * radius * radius; }
    public double perimeter() { return 2 * PI * radius; }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * (length + width); }
}

class Square implements Shape {
    double side;
    Square(double s) { side = s; }
    public double area() { return side * side; }
    public double perimeter() { return 4 * side; }
}

public class TestShape {
    public static void main(String args[]) {
        Shape c = new Circle(5);
        System.out.println("Circle Area: " + c.area());
        
        Shape r = new Rectangle(4, 5);
        System.out.println("Rectangle Perimeter: " + r.perimeter());
    }
}