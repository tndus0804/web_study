package net.datasa.vo;

public class Member {
	private int myCode;				// 횐원코드
	private String name;			// 이름
	private double height;			// 키
	private double weight;			// 몸무게
	private double bmi;				// bmi지수
	private String bmiResult;		// bmi결과
	private static int code = 1000;	// 코드 발생
	
	// 생성자
	public Member(String name, double height, double weight) {
		this.myCode = ++code;
		this.name = name;
//		this.height = height;
		this.height = setHeight(height);
		this.weight = weight;
		calcBMI();
	}
	
	
	public void calcBMI() {
		double heightToM = height / 100; // 키를 m단위로 변환
		bmi = weight / (heightToM * heightToM);
		if(bmi < 18.5)
			this.bmiResult = "저체중";
		else if(bmi < 23)
			this.bmiResult = "정상";
		else if(bmi < 25)
			this.bmiResult = "과체중";
		else
			this.bmiResult = "비만";
	}
	
// getter
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBmiResult() {
		return bmiResult;
	}
	
	public int getMyCode() {
		return myCode;
	}

// setter
	public double setHeight(double height) {
		if(height >= 150 && height < 200) {
			this.height = height;
			return height;
		}
		System.out.println("범위 밖을 입력하셔서 160으로 초기화 합니다.");
		return 160;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	
	@Override
	public String toString() {
//		회원코드: 1001 이름: 홍길동 키: 170.55 몸무게: 50.55 bmi: 17.55 결과: 정상
		return String.format("회원코드: %d 이름: %s 키: %.2f 몸무게: %.2f bmi: %.3f 결과: %s\n"
				               , myCode, name, height, weight, bmi, bmiResult);
	}
	

} // class
