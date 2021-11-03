public class dowhile {
    public static void main(String[] args){
        int rand, hap = 0;
        do {
            rand = (int)(Math.random()*15)+1;
            hap += rand;
            System.out.println("rand = " + rand + "\thap = " + hap);
        } while(rand != 5);
    }
}
