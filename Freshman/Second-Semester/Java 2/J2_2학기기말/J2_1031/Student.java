//Person�� ��ӹ޴� Student Ŭ����
public class Student extends Person{
	protected Teacher advisor;
	protected int score;
	
	//������
	public Student(int i, String n, int sc) {
		super(i, n);
		score = sc;
		
	}
	
	//score ��ȯ
	public int getScore() {
		return score;
	}
	
	//score �ٲٴ� �޼ҵ�
	public void changeScore(int sc) {
		score = sc;
	}
	
	//�л����� Ư�� ���� �����ִ� �޼ҵ�
	public void setAdvisor(Teacher tConect) {
		advisor = tConect;
	}
	
	//�л��� Ư�� ������ ��ȯ
	public Teacher getAdvisor() {
		return advisor;
	}
	
	//���
	public String toString() {
		return (super.toString() + " Score : " + score);
	}
}
