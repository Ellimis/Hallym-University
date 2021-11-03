
//���׸� Ŭ���� Array
class Array<T> {
	private T[] arr;
	
	//������
	public Array(T[] arr) {
		this.arr = arr;
	}
	
	//���ϴ� ���� ��ȯ�ϴ� �޼ҵ��
	public T getFirst() { return arr[0]; }
	public T getLast() { return arr[arr.length-1]; }
	public T getElement(int i) { return arr[i]; }
	
	//�迭�� ���� ���� ���
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
		//integer �迭 ����
		Integer[] iarr = { 10, 20, 30, 40, 50 };
		//���׸��� �̿��� ��ü ����
		Array<Integer> iArray = new Array<Integer>(iarr);
		
		//���ϴ� �� ���
		System.out.println(iArray.getFirst());
		System.out.println(iArray.getLast());
		System.out.println(iArray.getElement(3));
		System.out.println(iArray);
		
		System.out.println();
		
		//String �迭 ����
		String[] sarr = { "Hello", "world", "!" };
		//���׸��� �̿��� ��ü ����
		Array<String> sArray = new Array<String>(sarr);
		
		//���ϴ� �� ���
		System.out.println(sArray.getFirst());
		System.out.println(sArray.getLast());
		System.out.println(sArray.getElement(1));
		System.out.println(sArray);
	}
}
