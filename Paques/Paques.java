import java.util.Scanner;

public class Paques {
	private final static Scanner CLAVIER = new Scanner(System.in);
	
	//Demander l'année de la date de paque
	public static int demanderAnnee() {
		int annee = 0;
		do {
			System.out.println("Entrez une annee (1583-4000) :");
			annee = CLAVIER.nextInt();
		} while(annee < 1583 || annee > 4000);
		return annee;
	}
	
	// Afficher la date
	public static void afficheDate(int annee, int nombreDeJour) {
		System.out.print("Date de Paques en " + annee + " : ");
		int nbrJour = nombreDeJour;
		if (nbrJour <= 31) {
			System.out.print(nbrJour + " mars");
		}else{
			nbrJour -= 31;
			System.out.print(nbrJour + " avril");
		}
	}
	
	// Trouver la date de paque sachant que j'ai l'année
	public static int datePaques(int annee) {
		int siecle = annee / 100;
		int p = (13 + 8 * siecle) / 25;
		int q = siecle / 4;
		int m = (15 - p + siecle - q) % 30;
		int n = (4 + siecle - q) % 7;
		int d = (m + 19 * (annee % 19)) % 30;
		int e = (2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;
		int jour = e + d + 22;
		if (e == 6 && (d == 29 || (d == 28 && (11 * (m + 1) % 30 ) < 19))) {
			jour -= 7;
		}
		return jour;
	}
	
	//Programme principale
	public static void main(String args[]) {
		int annee = demanderAnnee();
		int jour = datePaques(annee);
		afficheDate(annee, jour);
	}
}























import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numÃ©ros de lignes sont stockÃ©s dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    public static boolean checkLineLength(String matrice) {
    	if (matrice.isEmpty()) {
    		System.out.println("Matrice vide !");
    		return false;
    	}
    	String[] lignes = matrice.split(" {1,}");
    	int j = 0;
    	if (lignes[j] == " ") {
    		++j;
    	}
    	for (int i = 0; i < lignes.length; ++i) {
    		if (lignes[j].length() != lignes[i].length()) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean checkFormat(String matrice) {
    		String[] lignes = matrice.split(" {1,}");
    		boolean test = true;
    		for (int i = 0; i < lignes.length; ++i) {
    			for (int j = 0; j < lignes[i].length(); ++j) {
    				char caractere = lignes[i].charAt(j);
            		if (caractere != '0' && caractere != '1' && caractere != ' ') {
            			test = false;
            		}
            	}
    			
        	}
    		if (!test) {
    			System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
    			return false;
    		}
    		if (!checkLineLength(matrice)) {
    			System.out.println("Matrice invalide, lignes de longueurs differentes !");
    			return false;
    		}
    		return true;
    }
    	
    
    public static ArrayList<Integer> findConsecutiveList(String matrice) {
        String[] lignes = matrice.split(" {1,}");
        ArrayList<Integer> maxConsecutifList = new ArrayList<>();
        int maxConsecutifs = -1;

        for (int i = 0; i < lignes.length; ++i) {
            int consecutifs = 0;
            int maxConsecutifsLigne = 0;
            for (int j = 0; j < lignes[i].length(); ++j) {
                char caractere = lignes[i].charAt(j);
                if (caractere == '1') {
                    consecutifs++;
                    maxConsecutifsLigne = Math.max(maxConsecutifsLigne, consecutifs);
                } else {
                    consecutifs = 0;
                }
            }
            if (maxConsecutifsLigne == maxConsecutifs) {
                maxConsecutifList.add(i);
            } else if (maxConsecutifsLigne > maxConsecutifs) {
                maxConsecutifs = maxConsecutifsLigne;
                maxConsecutifList.clear();
                maxConsecutifList.add(i);
            }
        }

        return maxConsecutifList;
    }

    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}