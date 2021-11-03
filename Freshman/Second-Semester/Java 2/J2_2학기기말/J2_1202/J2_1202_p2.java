
public class J2_1202_p2 {
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + ": " + message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run() {
			try {
				for(int i = 0; i < 10; i++) {
					print(Integer.toString(i));
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				print("���� ������ �ʾҾ��!");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		int tries = 0;
		print("�߰����� �����带 �����մϴ�.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		print("�߰����� �ѷ��尡 �����⸦ ��ٸ��ϴ�.");
		while(t.isAlive()) {
			print("���� ��ٸ��ϴ�.");
			t.join(1000);
			tries++;
			if(tries > 2) {
				print("���� �� ���׿�!");
				t.interrupt();
				t.join();
			}
		}
		print("���� ������ ����!");
	}
}
