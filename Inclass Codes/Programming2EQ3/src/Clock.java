public class Clock {
	private int hour;
	private int minute;
	private int second;
	
//	public Clock() {
//		
//	}
	
	public Clock() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Clock(Clock clock) {
		this.hour = clock.hour;
		this.minute = clock.minute;
		this.second = clock.second;
	}
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
//		return "hour = " + hour 
//				+ "\nminutes = " + minute
//				+ "\nseconds = " + second;
		
		return String.format("%02d:%02d:%02d", 
				hour, minute, second);
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int newHour) {
		this.hour = newHour;
	}

}
