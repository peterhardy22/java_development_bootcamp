package Resources.Functions;

public class Scope {
    
    public static void main(String[] args) {
        
        double length = 2;
        double width = 4;

        calculateArea(length, width);
        calculatePerimeter(length, width);

    }

    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

}
