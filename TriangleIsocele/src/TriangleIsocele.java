import java.util.Scanner;


public class TriangleIsocele {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.print("Entree un nombre ");
		int nb = keyb.nextInt();
		
		for( int i = 1; i <= nb; ++i) {
			for (int j = 1; j <= nb - i; ++j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
