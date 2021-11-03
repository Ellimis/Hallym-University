import java.util.*;

public class RosterTest {
	interface CheckPerson {
		boolean test(Person p);
	}
	
	//메소드1 : List에서 age 보다 많은 나이의 사람 출력하기
	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for(Person p : roster) {
			if(p.getAge() >= age) {
				p.printPerson();
			}
		}
	}
	
	//메소드 2 : List에서 low 보다 많고 high 보다 적은 나이의 사람 출력
	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for(Person p : roster) {
			if(low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}
	
	//메소드 3 : List에서 조건에 맞는 사람 출력
	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for(Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}
	
	public static void main(String[] args) {
		List<Person> roster = new ArrayList<>();
		
		roster.add(new Person("Fred", 1980, 'M'));
		roster.add(new Person("Jane", 1990, 'F'));
		roster.add(new Person("George", 1991, 'M'));
		roster.add(new Person("Bob", 2000, 'M'));
		
		for(Person p : roster) {
			p.printPerson();
		}
		
		System.out.println();
		
		//메소드 1 사용 : 20살 이상 사람 출력
		System.out.println("Persons older than 20 : ");
		printPersonsOlderThan(roster, 20);
		System.out.println();
		
		//메소드 2 사용 : 14살 이상, 30살 이하의 사람 출력
		System.out.println("Persons between the ages of 14 and 30 : ");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();
		
		//메소드 3 사용 : 18살 이상, 25살 이하의 남성 출력
		System.out.println("Persons who are eligible for Selective Service : ");
		
		//방법 1 : 일반적인 방법 - CheckPerson을 구현하는 클래스를 구현한 뒤, test 메소드를 구현하여 사용한다.
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == 'M'
						&& p.getAge() >= 18
						&& p.getAge() <= 25;
			}
		}
		
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		System.out.println();
		
		//방법 2 : 무명 클래스 이용 - 무명 클래스로 CheckPerson을 구현하는 클래스를 구현한 , test 메소드를 구현하여 사용한다.
		System.out.println("Persons who are eligible for Selective Service " + "(anonymous class) : ");
		printPersons(roster, new CheckPerson() { public boolean test(Person p) { return p.getGender() == 'M' && p.getAge() >= 18 && p.getAge() <= 25;}});
		System.out.println();
		
		//방법 3 : 람다식을 이용 - 람다식을 이용하여 바로 메소드에 람다식을 전달할 수 있다.
		System.out.println("Persons who are eligible for Selective Service " + "(lambda expression)");
		printPersons(roster, (Person p) -> p.getGender() == 'M' && p.getAge() >= 18 && p.getAge() <= 25);
	}
}
