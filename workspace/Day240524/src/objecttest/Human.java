package objecttest;

public class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕 " + age + "살 " + "name");
	}
	
	public Object clone() {
		return new Human(this.age, this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Human other) {
//			Human other = (Human)obj;
			if(this.age == other.age && this.name.equals(other.name))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return age + "세의 " + name;
	}
} // class
