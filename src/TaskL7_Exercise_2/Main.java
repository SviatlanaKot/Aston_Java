package TaskL7_Exercise_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Brown");

        System.out.println("Circle:");
        circle.displayInfo();
        System.out.println();

        System.out.println("Rectangle:");
        rectangle.displayInfo();
        System.out.println();

        System.out.println("Triangle:");
        triangle.displayInfo();
        System.out.println();
    }
}
