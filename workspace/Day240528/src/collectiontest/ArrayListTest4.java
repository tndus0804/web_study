package collectiontest;

import java.util.ArrayList;

public class ArrayListTest4 {
	
	public static void main(String[] args) {
		ArrayList<String> arrName = new ArrayList<>();
		arrName.add("전두환");
		arrName.add("김영삼");
		arrName.add("김대중");
		arrName.add(1,"노태우");
		System.out.println(arrName); // [전두환, 노태우, 김영삼, 김대중]
		
//		arrName.remove("김영삼");
//		System.out.println(arrName); // [전두환, 노태우, 김대중]
		
		// 
		// "김영"을 포함하는 요소를 제거(선생님과 같이XX) arrName.removeIf(name -> name.contains("김영"));
		
		boolean result = arrName.remove("김영삼");
		System.out.println("삭제 결과: " + result);
		System.out.println(arrName);
		// 변경
		arrName.set(1, "김영삼");
		System.out.println(arrName);
		
		if (arrName.indexOf("전두환") != -1) { // 요소가 있음
			System.out.println("있다");
		}
		else {
			System.out.println("없다");
		}
		
		
		
	} //main
} // class
