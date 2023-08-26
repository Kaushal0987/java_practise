package Complex_Number;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		realPart=0;
		imaginaryPart=0;
	}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex otherNumber) {
		double newRealPart = this.realPart + otherNumber.realPart;
		double newImaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
		
		return new Complex(newRealPart, newImaginaryPart);
	}
	
	public Complex subtract(Complex otherNumber) {
		double newRealPart = this.realPart - otherNumber.realPart;
		double newImaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
		
		return new Complex(newRealPart, newImaginaryPart);
	}
	
	public Complex multiply(Complex otherNumber) {
		double newRealPart = this.realPart * otherNumber.realPart;
		double newImaginaryPart = this.imaginaryPart * otherNumber.imaginaryPart;
		
		return new Complex(newRealPart, newImaginaryPart);
	}
	
	public Complex divide(Complex otherNumber) {
		double newRealPart = this.realPart / otherNumber.realPart;
		double newImaginaryPart = this.imaginaryPart / otherNumber.imaginaryPart;
		
		return new Complex(newRealPart, newImaginaryPart);
	}
	
	public void setRealPart (double realPart) {
		this.realPart = realPart;
	}
	
	public void setImaginaryPart (double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public String toString() {
		if (imaginaryPart < 0) {
			return realPart + " - " + (-imaginaryPart) + "i";
		} else {
			return realPart + " + " + imaginaryPart + "i";
		}
	}
}
