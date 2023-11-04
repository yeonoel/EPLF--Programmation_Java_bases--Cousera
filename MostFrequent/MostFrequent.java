class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int x,t;
        x = 0;
        t = 0;
        for(int i = 0; i < taille; i++) {
        	int n = 0;
        	for(int j = 0; j < taille; j++) {
            	if (tab1[i] == tab1[j]) {
            		n++;
            	}
            }
        	if (i == 0) {
        		x = n;
        		t = tab1[i];
        	} else if( n > x) {
        		x = n;
        		t = tab1[i];
        	}
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le : ");
        System.out.println(t + " ("+ x + " x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}