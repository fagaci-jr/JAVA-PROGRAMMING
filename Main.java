class Shape {
    void area() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    double l = 4, w = 3;

    void area() {
        System.out.println("Area of Rectangle: " + (l * w));
    }
}

class Triangle extends Shape {
    double b = 6, h = 2;

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(),
            new Rectangle(),
            new Triangle()
        };

        for (Shape s : shapes) {
            s.area();
        }
    }
}