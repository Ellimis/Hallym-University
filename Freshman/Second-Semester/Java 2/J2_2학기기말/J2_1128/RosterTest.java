import java.util.*;

public class RosterTest {
	interface CheckPerson {
		boolean test(Person p);
	}
	
	//�޼ҵ�1 : List���� age ���� ���� ������ ��� ����ϱ�
	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for(Person p : roster) {
			if(p.getAge() >= age) {
				p.printPerson();
			}
		}
	}
	
	//�޼ҵ� 2 : List���� low ���� ���� high ���� ���� ������ ��� ���
	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for(Person p : roster) {
			if(low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}
	
	//�޼ҵ� 3 : List���� ���ǿ� �´� ��� ���
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
		
		//�޼ҵ� 1 ��� : 20�� �̻� ��� ���
		System.out.println("Persons older than 20 : ");
		printPersonsOlderThan(roster, 20);
		System.out.println();
		
		//�޼ҵ� 2 ��� : 14�� �̻�, 30�� ������ ��� ���
		System.out.println("Persons between the ages of 14 and 30 : ");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();
		
		//�޼ҵ� 3 ��� : 18�� �̻�, 25�� ������ ���� ���
		System.out.println("Persons who are eligible for Selective Service : ");
		
		//��� 1 : �Ϲ����� ��� - CheckPerson�� �����ϴ� Ŭ������ ������ ��, test �޼ҵ带 �����Ͽ� ����Ѵ�.
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == 'M'
						&& p.getAge() >= 18
						&& p.getAge() <= 25;
			}
		}
		
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		System.out.println();
		
		//��� 2 : ���� Ŭ���� �̿� - ���� Ŭ������ CheckPerson�� �����ϴ� Ŭ������ ������ , test �޼ҵ带 �����Ͽ� ����Ѵ�.
		System.out.println("Persons who are eligible for Selective Service " + "(anonymous class) : ");
		printPersons(roster, new CheckPerson() { public boolean test(Person p) { return p.getGender() == 'M' && p.getAge() >= 18 && p.getAge() <= 25;}});
		System.out.println();
		
		//��� 3 : ���ٽ��� �̿� - ���ٽ��� �̿��Ͽ� �ٷ� �޼ҵ忡 ���ٽ��� ������ �� �ִ�.
		System.out.println("Persons who are eligible for Selective Service " + "(lambda expression)");
		printPersons(roster, (Person p) -> p.getGender() == 'M' && p.getAge() >= 18 && p.getAge() <= 25);
	}
}
