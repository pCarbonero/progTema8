package ficheros.ejercicio07;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		String nombre;
		int numero;

		do {
			menu();
			System.out.println("ESLIGE UNA OPCIÓN");
			opc = sc.nextInt();
			sc.nextLine();
			switch (opc) {
			case 1: {
				System.out.println("Nombre del contacto ");
				nombre = sc.nextLine();
				System.out.println("Numero de tlfn");
				numero = sc.nextInt();
				sc.nextLine();
				
				if (Contactos.addContacto(nombre, numero)) {
					System.out.println("Contacto añadido correctamente ");
				}else System.out.println("Error, contacto no añadido");
				break;
			}
			case 2: {
				System.out.println("Nombre del contacto ");
				nombre = sc.nextLine();
				numero = Contactos.mostrarNumero(nombre);
				if (numero > 0) {
					System.out.println("El número es: " + numero);
				}
				else {
					System.out.println("No se encontró el contacto ");
				}
				break;
			}
			case 3: {
				Contactos.mostrarLista();
				break;
			}
			case 4: {
				System.out.println("Has salido ");
				break;
			}
			default:
				System.out.println("Opción no válida ");			}
		} while (opc != 4);
	}
	
	static void menu() {
		System.out.println("menu");
		System.out.println("1. Nuevo contacto.\r\n"
				+ "2. Buscar por nombre.\r\n"
				+ "3. Mostrar todos.\r\n"
				+ "4. Salir.\r\n"
				+ "");
	}


}
