import java.util.ArrayList;


public class Premiers {
	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		for (int n = 2; n <= 100; ++n) {
			
			if (n % 2 == 0) {
				if (n == 2) {
					tab.add(n);
				}
			} else {
				Boolean t = true;
				double x = Math.sqrt(n);
				for (int i = 3; i <= x; i += 2){
					if (n % i == 0) {
						t = false;
					}
				}
				if (t) {
					tab.add(n);
					t = true;
				}
					
			}
			
			
		}
		
		for (int j : tab) {
			System.out.println(j);
		}
	}

}
