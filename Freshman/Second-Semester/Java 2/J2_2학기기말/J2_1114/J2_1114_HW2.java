
//������ �ϱ� ���ؼ� ���� �޼ҵ带 ���� Compare �������̽�
interface Compare {
	public int comparing(Object o);
}

//�������� ���� Ars Ŭ������ �� ��ü�� �´� ���� �޼ҵ� descending
class Ars {
	//Compare �������̽��� ������ Ŭ������ �� �� �ֵ��� Ŭ���� ���׸� �޼ҵ� ����
	public static <T extends Compare>void descending(Compare[] o) {
		int max, i, j;
		
		for(i = 0; i < o.length-1; i++) {
			max = i;
			for(j = 1+i; j < o.length; j++) {
				if(o[i].comparing(o[j]) > 0) max = j;
			}
			Compare temp = o[i];
			o[i] = o[max];
			o[max] = temp;
		}
	}
}

public class J2_1114_HW2 {
	public static void main(String[] args) {
		
	}
}
