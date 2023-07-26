package Area_of_Rectangle;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int  display() {
		return length * breadth;
	}

}
