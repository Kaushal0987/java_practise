package TVremote;

interface TVremote {
	void print();
}

interface smartTVremote extends TVremote{
	void display();
}

class TV implements TVremote{
	public void print() {
		System.out.println("This is a tv remote.");
	}
}
