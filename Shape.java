class Shape 
{
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}