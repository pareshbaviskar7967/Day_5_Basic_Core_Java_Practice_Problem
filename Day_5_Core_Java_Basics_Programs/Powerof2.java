import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {

        int powerof2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No : ");
        int no = sc.nextInt();
        for (int p = 0; p <= no; p++) {
            System.out.println("No is : " + p + " Power of 2 is : " + powerof2);
            powerof2 = 2 * powerof2;
        }
    }
}