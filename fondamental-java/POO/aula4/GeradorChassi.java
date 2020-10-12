package exercicios;

import java.util.Random;

public class GeradorChassi {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de nome chassi
		String chassi = new String("123456789ABCDEFGHIJKLMNOPQRSTUVXYZ");
		// apoio ao entendimento da lógica
		// System.out.println(chassi.charAt(6));
		// System.out.println(chassi.length());
		Random gerador = new Random();
		System.out.print("* ");
		for (int i = 1; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}
		System.out.print(" *");
	}
}
