import java.util.*;

class CompImp implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}
}

public class LambdaTest3 {
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
		//��� 1 : �Ϲ����� ��� - Comparator �� �����ϴ� Ŭ������ ����Ѵ�.
		Comparator ci = new CompImp();
		Collections.sort(list, ci);
		// == Collections.sort(list, new CompImp());
		
		System.out.println("��ҹ��ڸ� �������� ���� ���� : ");
		System.out.println(list);
	}
}
