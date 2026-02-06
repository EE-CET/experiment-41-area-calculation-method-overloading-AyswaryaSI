import java.util.Scanner;

class AreaCalculator {
    void calculateArea(float radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("%.2f\n", area);
    }
    void calculateArea(float length, float breadth) {
        double area = length * breadth;
        System.out.printf("%.2f\n", area);
    }
    void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.printf("%.2f\n", area);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();
        float radius = sc.nextFloat();

        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        obj.calculateArea(radius);
        obj.calculateArea(length, breadth);
        obj.calculateArea(base, height);

        sc.close();
    }
}
