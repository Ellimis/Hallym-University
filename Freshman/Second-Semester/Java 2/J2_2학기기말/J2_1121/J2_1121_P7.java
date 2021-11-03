import java.util.*;

class Student {
	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class J2_1121_P7 {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		
		st.put("20190001", new Student(20190001, "Cathy"));
		st.put("20190002", new Student(20190002, "Mike"));
		st.put("20190003", new Student(20190003, "Jenny"));
		
		System.out.println(st);
		
		st.remove("20190002");
		st.put("20190003", new Student(20190001, "Josh"));
		System.out.println(st.get("20190003"));
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
	}
}
