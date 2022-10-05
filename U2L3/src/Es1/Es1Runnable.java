package Es1;

public class Es1Runnable implements Runnable {
	
	private String ch;
	
	public static void main(String[] args) {
		Es1Runnable r1 = new Es1Runnable("*");
		Es1Runnable r2 = new Es1Runnable("#");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
	public Es1Runnable(String ch) {
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(this.ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
