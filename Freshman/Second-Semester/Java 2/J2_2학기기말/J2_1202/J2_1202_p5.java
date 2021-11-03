
class Buffer {
	//�����ڷκ��� �Һ��ڷ� �������� ������
	private int data;
	
	//�Һ��ڰ� ��ٸ��� ������ true
	//�����ڰ� ��ٸ��� ������ false
	private boolean empty = true;
	
	public synchronized int get() {
		//����ũ�� ����� ������ ��ٸ���.
		while(empty) {
			try {
				wait();
			} catch(InterruptedException e) { }
		}
		//���¸� �ٲ۴�.
		empty = true;
		//�����ڸ� �����.
		notifyAll();
		return data;
	}
	
	public synchronized void put(int data) {
		//����ũ�� �Һ�� ������ ��ٸ���.
		while(!empty) {
			try {
				wait();
			} catch(InterruptedException e) { }
		}
		empty = false;
		this.data = data;
		//�Һ��ڸ� �����.
		notifyAll();
	}
}

class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		//���� ���� ������ �����Ѵ�.
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			buffer.put(i);
			System.out.println("������ : " + i + "�� ������ �����Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}

class Consumer implements Runnable {
	private Buffer buffer;
	
	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			int data = buffer.get(); //���ۿ��� ����ũ�� �����´�.
			System.out.println("�Һ��� : " + data + "�� ������ �Һ��Ͽ����ϴ�.");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) { }
		}
	}
}

public class J2_1202_p5 {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}
}
