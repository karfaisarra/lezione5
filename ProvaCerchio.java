package lezione5;

public class ProvaCerchio {
	public static void main(String args[]) {
		Cerchio prova = new Cerchio(4);
		double diametro = prova.diametro();
		double perimetro = prova.perimetro();
		double area = prova.area();
		System.out.println("Diametro: " + diametro + " Perimetro: " + perimetro + " L'area: " + area);
	}
}
