package Es2;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserire un numero");
		int n = s.nextInt();
		
		String res = "Il numero è ";
		switch(n) {
		case 0: {
			res += "ZERO";
			break;
		}
		case 1: {
			res += "UNO";
			break;
		}
		case 2: {
			res += "DUE";
			break;
		}
		case 3: {
			res += "TRE";
			break;
		}
		default : {
			res = "Il numero non è compreso tra 0 e 3";
		}
		}
		System.out.println(res);
	}
}
