// Define the interface Area
interface Area {
    double calculateArea();  // Method to calculate area
}

// Class for Rectangle
class Rectangle implements Area {
    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement calculateArea method
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Class for Circle
class Circle implements Area {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class for Triangle
class Triangle implements Area {
    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create objects of Rectangle, Circle, and Triangle
        Area rectangle = new Rectangle(10, 5);
        Area circle = new Circle(7);
        Area triangle = new Triangle(6, 8);

        // Print the areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
