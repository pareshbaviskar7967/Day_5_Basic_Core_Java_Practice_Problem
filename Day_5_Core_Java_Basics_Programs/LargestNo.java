import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 no : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2 no : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3 no : ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The no : " + a + " Largest no");
        } else if (b > a && b > c) {
            System.out.println("The no : " + b + " Largest no");
        } else {
            System.out.println("The no : " + c + " Largest no");
        }
    }
}