package Clock;

public class Clock {
	private int hr;
	private int min;
	private int sec;
	
	public Clock(){
		this.hr = 12;
		this.min = 0;
		this.sec = 0;
	}
	
	public Clock(int hr, int min, int sec) {
		setHour(hr);
		setMinutes(min);
		setSeconds(sec);
	}
	
	public Clock(int secSinceMidnight) {
		setClock(secSinceMidnight);
	}
	
	public void setClock(int secSinceMidnight) {
		this.hr = secSinceMidnight / 3600;
		this.min = (secSinceMidnight%3600) / 60;
		this.sec = secSinceMidnight % 60;
	}
	
	public int getHour() {
		return hr;
	}
	
	public int getMinutes() {
		return min;
	}
	
	public int getSeconds() {
		return sec;
	}
	
	public void setHour(int hr) {
		this.hr = hr;
	}
	
	public void setMinutes(int min) {
		this.min = min;
	}
	
	public void setSeconds(int sec) {
		this.sec = sec;
	}
	
	public void tick() {
		sec++;
		if(sec>59) {
			min++;
			sec = 0;
			if(min>59) {
				hr = (hr+1) % 24;
				min = 0;
			}
		}
	}
	
	public void tickDown() {
		sec--;
		if(sec < 0) {
			sec = 59;
			min--;
			if(min < 0) {
				min = 59;
				hr = (hr-1) % 24;
			}
		}
	}
	
	public void addClock(Clock otherClock) {
		hr += getHour() + otherClock.hr;
		min += getMinutes() + otherClock.min;
		sec += getSeconds() + otherClock.sec;
		
		if (sec >= 60) {
			sec -= 60;
			min++;
		}
		if (min >= 60) {
			min -= 60;
			hr++;
		}
		hr %= 24;
	}
	
	public void subtractClock(Clock otherClock) {
		int thisSeconds = this.hr *3600 + this.min *60 + this.sec;
		int otherSeconds = otherClock.getHours() * 3600 + otherClock.getMinutes() * 60 + otherClock.getSeconds();

		int subtraction = thisSeconds - otherSeconds;

		if (subtraction < 0) {
			subtraction += 86400; //24 hour in seconds.
		}
		return new Clock(subtraction);
	}
	public String toString() {
		return String.format("(%02d:%02d:%02d)", hr, min, sec);
	}
}
