import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows & Col : ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] array = new int[row][col];
		System.out.println("Enter the elements :");

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				array[i][j] = 5;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}