import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		String chaine;
		do {
			System.out.print("Entrez un mot ou une phrase : ");
			chaine = clavier.nextLine();
		} while( chaine.length() == 0);
		chaine = chaine.toLowerCase();
		ArrayList<Character> tab = new ArrayList<Character>();
		
		for (int i = 0; i < chaine.length(); ++i) {
			char c = chaine.charAt(i);
			if (Character.isLetter(c)) {
				tab.add(c);
			}
		}
		Boolean tested = true;
		for (int i = 0; i < tab.size(); ++i) {
			Character c = tab.get(i);
			if (c.equals(tab.get(tab.size() - i - 1))) {
				tested = false;
			}
		}
		
		if (!tested) {
			System.out.println("C'est un palindrome !");
		} else {
			System.out.println("Ce n'est un palindrome !");
		}
	}	
}
