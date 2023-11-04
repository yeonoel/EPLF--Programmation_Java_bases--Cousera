import java.util.Scanner;

public class Scalaire {
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		int nMax = 15;
		int n;
		do {
			System.out.print("Entrer la taille effective des vecteurs: ");
			n = clavier.nextInt();
		} while ( n < 1 || n > nMax);
		
		int [] v1 = new int[n];
		int [] v2 = new int[n];
		int result = 0;
		int j = 0;
		
		while( j < n ) {
			System.out.print("Entrer v1" + "["+ j +"] :");
			v1[j] = clavier.nextInt();
			j++;
		};
		j = 0;
		System.out.println();
		while( j < n ) {
			System.out.print("Entrer v5" + "["+ j +"] :");
			v2[j] = clavier.nextInt();
			j++;
		};
		for (int i = 0; i < n; ++i) {
				result += v1[i] * v2[i];
		}
		
		System.out.println(result);
	}

}
