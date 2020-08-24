package courjava;
import java.util.Scanner;
public class Pairetimpair {
 
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String args[]) {
 
    	// Peça ao usuário um valor
        System.out.print("Entrez un nombre entier:");
        int number = scanner.nextInt();
 
        // Premièrement, on vérifie si le nombre est zéro, car
        // dans ce cas le test de parité n'est pas nécessaire
        
        if (number == 0) {
            System.out.println("O número é zero (e é par)");
        } else {
            // S'il n'est pas nul, voyons quel est son signe
            if (number < 0) {
                //Note: System.out.print ne commence pas de nouvelle ligne
                System.out.print("Le nombre est négatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }
 
         // Teste de paridade: se o resto da divisão por dois for zero
            // então o número é par
            int reste = number % 2;
            if (reste == 0) {
                System.out.println("par");
            } else {
                System.out.println("Ímpar");
            }
        }
    }
}