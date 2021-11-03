import java.util.*;

//�ѱ��� ���� ���� Word Ŭ����
class Word {
	private String mean;
	//������
	public Word(String mean) { this.mean = mean; }
	public String toString() { return mean; }
}

public class J2_1121_HW1 {
	public static void main(String[] args) {
		//String�̶� Word mapping �ϴ� ��ü ����
		Map<String, Word> dc = new HashMap<String, Word>();
		Scanner sc = new Scanner(System.in);
		//��ɿ� ���� ��ư ����
		int menu;
		//���ܾ�
		String word;
		//���ܾ� �� ���� �ʵ�
		Word mean;
		//while ���� �˻���ɿ� ���̴� true false
		boolean cnd = true, find;
		
		while(cnd) {
			System.out.print("���ϴ� ����� �����ϼ���(1: �ܾ� �˻�, 2: �ܾ� �߰�, 3: �ܾ� ����, 4: �ܾ� ���) : ");
			menu = sc.nextInt();
			
			switch(menu) {
			//�ܾ� �˻�
			case 1:
				find = false;
				System.out.print("�˻��� ���ܾ �Է��ϼ��� : ");
				word = sc.next();
				//Map �� ���� ���ܾ�, ���� key �� value �� �޾Ƽ� 
				//�Է¹��� word �� key ���� ������ ���, find = true 
				//�ٸ��� false �� ä�� ���Ƽ� �������� �ʴ´ٴ� �� ���
				for(Map.Entry<String, Word> s : dc.entrySet()) {
					String key = s.getKey();
					Word value = s.getValue();
					if(word.equals(key)) {
						find = true;
						System.out.println(word + "�� ���� " + value + " �Դϴ�.");
					}
				}
				if(find == false)
					System.out.println(word + "�� ������ �������� �ʽ��ϴ�.");
				break;
			//�ܾ� �߰�
			case 2:
				//�⺻���� �ܾ� �߰�
				System.out.print("�߰��� ���ܾ �Է��ϼ��� : ");
				word = sc.next();
				System.out.print("���ܾ��� ���� �Է��ϼ��� : ");
				mean = new Word(sc.next());
				//���ܾ�� ���� �޾Ƽ� Map ��ü dc �� ����
				dc.put(word, mean);
				break;
			//�ܾ� ����
			case 3:
				//�Է¹��� ���ܾ �´� key �� �ش��ϴ� ���� ����
				System.out.print("������ ���ܾ �Է��ϼ��� : ");
				dc.remove(sc.next());
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			//�ܾ� ����Ʈ ���
			case 4:
				//key �� value �� ���ܾ�� ���� �޾Ƽ� �� ���ܾ �´� �� ���
				for(Map.Entry<String, Word> s : dc.entrySet()) {
					String key = s.getKey();
					Word value = s.getValue();
					System.out.println(key + " : " + value);
				}
				break;
			default:
				//�̻��� �� �� �� �� �� �� ��
				System.out.println("�̻��� �� �ν�");
				cnd = false;
				continue;
			}
		}
	}
}
