package ficheros.ejercicio03;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03MediaEdades {

	public static void main(String[] args) {
		String nombre;
		double ageAvg = 0;
		double heiAvg = 0;
		int cont = 0;

		try {
			Scanner sc = new Scanner(new FileReader("src/ficheros/ejercicio03/Alumnos.txt"));
			while (sc.hasNext()) {
				nombre = sc.next();
				System.out.println(nombre);
				ageAvg += sc.nextInt();
				heiAvg += Double.parseDouble(sc.next());
				cont++;
			}

			ageAvg = (ageAvg / cont);
			heiAvg = (heiAvg / cont);
			System.out.println("Edad media: " + ageAvg);
			System.out.println("Altura media: " + heiAvg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
