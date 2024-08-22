package net.datasa.vo;

import interfacetest.HandPhone;

@SuppressWarnings("unused")
public class Object {
	
	public static void main(String[] args) {
//		String str = new  String("Hello");
//		System.out.println(str.toString());
//		HandPhone hp = new HandPhone();
//		System.out.println(hp.toString());
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1 == str2) { // 주소값을 비교하기 때문에 false
			System.out.println("같다 ==");
		}
		
		if(str1.equals(str2)) { // 가리키고 있는 문자열을 비교하기 때문에
			System.out.println("같다 equals"); // true
		}
	}// main
} // class
