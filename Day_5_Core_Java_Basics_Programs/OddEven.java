import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 no : ");
        int a = sc.nextInt();
        if (a % 2 == 1)
            System.out.println("Enter no is odd.");
        else
            System.out.println("Enter no is even.");
    }
}