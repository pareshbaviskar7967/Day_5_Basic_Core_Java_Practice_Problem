import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 no : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2 no : ");
        int b = sc.nextInt();
        int c;
        System.out.println("B4 swapping : " + a + " & " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping : " + a + " & " + b);
    }
}
