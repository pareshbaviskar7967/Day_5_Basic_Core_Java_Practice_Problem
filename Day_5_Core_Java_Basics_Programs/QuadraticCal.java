import java.util.Scanner;

public class QuadraticCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point A & B & C : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Root 1 :" + root1);
        System.out.println("Root 2 :" + root2);
    }
}
