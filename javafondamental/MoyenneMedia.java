package courjava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoyenneMedia {

	public static void main(String[] args) {
		
		//Variáveis
		double nota1,nota2,media;
		//objetos
				Scanner teclado = new Scanner(System.in);
				DecimalFormat formatador = new DecimalFormat("#0.00");
				//entrada
				System.out.println("== cálculo do Media ==");
				System.out.println("=======================");
				System.out.print("Digite a nota1: ");
				nota1 = teclado.nextDouble();
				System.out.print("Digite a nota2: ");
				nota2 = teclado.nextDouble();
				media = (nota1+ nota2) / 2;
				//saida
				System.out.println("Media: " + formatador.format(media)); 
				if (media < 2) {
					System.out.println("Reprovado");
				}else if (media >= 2 && media <=5) {
					System.out.println("Recuperacão");
				}else if (media >= 5) {
				System.out.println("Aprovado");
			}	
				
				
				teclado.close();

	}

}
