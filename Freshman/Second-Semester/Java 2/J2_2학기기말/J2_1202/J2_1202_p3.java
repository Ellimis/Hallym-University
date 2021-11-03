
class Counter {
	private int value = 0;
	
	public void increment() { value++; }
	public void decrement() { value--; }
	public void printCounter() {
		System.out.println(value);
	}
}

class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		this.sharedCounter = c;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			sharedCounter.increment();
			sharedCounter.decrement();
			sharedCounter.printCounter();
			try {
				sleep(100);
			} catch(InterruptedException e) { }
		}
	}
}

public class J2_1202_p3 {
	public static void main(String[] args) {
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}
}
