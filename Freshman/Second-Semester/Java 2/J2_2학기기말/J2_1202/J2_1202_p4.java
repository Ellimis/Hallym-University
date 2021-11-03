
class Counter1 {
	private int value = 0;
	
	public synchronized void increment() { value++; }
	public synchronized void decrement() { value--; }
	public synchronized void printCounter() {
		System.out.println(value);
	}
}

class MyThread1 extends Thread {
	Counter1 sharedCounter;
	
	public MyThread1(Counter1 c) {
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

public class J2_1202_p4 {
	public static void main(String[] args) {
		Counter1 c = new Counter1();
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
	}
}
