public class Area{
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + areaOfCircle(5));
        System.out.println("Area of Rectangle: " + areaOfRectangle(4, 6));
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }
}