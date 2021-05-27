import java.util.Scanner;

public class WindChillCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the T(temperature in 1-50) and V(Speed in 3-120) : ");
        double t = sc.nextDouble();
        double v = sc.nextDouble();

        if (t <= 50 && (v <= 120 && v > 3)) {
            // result in different by this formula->double windchill=35.74+Math.pow(0.62151,
            // t)+((Math.pow(0.4275,t)+35.75)*(Math.pow(v,0.16)));

            double windchill = 35.74 + 0.62151 * t + ((0.4275 * t) + 35.75) * (Math.pow(v, 0.16));
            System.out.println("Windchill is = " + windchill);
        } else {
            System.out.println("Enter t in betwen1-50 or v in between 3-120");
        }
    }

}
