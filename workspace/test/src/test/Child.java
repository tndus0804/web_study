package test;



public class Child extends Parent {
    int x = 2000;

    Child() {
        this(500); // Child(int x) 생성자를 호출
        System.out.println("Child");
    }

    Child(int x) {
    	System.out.println("Child x");
        this.x = x; // Child 클래스의 인스턴스 변수 x를 전달된 값으로 설정
    }

    public static void main(String[] args) {
        Child obj = new Child(); // Child 클래스의 인스턴스 생성
        System.out.println(obj.getX()); // getX() 메서드 호출 결과 출력
    }
}

class Parent{
    int x = 100;

    Parent() {
        this(500); // Parent(int x) 생성자를 호출
        System.out.println("Parent");
    }

    Parent(int x) {
    	System.out.println("Parent x");
        this.x = x; // 인스턴스 변수 x를 전달된 값으로 설정
    }

    int getX() {
        return x; // x 값을 반환
    }
}
