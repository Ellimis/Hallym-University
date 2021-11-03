//이름과 id 를 가지는 Person 클래스
public class Person {
	protected int id;
	protected String name;
	
	public Person(int i, String n) {
		id = i;
		name = n;
	}
	
	//Person 객체의 Id 와 Name 을 반환할 메소드
	public int getId() { return id; }
	public String getName() { return name; }
	
	//출력
	public String toString() {
		return "Id : " + id + " Name : " + name;
	}
}
