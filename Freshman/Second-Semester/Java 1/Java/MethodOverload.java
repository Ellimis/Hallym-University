public class MethodOverload {
    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        int hap1 = add(30, 40);
        double hap2 = add(34.2, 56.4);
        System.out.println("합(int) = " + hap1);
        System.out.println("합(double) = "  + hap2);
    }
}
