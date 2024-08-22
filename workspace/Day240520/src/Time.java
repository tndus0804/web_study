
public class Time {
	private boolean am;
	private int hour;
	private int minute;
	private int second;


	// 생성자
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setHour(int hour) {
		// 0~23 사이 
		if(hour >= 0 && hour < 24) {
			// 오전 오후 판단
			// am: 오전 12 보다 작으면 오전, false면 오후
			am = (hour < 12);
			// 12로 나눈 나머지로 hour 초기화
			this.hour = hour % 12;
			// 0시면 12로 초기화
			if(hour == 0) this.hour = 12;
		} // if
		else {
			this.hour = -999999;
		}
	}

	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 60) {
			this.minute = minute;
		}
		else
			this.minute = -999999;
	}

	public void setSecond(int second) {
		if(second >= 0 && second <= 60) {
			this.second = second;
		}
		else
			this.second = -999999;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}







	void whatTime() {
		System.out.println(am ? "오전" : "오후");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
} // class
