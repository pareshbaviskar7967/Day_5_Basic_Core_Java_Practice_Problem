import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int b = year % 4;
        if (b == 0) {
            System.out.println("year is leap year");
        } else {
            System.out.println("year is not leap year");
        }
    }
}