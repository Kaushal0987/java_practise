package Area_rectangle;

public class Area {
	
	private int length;
	private int breadth;

	public void setDim(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return length*breadth;
	}
}