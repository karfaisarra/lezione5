package lezione5;

public class Cerchio {
	public double r;
	
	public Cerchio(double a) {
		r=a;
	}
	public double diametro() {
		return r*2;
	}
	public double perimetro() {
		return r*2*3.14;
	}
	public double area() {
		return (r*r)*3.14;
	}
}
