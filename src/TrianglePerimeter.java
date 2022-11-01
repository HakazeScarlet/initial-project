import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A");
        double sideA = scanner.nextInt();
        System.out.println("Enter side B");
        double sideB = scanner.nextInt();
        System.out.println("Enter side C");
        double sideC = scanner.nextInt();

        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double trianglePerimeter = Math.sqrt(halfPerimeter);

        System.out.println("Perimeter of the Triangle: " + trianglePerimeter);
    }
}
