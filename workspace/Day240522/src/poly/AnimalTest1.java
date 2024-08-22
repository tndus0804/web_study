package poly;

public class AnimalTest1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 좌우의 타입이 맞는 경우
		Animal animal = new Animal();
		animal.move();
		
		// 부모타입에 자식 객체 대입
		Animal dog = new Dog();
		dog.move();
//		dog.bark();
		
		// 자식타입에 부모 객체 대입
//		Dove dove = new Animal();
		
		

	} // class

}
