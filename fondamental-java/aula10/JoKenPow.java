package br.com.senac.estruturas;

import java.util.Scanner;

public class JoKenPow {

	public static void main(String[] args) {
		int jogador, computador;
		// variáveis usadas para criar um score e "melhor de 3"
		int score_jogador = 0;
		int score_computador = 0;
		int melhor = 1;
		Scanner leia = new Scanner(System.in);
		// uso da estrutura while para "fazer" um melhor de 3
		while (melhor < 4) {
			System.out.println("");
			System.out.println("__________JoKenPo__________");
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.print("Digite a opção desejada: ");
			jogador = leia.nextInt();
			// lógica do jogador
			switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu pedra");
				break;
			case 2:
				System.out.println("Jogador escolheu papel");
				break;
			case 3:
				System.out.println("Jogador escolheu tesoura");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			// lógica do computador
			computador = (int) (Math.random() * 3 + 1);
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu pedra");
				break;
			case 2:
				System.out.println("Computador escolheu papel");
				break;
			case 3:
				System.out.println("Computador escolheu tesoura");
				break;
			}
			// lógica para determinar o vencedor
			if (jogador == computador) {
				System.out.println("EMPATE");
			} else {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
						|| (jogador == 3 && computador == 2)) {
					System.out.println("JOGADOR VENCEU");
					score_jogador = score_jogador + 1;
				} else {
					System.out.println("COMPUTADOR VENCEU");
					score_computador = score_computador + 1;
				}
			}
			// placar
			System.out.println("--------------------------");
			System.out.println(" Jogador " + score_jogador + " x Computador " + score_computador);
			System.out.println("--------------------------");
			melhor = melhor + 1;

		}
	}
}
