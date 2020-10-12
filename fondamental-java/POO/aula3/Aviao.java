package carros;

public class Aviao extends Carro{
	//atributo
	double envergadura;
	//método
	void aterrizar() {
		System.out.println("Avião pousou.");
	}
	//polimorfismo (reescrever o método aterrizar)
	void acelerar() {
		System.out.println("Avião decolou.......");
	}
}
