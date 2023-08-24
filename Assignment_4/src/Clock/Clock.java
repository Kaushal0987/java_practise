package Clock;

public class Clock {
	private int hr;
	private int min;
	private int sec;
	
	public Clock(){
		hr = 12;
		min = 0;
		sec = 0;
	}
	
	public Clock(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	public Clock(int sec) {
		this.hr = sec/3600;
		this.min = (sec%3600)/60;
		this.sec = sec%60;
	}
	
	public void setClock(int sec) {
		this.hr = sec/3600;
		this.min = (sec%3600)/60;
		this.sec = sec%60;
	}
	
	public int getHour() {
		return hr;
	}
	
	public int setMinutes() {
		return min;
	}
	
	public int setSeconds() {
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
			sec=0;
			if(min>59) {
				hr++;
				min=0;
			}
		}
	}
	
	
}
