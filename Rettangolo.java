package lezione5;

public class Rettangolo {
	public int larghezza;
	public int altezza;
	
	public int getArea() {
		return larghezza*altezza;
	}
	public int getPerimetro() {
		return (larghezza+altezza)*2;
	}
}
