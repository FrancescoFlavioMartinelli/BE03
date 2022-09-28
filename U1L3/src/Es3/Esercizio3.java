package Es3;

import java.util.Scanner;

public class Esercizio3 {
	
	public static void main(String[] args) {
		String input;
		Scanner s = new Scanner(System.in);
/*
		do{
			System.out.println("Inserire la stirnga");
			
			input = s.nextLine();
			String[] chars = input.split("");
			
			//for(int i = 0; i < chars.length; i++) {
			//	System.out.print(chars[i] + ",");
			//}
			if(!input.equals(":q")) {
				String commaS = String.join(",", chars);
				System.out.println(commaS);
			}
	}while(!input.equals(":q"));*/
		
		do {
			System.out.println("Inserire la stirnga");
	
			input = s.nextLine();
			String[] chars = input.split("");
			if(input.equals(":q")) {
				break;
			}
			String commaS = String.join(",", chars);
			System.out.println(commaS);
		} while(true);
		
	}
	
	

}
