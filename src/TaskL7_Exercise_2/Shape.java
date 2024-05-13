package TaskL7_Exercise_2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();

    default void displayInfo() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill Color: " + getFillColor());
        System.out.println("Border Color: " + getBorderColor());
    }
}
