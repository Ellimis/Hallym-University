import java.util.Scanner;

public class J1_1101_HW5 {
    public static void rank(String[][] ps, int type) {
        int i, j, min = 0, zero = 0;
        String[][] temp = {{" ", " "}};

        //내림 오름 역순
        switch(type) {
            case 0:
                for(i = 0; i < ps.length-1; i++) {
                    min = i;
                    for(j = 1 + i; j < ps.length; j++) {
                        if(Integer.parseInt(ps[j][1]) >= Integer.parseInt(ps[min][1])) min = j;
                }
                    temp[zero][zero] = ps[i][0];
                    temp[zero][zero] = ps[i][1];
                    ps[i][0] = ps[min][0];
                    ps[i][1] = ps[min][1];
                    ps[min][0] = temp[zero][zero];
                    ps[min][1] = temp[zero][zero];
                }
                break;
            case 1:
                for(i = 0; i < ps.length-1; i++) {
                    min = i;
                    for(j = 1 + i; j < ps.length; j++) {
                        if(Integer.parseInt(ps[j][1]) < Integer.parseInt(ps[min][1])) min = j;
                    }
                    temp[zero][zero] = ps[i][0];
                    temp[zero][zero] = ps[i][1];
                    ps[i][0] = ps[min][0];
                    ps[i][1] = ps[min][1];
                    ps[min][0] = temp[zero][zero];
                    ps[min][1] = temp[zero][zero];
                }
                break;
            case 2:
                int half = ps.length/2;
                for(i = 0; i < half; i++) {
                    min = ps.length-1-i;
                    temp[zero][zero] = ps[i][0];
                    temp[zero][zero] = ps[i][1];
                    ps[i][0] = ps[min][0];
                    ps[i][1] = ps[min][1];
                    ps[min][0] = temp[zero][zero];
                    ps[min][1] = temp[zero][zero];
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] person = {
                {"Kim", "74"},
                {"Ann", "92"},
                {"Mike", "69"},
                {"Keith", "86"},
                {"Ariel", "57"},
                {"John", "100"} };
        int i, type = 0;
        char ch = 'a';
        boolean cnd = true;

        System.out.println("====== 학생들 정보 출력 ======");
        for(i = 0; i < person.length; i++) {
            System.out.println((i+1) + ") Name : " + person[i][0] + ", Score : " + person[i][1]);
        }

        do {
            System.out.print("학생 정렬 방법 선택(0 : 내림차순, 1 : 오름차순, 2 : 역순) >>> ");
            type = sc.nextInt();
            rank(person, type);

            System.out.println("====== 학생들 정보 출력 ======");
            for (i = 0; i < person.length; i++) {
                System.out.println((i + 1) + ") Name : " + person[i][0] + ", Score : " + person[i][1]);
            }

            System.out.print("끝내려면 q 또는 Q 입력 >>> ");
            ch = sc.next().charAt(0);
            if(ch =='q' || ch == 'Q') cnd = false;
        } while(cnd);
    }
}
