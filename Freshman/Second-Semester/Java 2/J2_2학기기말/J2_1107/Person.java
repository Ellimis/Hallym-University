
//Compare 인터페이스를 받는 Person 클래스
public class Person implements Compare{
	protected String name;
	
	//생성자
	public Person() {
		name = "";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	//이름비교
	public int comparing(Object p) {
		return this.name.compareTo(((Person)p).name);
	}
}
