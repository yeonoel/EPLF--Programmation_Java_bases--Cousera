import java.util.Scanner;

public class PyramideInversee {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.print("Entree un nombre ");
		int nb = keyb.nextInt();
		
		for( int i = 1; i <= nb; ++i) {
			int x = 0;
			for (int j = 1; j <= nb - i; ++j) {
				System.out.print(" ");
				x = nb - j;
			}
			for (int j = 1; j <= x; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
