package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// variáveis
		double alcool, gasolina;
		// objetos
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("Álcool x Gasolina");
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor do gasolina: ");
		gasolina = teclado.nextDouble();
		// processamento + saída
		if (alcool < 0.7 * gasolina) {
			System.out.println("ABASTEÇA COM ÁLCOOL");
		} else {
			System.out.println("ABASTEÇA COM GASOLINA");
		}
		teclado.close();
	}

}
