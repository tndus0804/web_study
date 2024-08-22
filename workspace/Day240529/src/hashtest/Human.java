package hashtest;

public class Human {
	int myCode;
	int age;
	String name;
	int donate;
	static int code = 100;
	
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
		return "나이는 " + age + "살이고, 이름은 " + name + "이고, 기부금은 " + donate + "원";
	}
} // class
