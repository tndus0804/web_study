package generic;

public class Human implements Comparable<Human> {
	int myCode;
	int age;
	String name;
	int donate;
	static int code = 100;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
		this.myCode = ++code;
	}
	
	public Human(int age, String name, int donate) {
		this.age = age;
		this.name = name;
		this.donate = donate;
		this.myCode = ++code;
	}
	
	@Override
	public int hashCode() {
		
		return name.length() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			if(this.age == other.age && this.name == other.name)
				return true;
			else
				return false;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		String msg = "나이는 " + age + "살이고, 이름은 " + name;
		if(donate > 0) {
			msg += "이고, 기부금은 " + donate + "원";
		}else {
			msg += "이야";
		}
		return msg;
		
		//return "나이는 " + age + "살이고, 이름은 " + name + "이고, 기부금은 " + donate + "원";
	}

	@Override
	public int compareTo(Human other) {
		if (this.age > other.age) // 나이가 클 때
			return 1;
		else if(this.age < other.age) // 나이가 작을 떄
			return -1;
		else // 나이가 같을 때
			return 0;
	}
} // class
