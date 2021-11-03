import java.util.*;

//한국어 뜻을 가질 Word 클래스
class Word {
	private String mean;
	//생성자
	public Word(String mean) { this.mean = mean; }
	public String toString() { return mean; }
}

public class J2_1121_HW1 {
	public static void main(String[] args) {
		//String이랑 Word mapping 하는 객체 생성
		Map<String, Word> dc = new HashMap<String, Word>();
		Scanner sc = new Scanner(System.in);
		//기능에 따른 버튼 구현
		int menu;
		//영단어
		String word;
		//영단어 뜻 받을 필드
		Word mean;
		//while 문과 검색기능에 쓰이는 true false
		boolean cnd = true, find;
		
		while(cnd) {
			System.out.print("원하는 기능을 선택하세요(1: 단어 검색, 2: 단어 추가, 3: 단어 삭제, 4: 단어 목록) : ");
			menu = sc.nextInt();
			
			switch(menu) {
			//단어 검색
			case 1:
				find = false;
				System.out.print("검색할 영단어를 입력하세요 : ");
				word = sc.next();
				//Map 에 넣은 영단어, 뜻을 key 와 value 에 받아서 
				//입력받은 word 와 key 값이 같으면 출력, find = true 
				//다르면 false 인 채로 남아서 존재하지 않는다는 말 출력
				for(Map.Entry<String, Word> s : dc.entrySet()) {
					String key = s.getKey();
					Word value = s.getValue();
					if(word.equals(key)) {
						find = true;
						System.out.println(word + "의 뜻은 " + value + " 입니다.");
					}
				}
				if(find == false)
					System.out.println(word + "가 사전에 존재하지 않습니다.");
				break;
			//단어 추가
			case 2:
				//기본적인 단어 추가
				System.out.print("추가할 영단어를 입력하세요 : ");
				word = sc.next();
				System.out.print("영단어의 뜻을 입력하세요 : ");
				mean = new Word(sc.next());
				//영단어와 뜻을 받아서 Map 객체 dc 에 보냄
				dc.put(word, mean);
				break;
			//단어 삭제
			case 3:
				//입력받은 영단어에 맞는 key 에 해당하는 내용 삭제
				System.out.print("삭제할 영단어를 입력하세요 : ");
				dc.remove(sc.next());
				System.out.println("삭제 되었습니다.");
				break;
			//단어 리스트 출력
			case 4:
				//key 와 value 에 영단어와 뜻을 받아서 각 영단어에 맞는 뜻 출력
				for(Map.Entry<String, Word> s : dc.entrySet()) {
					String key = s.getKey();
					Word value = s.getValue();
					System.out.println(key + " : " + value);
				}
				break;
			default:
				//이상한 짓 할 때 강 제 종 료
				System.out.println("이상한 값 인식");
				cnd = false;
				continue;
			}
		}
	}
}
