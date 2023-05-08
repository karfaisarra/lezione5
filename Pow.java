package lezione5;

public class Pow {
	
	public int base;
	public int esponente;
	
	public Pow(int a, int b) {
		base=a;
		esponente=b;
	}
	
	public double pow() {
		double risultato = base;
		for(int i=1; i<esponente;i++) {
			risultato *=base;
		}
		return risultato;
	}
}