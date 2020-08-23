package courjava;

import java.text.DecimalFormat;
import java.util.Scanner;

import Contas.État;

public class calculoIMC {

	public static void main(String[] args) {
		
		
		//Variáveis
		
		double peso,altura,imc;
		
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("cálculo do IMC");
		System.out.print("Digite o seu peso em kilogramas: ");
		
		peso = teclado.nextDouble();
		System.out.print("Digite o sua altura em metros: ");
		
		altura = teclado.nextDouble();
		imc = peso / (altura*altura);
		//saida
		System.out.println("Imc: " + formatador.format(imc));
		
		 if (imc < 16.99 ){
			System.out.println("insuficiência ponderável");
			
		}else if (imc >= 16.99 && imc <= 18.5) {
			System.out.println("Abaixo do peso");
		}
		
		else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Normale");
		}
		
		else if (imc >=25 && imc <= 29.99) {
			System.out.println("En surpoids");
		}
		
		else if (imc >=30 && imc <=34.99 ) {
			System.out.println("Abésité I");
		}
		
		else if (imc >=35 && imc <=39.99) {
			System.out.println("Abésité II(Sévère)");
		}
		
		else if (imc >= 40) {
			System.out.println("Abésité III(morbide)");
		}
		 
		
		
		
         teclado.close();
	
	}

}






