import java.util.*;

public class LambdaTest3_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("AAA");
		list.add("bbb");
		list.add("CCC");
		list.add("ddd");
		list.add("EEE");
		
		//��ҹ��ڸ� �����ϴ� ����
		Collections.sort(list);
		
		System.out.println("��ҹ��ڸ� ������ ���� : ");
		System.out.println(list);
		
		//��ҹ��ڸ� �������� �ʴ� ����
		//��� 2 : ���� Ŭ���� - Comparator �� �����ϴ� ���� Ŭ������ ����Ѵ�.
		Collections.sort(list,  new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		
		System.out.println("��ҹ��ڸ� �������� ���� ���� : ");
		System.out.println(list);
	}
}
