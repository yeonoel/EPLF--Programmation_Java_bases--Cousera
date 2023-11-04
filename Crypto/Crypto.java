import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i = 0; i < s.length(); ++i) {
        	Character c = s.charAt(i);
        	int indexCahr = ALPHABET.indexOf(c);
        	if (indexCahr != -1 || Character.isWhitespace(c)) {
        		aCoder += c;
        	}
        }
        if (aCoder.length() > 0) {
        	for (int i = 0; i < aCoder.length(); ++i) {
            	Character c = aCoder.charAt(i);
            	
            	if (Character.isWhitespace(c)){
            		chaineCodee += ' ';
            	} else {
            		int index = ALPHABET.indexOf(Character.toLowerCase(c));
            		if ( index != -1) {
            			int indexvalue = (index + 4) % ALPHABET.length();
                		Character newChar = ALPHABET.charAt(indexvalue);
                		chaineCodee += newChar;
            		}
            		
            	}
            	
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}