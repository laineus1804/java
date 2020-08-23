package courjava;



	import java.util.Random;
	import java.util.Scanner;

	
	public class sonjokenpo {
	public static void main(String[] args) {
			//1-papel, 2-pedra; 3-Tesoura.
		//objetos
			Scanner leitor = new Scanner(System.in);
			Random gerador =new Random();
			System.out.println("======jokenpo======");
			System.out.println("Computer et User");
			System.out.println("===============--=");
			System.out.println("1.papel");
			System.out.println("2.pedra");
			System.out.println("3.tesoura");
			System.out.println("=================");
			System.out.println("joueur:");
			
			
			
			int nUser;
			int esComputer;
			int vUser = 0;
			int vComputer = 0;
			
			
			nUser = leitor.nextInt();
			esComputer = gerador.nextInt(3) +1;
			
			
			//processamente 
			switch(esComputer) {
			case 1:
				System.out.println("Computer choisie papel");
				break;
			case 2:
				System.out.println("Computer choisie pedra");
				break;
			case 3:
				System.out.println("Computer choisie tesoura");
				break;
		} 
			
			if(nUser == esComputer) {
				System.out.println("Empate.");
			}else if((nUser - esComputer) == -1 ||
					(nUser - esComputer) == 2) {
				System.out.println("User vencedor.");
				
			}
			else{
				System.out.println("Computer vencedor");
			
			  }
		
			
	    }

	}
