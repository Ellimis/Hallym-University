import java.util.*;

public class J2_1121_P4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add("��");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {
			s = (String) e.next();
			System.out.println(s);
		}
	}
}
