public class J2_1010_HW1 {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank 의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank 의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank 의 이자율 : " + b3.getInterestRate());
	}
}
