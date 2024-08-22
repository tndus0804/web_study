package poly;

public final class Thief extends Human{
	String item;
	int star;

	public Thief(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	@Override
	public void intro() {
		System.out.println(item + "전문 " + star + "범입니다.");
	}
	
	void steal() {
		System.out.println("훔친다");
	}
	
	
}	
