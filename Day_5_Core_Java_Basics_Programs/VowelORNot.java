import java.util.Scanner;

public class VowelORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        char a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') {
            System.out.println("The " + a + " is Vowel");

        } else if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
            System.out.println("The " + a + " is Consonant");
        else
            System.out.println("Not an alphabet");
    }
}
