
//정렬을 하기 위해서 비교할 메소드를 가진 Compare 인터페이스
interface Compare {
	public int comparing(Object o);
}

//내림차순 정렬 Ars 클래스와 각 객체에 맞는 정적 메소드 descending
class Ars {
	//Compare 인터페이스를 구현한 클래스만 쓸 수 있도록 클래스 제네릭 메소드 제작
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
