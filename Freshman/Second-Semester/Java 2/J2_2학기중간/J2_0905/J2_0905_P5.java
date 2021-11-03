public class J2_0905_P5 {
	public static void main(String[] args) {
		int[] score = {78, 40, 23, 99, 80};
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += score[i];
		}
		System.out.println("Æò±ÕÁ¡¼ö : " + (sum/5.0));
	}
}
