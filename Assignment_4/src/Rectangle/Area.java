package Rectangle;

public class Area {
	
	private int length;
	private int breadth;
	
	public Area(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public int returnArea() {
		return length * breadth;
	}

}
