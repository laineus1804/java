package courjava;

public class Dado {

	public static void main(String[] args) {
		int  face =(int) (Math.random() *6+1);  //0,1,2,3,4,5
		System.out.println(face);
		switch(face) {
		case 1:
			System.out.println("╔═══════╗");
			System.out.println("║       ║");
			System.out.println("║   ○   ║");
			System.out.println("║       ║");
			System.out.println("╚═══════╝");
			break;
		case 2:
			System.out.println("╔═══════╗");
			System.out.println("║ ○     ║ ");
			System.out.println("║       ║");
			System.out.println("║     ○ ║");
			System.out.println("╚═══════╝");
			break;
		case 3:
			System.out.println("╔═══════╗");
			System.out.println("║ ○     ║ ");
			System.out.println("║   ○   ║");
			System.out.println("║     ○ ║");
			System.out.println("╚═══════╝");
			break;
		case 4:
			System.out.println("╔═══════╗");
			System.out.println("║ ○   ○ ║ ");
			System.out.println("║       ║");
			System.out.println("║ ○   ○ ║");
			System.out.println("╚═══════╝");
			break;
		case 5:
			System.out.println("╔═══════╗");
			System.out.println("║ ○   ○ ║ ");
			System.out.println("║   ○   ║");
			System.out.println("║ ○   ○ ║");
			System.out.println("╚═══════╝");
			break;
		case 6:
			System.out.println("╔═══════╗");
			System.out.println("║ ○   ○ ║");
			System.out.println("║ ○   ○ ║");
			System.out.println("║ ○   ○ ║");
			System.out.println("╚═══════╝");
			break;
		
		}
		

	}

}
