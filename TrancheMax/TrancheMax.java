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
        // Ces numéros de lignes sont stockés dans un tableau dynamique
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
    	if (matrice.trim().isEmpty()) {
    		System.out.println("Matrice vide !");
    		return false;
    	}
    	String[] lignes = matrice.trim().split(" {1,}");
    	int j = 0;
    	for (int i = 0; i < lignes.length; ++i) {
    		if (lignes[j].length() != lignes[i].length()) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean checkFormat(String matrice) {
    		String[] lignes = matrice.trim().split(" {1,}");
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
        String[] lignes = matrice.trim().split(" {1,}");
        ArrayList<Integer> maxConsecutifList = new ArrayList<>();
        int maxConsecutifs = -1;

        for (int i = 0; i < lignes.length; ++i) {
            int consecutifs = 0;
            int maxConsecutifsLigne = 0;
            for (int j = 0; j < lignes[i].length(); ++j) {
                char caractere = lignes[i].charAt(j);
                if (caractere == '1') {
                    consecutifs++;
                    if (consecutifs > maxConsecutifsLigne) {
                        maxConsecutifsLigne = consecutifs;
                    }
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