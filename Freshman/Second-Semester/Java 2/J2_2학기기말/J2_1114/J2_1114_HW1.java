
//제네릭 클래스 Array
class Array<T> {
	private T[] arr;
	
	//생성자
	public Array(T[] arr) {
		this.arr = arr;
	}
	
	//원하는 값을 반환하는 메소드들
	public T getFirst() { return arr[0]; }
	public T getLast() { return arr[arr.length-1]; }
	public T getElement(int i) { return arr[i]; }
	
	//배열로 들어온 정보 출력
	public String toString() {
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			str += " ";
		}
		return str;
	}
}

public class J2_1114_HW1 {
	public static void main(String[] args) {
		//integer 배열 생성
		Integer[] iarr = { 10, 20, 30, 40, 50 };
		//제네릭을 이용한 객체 생성
		Array<Integer> iArray = new Array<Integer>(iarr);
		
		//원하는 값 출력
		System.out.println(iArray.getFirst());
		System.out.println(iArray.getLast());
		System.out.println(iArray.getElement(3));
		System.out.println(iArray);
		
		System.out.println();
		
		//String 배열 생성
		String[] sarr = { "Hello", "world", "!" };
		//제네릭을 이용한 객체 생성
		Array<String> sArray = new Array<String>(sarr);
		
		//원하는 값 출력
		System.out.println(sArray.getFirst());
		System.out.println(sArray.getLast());
		System.out.println(sArray.getElement(1));
		System.out.println(sArray);
	}
}
