import java.util.Scanner;

public class DistanceCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point A & B : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double DistCal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The Distance is :  " + DistCal);
    }
}
