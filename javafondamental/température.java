package courjava;

import java.text.DecimalFormat;
import java.util.Scanner;
public class temp�rature {
	public static void main(String[] args) {
		// Vari�veis
		double c,f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Convers�o de temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//En traitement
		c = (5 * (f - 32)) /9;
		
		//saida
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "�C");
		
		teclado.close();
 }

}