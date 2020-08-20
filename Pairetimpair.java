package courjava;
import java.util.Scanner;
public class Pairetimpair {
 
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String args[]) {
 
    	// Pe�a ao usu�rio um valor
        System.out.print("Entrez un nombre entier:");
        int number = scanner.nextInt();
 
        // Premi�rement, on v�rifie si le nombre est z�ro, car
        // dans ce cas le test de parit� n'est pas n�cessaire
        
        if (number == 0) {
            System.out.println("O n�mero � zero (e � par)");
        } else {
            // S'il n'est pas nul, voyons quel est son signe
            if (number < 0) {
                //Note: System.out.print ne commence pas de nouvelle ligne
                System.out.print("Le nombre est n�gatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }
 
         // Teste de paridade: se o resto da divis�o por dois for zero
            // ent�o o n�mero � par
            int reste = number % 2;
            if (reste == 0) {
                System.out.println("par");
            } else {
                System.out.println("�mpar");
            }
        }
    }
}