package Es1;

import java.util.Scanner;

public class Esercizio1 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		//PariDispari
		//inputStringPariDispari();
		//Anno Bisestile
		inputAnnoBisestile();
		scanner.close();
		
	}
	
	//Prende in input una stringa e ne controlla in
	public static void inputStringPariDispari() {
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire la stringa da controllare");
		String s = scanner.nextLine();
		if(stringaPariDispari(s)) {
			System.out.println("La stringa " + s + " ha un numero di caratteri pari" );
		} else {
			System.out.println("La stringa " + s + " ha un numero di caratteri dispari" );
		}
		
		scanner.close();
	}
	
	private static boolean stringaPariDispari(String s) {
		/*
		int l = s.length();
		
		if((s.length() % 2) == 0) {
			
		}
		
		if(l % 2 == 0) {
			return true;
		}
		
		return false;*/
		
		return (s.length() % 2 == 0);
	}
	
	private static boolean annoBisestile(int anno) {
		/*
		if(anno % 4 == 0) {
			return true;
		}
		
		if(anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}*/
		/*
		if((anno % 4 == 0) || ( anno % 400 == 0 && anno % 100 == 0)) {
			return true;
		}
		
		return false;*/
		/*
		boolean divisibilePerQuattro = anno % 4 == 0;
		boolean divisibilePerCentoQuattrocento = anno % 400 == 0 && anno % 100 == 0;
		if(divisibilePerQuattro || divisibilePerCentoQuattrocento) {
			return true;
		}
		return false;*/
		
		
		return (anno % 4 == 0) || ( anno % 400 == 0 && anno % 100 == 0);
	}
	
	public static void inputAnnoBisestile() {
		System.out.println("Inserire l'annod a controllare");
		int anno = scanner.nextInt();
		if(annoBisestile(anno)) {
			System.out.println("L'anno è bisestile");
		} else {
			System.out.println("L'anno NON è bisestile");
		}
		
	}
}
