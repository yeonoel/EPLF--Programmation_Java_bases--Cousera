import java.util.Scanner;

public class MulMat {
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		double[][] mat1;
		double[][] mat2;
		int ligne1, colonne1, ligne2, colonne2;
		double val = 0;
		
		System.out.println("Saisie de la 1ère matrice : ");
		System.out.print("Nombre de lignes : ");
		ligne1 = clavier.nextInt();
		System.out.print("Nombre de colonnes : ");
		colonne1 = clavier.nextInt();
		mat1 = new double[ligne1][colonne1];		
		for (int i = 0; i < ligne1; i++) {
			for (int j = 0; j < colonne1; j++) {
				System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
				mat1[i][j] = clavier.nextDouble();
			}
		}
		
		System.out.print("Saisie de la 2ème matrice : ");
		System.out.print("Nombre de lignes : ");
		ligne2 = clavier.nextInt();
		System.out.print("Nombre de colonnes : ");
		colonne2 = clavier.nextInt();
		mat2 = new double[ligne2][colonne2];
		for (int i = 0; i < ligne2; i++) {
			for (int j = 0; j < colonne2; j++) {
				System.out.print("M[" + (i + 1) + "," + (j + 1) + "] = ");
				mat2[i][j] = clavier.nextDouble();
			}
		}
		if (ligne2 != colonne1) {
			System.out.println("Multiplication de matrices impossible !");
		}
		
		double[][] M = new double[ligne1][colonne2];
		
		
		for (int i = 0; i < ligne1; i++) {
			for (int j = 0; j < colonne1; j++) {
				double sum = 0;
				for (int k = 0; k < colonne1; k++) {
					sum += mat1[i][k] * mat2[k][j];
				}
				M[i][j] = sum;
			}
		}
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println(M[i][j]);
				
			}
		}
	}
}
