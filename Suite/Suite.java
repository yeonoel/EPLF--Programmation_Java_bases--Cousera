import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int c;
        int n;
        for (int j = debut; j <= fin; ++j ) {
        	n = j;
        	c = 0;
        	do {
                	if ( n % 3 == 0) {
                		n += 4;
                		c++;
                	} else if(n % 3 != 0) {
                		if (n % 4 == 0) {
                			n /= 2;
                			c++;
                		}else {
                			n -= 1;
                			c++;
                		}
                	}
                } while( n > 0);
        	System.out.println(j + " -> " + c );
        	
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
