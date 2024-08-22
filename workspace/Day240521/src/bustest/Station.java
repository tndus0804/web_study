package bustest;

public class Station {
	String name;  // 정거장 이름
	int distance; // 누적거리
	int fare;	  // 구간 요금
	
	public Station(String name, int distance, int fare) {
		this.name = name;
		this.distance = distance;
		this.fare = fare;
	}
} // class