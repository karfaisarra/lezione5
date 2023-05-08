package lezione5;

public class ProvaPow {
	public static void main(String args[]) {
		Pow prova = new Pow(2, 7);
		double potenza = prova.pow();
		System.out.println("La potenza è: " + potenza);
	}
}
