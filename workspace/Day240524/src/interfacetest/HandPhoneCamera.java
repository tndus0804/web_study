package interfacetest;

public class HandPhoneCamera extends HandPhone implements Camera, Mp3{

	@Override
	public void takePicture() {
		System.out.println("사진 찍기");
	}
	
	@Override
	public void intro() {
		Camera.super.intro();
		super.intro();
		Mp3.super.intro();
	
	
	}
}
