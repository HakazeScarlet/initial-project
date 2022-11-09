import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C");
        double sideC = scanner.nextDouble();

        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double trianglePerimeter = Math.sqrt(halfPerimeter);

        System.out.println("Perimeter of the Triangle: " + trianglePerimeter);
    }
}
