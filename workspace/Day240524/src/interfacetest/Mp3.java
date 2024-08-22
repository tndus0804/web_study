package interfacetest;

public interface Mp3 {
	
	default void intro() {
		System.out.println("interface mp3 intro");
	}
}
