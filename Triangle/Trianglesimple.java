import java.util.Scanner;

public class Trianglesimple {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.print("Entree un nombre ");
		int nb = keyb.nextInt();
		
		for( int i = 1; i <= nb; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
