import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int no = sc.nextInt();

        for (int p = 2; p < no; p++) {
            while (no % p == 0) {
                System.out.println(p + " ");
                no = no / p;
            }
        }
        if (no > 2) {
            System.out.println(no);
        }
    }
}