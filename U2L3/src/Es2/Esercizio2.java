package Es2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Esercizio2 implements Runnable {
	
	private static int[] arr;
	
	private static int[] totali = new int[3];
	
	private static int instances = 0;
	
	private int startIndex;
	private int tot = 0;
	private int instanceIndex;
	
	public Esercizio2(int s) {
		this.instanceIndex = instances;
		instances++;
		this.startIndex = s;
	}

	@Override
	public void run() {
		long inizio = System.nanoTime();
		for(int i = this.startIndex; i < this.startIndex + 1000; i++) {
			tot += arr[i];
		}
		totali[instanceIndex] = tot;

		System.out.println("thread" + (System.nanoTime() - inizio));
	}
	
	public int getTotale() {
		return tot;
	}
	
	public static void main(String[] args) {
		arr = new int[3000];
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		//
		Esercizio2 r1 = new Esercizio2(0);
		Esercizio2 r2 = new Esercizio2(1000);
		Esercizio2 r3 = new Esercizio2(2000);
		
		/*List<Thread> t = Arrays.asList(new Thread(r1), new Thread(r2), new Thread(r3));
		for(Thread th : t) {
			th.start();
		}*/
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		//TEMPO
		long inizio = System.nanoTime();
		
		
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int tot = 0;
		/*tot += r1.getTotale();
		tot += r2.getTotale();
		tot += r3.getTotale();*/
		/*for(int i = 0; i < totali.length; i++) {
			tot += totali[i];
		}*/
		System.out.println(Arrays.stream(totali).sum());
		
		//FINE TEMPO
		System.out.println("tempo: " + (System.nanoTime() - inizio));
		//1136938
		//1410115
	}

}
