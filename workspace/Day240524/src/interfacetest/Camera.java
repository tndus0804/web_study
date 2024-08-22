package interfacetest;

public interface Camera {
	void takePicture(); // public abstract
	
	// 일반 메서드
	public default void intro() {
		System.out.println("interface camera intro");
	}
}
