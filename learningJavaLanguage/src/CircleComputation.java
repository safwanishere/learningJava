import java.util.Scanner;

public class CircleComputation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();
        scan.close();

        double diameter = 2.0 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }
}
