import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;
        double sds = 2.0;
        double hauteur, accel, vitesse, t, t0 = 0, v0 = 0;
        hauteur = h0;
        vitesse = v0;
        accel = g;
        t = t0;
        double s = (sds / masse);
        int x = 0;
        int c = 0;
        int y = 0;
        while (hauteur > 0) {
        	System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        	t++;
        	double q = Math.exp(-s * (t - t0));
        	vitesse = (g / s) * (1 - q) + v0 * q;
        	hauteur = h0 - (g / s) * (t - t0) - (((v0 - g / s)) / s) * (1 - q);
        	accel = g - s * vitesse;        	
        	if ( vitesse > 343) {
        		if (x == 0) {
        			System.out.println("## Felix depasse la vitesse du son");
        			x = 1;
        		} 
        	}
        	if (accel < 0.5) {
        		if (c == 0) {
        			System.out.println("## Felix a atteint sa vitesse maximale");
        			c = 1;
        		}
        	}
        	if (hauteur <  2500) {
        		if (y == 0) {
        			sds = 25.0;
            		s = (sds / masse);
            		h0 = hauteur;
            		t0 = t;
            		v0 = vitesse;
            		System.out.println("## Felix ouvre son parachute");
        			y = 1;
        		} 
        	}
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}