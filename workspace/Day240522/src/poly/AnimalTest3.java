package poly;

public class AnimalTest3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 다형성
		// 상속관계
		// 부모타입 변수명 = new 자식타입();
		// 업캐스팅은(자식 -> 부모)은 항상 ok
		// 다운캐스팅(부모 -> 자식)은 원칙적으로 쓸 이유가 없으나
		// instanceof 와 함께
		
		inheritance.Human human = new inheritance.Human(29, "김상형");
		human.intro();
		
		
		Dog happy = new Dog();
		testAnimal(happy);
		Dove dove = new Dove();
		testAnimal(dove);
		
	} // class

	private static void testAnimal(Animal animal) {
		
		animal.move();
		System.out.println(animal instanceof Dog);
		System.out.println(animal instanceof Dove);
		if(animal instanceof Dog) {
			Dog myDog = (Dog)animal;
			myDog.move();
			myDog.bark();
		} else if(animal instanceof Dove) {
			Dove mydove = (Dove)animal;
			mydove.fly();
		}
			
		
		
		
	}

}
