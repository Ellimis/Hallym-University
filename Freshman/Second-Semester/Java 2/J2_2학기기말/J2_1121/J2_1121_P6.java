import java.util.*;

public class J2_1121_P6 {
	public static void main(String[] args) {
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = time; i >= 0; i--) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
	}
}
