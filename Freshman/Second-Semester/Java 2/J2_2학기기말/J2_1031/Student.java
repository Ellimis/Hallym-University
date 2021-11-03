//Person을 상속받는 Student 클래스
public class Student extends Person{
	protected Teacher advisor;
	protected int score;
	
	//생성자
	public Student(int i, String n, int sc) {
		super(i, n);
		score = sc;
		
	}
	
	//score 반환
	public int getScore() {
		return score;
	}
	
	//score 바꾸는 메소드
	public void changeScore(int sc) {
		score = sc;
	}
	
	//학생에게 특정 교수 정해주는 메소드
	public void setAdvisor(Teacher tConect) {
		advisor = tConect;
	}
	
	//학생의 특정 교수를 반환
	public Teacher getAdvisor() {
		return advisor;
	}
	
	//출력
	public String toString() {
		return (super.toString() + " Score : " + score);
	}
}
