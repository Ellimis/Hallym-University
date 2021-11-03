public class MethodDef {
    public static int big(int a, int b) {
        if(a>b)
            return a;  //a에 저장된 값 반환
        else
            return b;  //b에 저장된 값 반환
    }

    public static void main(String[] args) {
        int d1=(int)(Math.random()*10)+1;
        int d2=(int)(Math.random()*10)+1;
        int max = big(d1, d2);  //함수 호출

        String result = "생성된 난수1 : "+d1 + "\n";
        result += "생성된 난수2 : "+d2 + "\n";
        result += "큰 값은 " +max +"\n";
        System.out.println(result);
    }
}
