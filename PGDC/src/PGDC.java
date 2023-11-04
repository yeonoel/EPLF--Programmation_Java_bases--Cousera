import java.util.Scanner;

public class PGDC {
	public static void main(String[] args) {
			Scanner clavier = new Scanner(System.in);
			int a, b, result = 0;
			int y, z;
			do {
				System.out.print("Entrez un nombre positif : ");
				a = clavier.nextInt();
				System.out.print("Entrez un nombre positif : ");
				b = clavier.nextInt();
			}while(a < 0 || b < 0);
			
			y = a;
			z = b;
			if ( a == b) {
				result = a;
			} else {
				do {
					int tempo;
					if (a < b) {
						int x = a;
						a = b;
						b = x;
					}
					a = a - b;
					tempo = a;
					a = b;
					b = tempo;
					
				} while (a != b);
				
				result = a;
			}
			
			System.out.println("Le plus grand diviseur commun de " + y + " et " + z + " est " + result);
	}
}
