package poly;

public class AnimalTest2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.bark();
		
		// 업캐스팅(자식클래스를 부모클래스 타입으로 변환)
		Animal up = (Animal)dog;
		up.move();
//		up.bark();
		System.out.println(up);
		
		// 다운캐스팅(부모클래스를 자식클래스 타입으로 변환)
//		Dog down = (Dog)animal;
//		down.move();
//		down.bark();
		
		
		
	} // class

}
