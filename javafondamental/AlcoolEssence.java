package courjava;


import java.util.Scanner;

public class AlcoolEssence {

	public static void main(String[] args) {

		//Vari�veis
		
		double alcool,gasolina;
;	
		//objetos
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("c�lculo alcool y gasolina");
				System.out.print("Digite o valor do �lcool: ");
				alcool = teclado.nextDouble();
				System.out.print("Digite o valor da gazolina: ");
				gasolina = teclado.nextDouble();
				//processamente
				if (alcool < gasolina * 0.7 ) {
					System.out.println("vantajoso com alcool");
					
				}else {
					System.out.println("vantajoso  com gasolina");
				}
				
				
				
				teclado.close();
	     }
	    
    }