package poly;

public class Test2 {
	public static void main(String[] args) {
		 // 객체 집합의 배열
		
		Human[] arrHuman = {
							new Human(29, "김상형"),
							new Student(42, "이승우", 101, "경영"),
							new Soldier(45, "강감찬", 12345),
							new Thief(15, "홍길동", "부자집", 2),
							new Graduate(35, "박대희", 102, "전산", "웹보안 연구")
						};
		introGroup(arrHuman);
	} // main
	
	static void introGroup(Human[] group) {
		for(Human h : group) {
			h.intro();
		}
	}
} // class
