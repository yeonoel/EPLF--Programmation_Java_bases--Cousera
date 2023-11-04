import java.util.Scanner;

public class Pret {
	public static void main(String[] args) {
		int s0, r, m;
		double ir;
		int s = 0;
		int tauxInteret = 0;
		Scanner keyb = new Scanner(System.in);
		
		do {
			System.out.print("Entrée le montant total à payer: ");
			s0 = keyb.nextInt();
			while(s0 <= 0) {
				System.out.print(" ");
				s0 = keyb.nextInt();
			}
			
			System.out.print("Entrer le montant a payer chaque mois: ");
			r = keyb.nextInt();
			while(r <= 0) {
				System.out.print("Entrer le montant a payer chaque mois: ");
				r = keyb.nextInt();
			}
			
			System.out.print("Entree le taux d'intérêt : ");
			ir = keyb.nextDouble();
			while(ir <= 0.0 || ir >= 1.0) {
				System.out.print("Entree le taux d'intérêt : ");
				ir = keyb.nextDouble();
			}
			
		} while( r <= 0 || s0 <= 0 || (ir <= 0.0 || ir  >= 1.0));
		
		m = s0 / r;
		for (int i = 0; i < m; ++i ) {
			s = s0 - s;
			tauxInteret += (ir * s); 
		}
		System.out.println(tauxInteret);
		
		
	}
}
