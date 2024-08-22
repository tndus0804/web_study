package serialtest;

import java.io.Serializable;

public class Car implements Serializable {
	String name;
	transient String color; // 직렬화 대상에서 제외
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	void outInfo() {
		System.out.println(name + ", " + color);
	}
} // car
