package Es4;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserire un munero intero");
		int n = s.nextInt();
		countdown(n);
	}
	
	private static void countdown(int n) {
		for(int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
