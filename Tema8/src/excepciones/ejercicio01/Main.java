package excepciones.ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numInt = -10000;
		double numDb = -10000;
		int opc;
		
		do {
			menu();
			System.out.println("ELIGE OPCION ");
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1: {
				numInt = Utils.readInt(sc);
				break;
			}
			case 2: {
				numDb = Utils.readDouble(sc);
				break;
			}
			case 3: {
				System.out.println("Has salido ");
				break;
			}
			default:
				System.out.println("Opción no válida ");
			}
			
		
		} while (opc != 3);

	}
	
	static void menu() {
		System.out.println("1. Integer");
		System.out.println("2. Double");
		System.out.println("3. Salir");
	}
}
