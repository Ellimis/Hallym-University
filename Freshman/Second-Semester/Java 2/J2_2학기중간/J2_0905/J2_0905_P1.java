import java.util.Scanner;

public class J2_0905_P1 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		score = input.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 80) {
			grade = 'C';
		} else if(score >= 80) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("학점: " + grade);
	}
}
