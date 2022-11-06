import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B");
        int sideB = scanner.nextInt();
        System.out.println("Enter side C");
        int sideC = scanner.nextInt();

        double halfPerimeter = (double) (sideA + sideB + sideC) / 2;
//        double halfPerimeter = (sideA + sideB + sideC) / 2.0;
        double trianglePerimeter = Math.sqrt(halfPerimeter);

        System.out.println("Perimeter of the Triangle: " + trianglePerimeter);
    }
}
