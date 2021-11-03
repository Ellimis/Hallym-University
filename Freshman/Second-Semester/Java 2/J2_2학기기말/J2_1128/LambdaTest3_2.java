import java.util.*;

public class LambdaTest3_2 {
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
		//��� 3 : ���ٽ� - ���ٽ��� �̿��Ͽ� �޼ҵ带 �����Ѵ�.
		Collections.sort(list, (o1, o2)->o1.compareToIgnoreCase(o2));
		
		System.out.println("��ҹ��ڸ� �������� ���� ���� : ");
		System.out.println(list);
	}
}
