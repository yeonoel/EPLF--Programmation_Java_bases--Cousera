
import java.util.Scanner;
public class Degre2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double a = 0.0, b = 0.0, c = 0.0;
		
		// tant que a est null demander une valeur a l'utilisateur
		while(a == 0.0) {
			System.out.print(" Entrer une valeur non null pour a: ");
			a = scanner.nextDouble();
		}
		
		System.out.print("Entrer Une valeur pour b: ");
		b = scanner.nextDouble();
		System.out.print("Entrer Une valeur pour c: ");
		c = scanner.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if (delta < 0.0) {
			System.out.println("Pas de solutions reelles");
		}else if (delta  > 0.0) {
			System.out.println("Deux solutions : "
					+ (- b - Math.sqrt(delta)) / (2.0 * a)
					+ "et" + (- b + Math.sqrt(delta)) / (2.0 * a));
		} else {
			System.out.println("Une solution unique"
					+ (-b / (2.0 * a)));
		}
	}
}
