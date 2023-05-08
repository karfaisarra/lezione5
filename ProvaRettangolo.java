package lezione5;

public class ProvaRettangolo {
	public static void main(String args[]) {
		Rettangolo provaRettangolo = new Rettangolo();
		
		provaRettangolo.larghezza=6;
		provaRettangolo.altezza=4;
		
		int area = provaRettangolo.getArea();
		int perimetro = provaRettangolo.getPerimetro();
		
		System.out.println("L'area: " + area + "\nPerimetro: " + perimetro);
	}
}
