package ex1;
import java.util.Scanner;

public class Brief_1 {
	
	static Scanner input = new Scanner(System.in);

	static String welcome() {
		String text1 = "Quel est votre nom";
		String text2 = "Quel est votre prénom";
		String name;		
		System.out.println("bienvenu ");
		System.out.println(text1);
		name = input.nextLine();
		System.out.println(text2);
		name = name + " " + input.nextLine();
		System.out.println("Bonjour " + name);
		return name;
	}
	static void travaille(String name) {
		double h = 0;
		double t = 0;
		double payer = 0;
		double err = 1;
		
		System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
		h = input.nextInt();
		while(err == 1) {
			if(h <= 60) {
				System.out.println("veuillez introduire le tarif par heure");
				t = input.nextInt();
				err = 0;
			}else if(h > 69) {
				System.out.println("information erronés");
				System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
				h = input.nextInt();
			}
			     else {
			    	System.out.println("number between 60 and 70 isn't consider");
					System.out.println("veuillez introduire le nombre d’heures travaillées cette semain");
					h = input.nextInt();
			     }
		}
		if(h <= 40 ) {
			payer = t * h;
			System.out.println("normal hours");
		}else {
			h = (h - 40);
			payer = 40 * t;
			System.out.println("tu as passer des heurs extra Mr/Mm " + name);
			t =t + (t * 0.5);
			System.out.println("les heurs extra sont "+(int)h+"h");
			System.out.println("le tarif des heurs extra est : "+t+" MAD");
			System.out.println("prix des heurs fix(les 40 heurs) = "+payer+" MAD");
			System.out.println("prime des heurs extra= "+(h * t)+" MAD");
			payer = payer + (h * t);
		}
		
		System.out.println("votre indemnisation est de " + payer + " MAD \n!! programme shutdown !!");
	}
	
	
	public static void main (String[] args) {
		
		
		travaille(welcome());
		
	}
	
}
