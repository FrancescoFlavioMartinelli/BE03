package Es2;

import java.util.Random;

public class SingleThread {
	
	public static void main(String[] args) {
		int[] arr = new int[3000];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		
		//
		long inizio = System.nanoTime();
		int tot = 0;
		for(int i = 0; i< arr.length; i++) {
			tot += arr[i];
		}
		System.out.println(tot);
		System.out.println(System.nanoTime() - inizio);
		//447089
	}

}
