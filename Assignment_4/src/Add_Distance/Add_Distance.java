package Add_Distance;

public class Add_Distance {
	private double inch;
	private double feet;
	
	public Add_Distance(double inch, double feet) {
		this.inch = inch;
		this.feet = feet;
	}
	
	public double result() {
		return (inch+(feet*12));
	}
}
