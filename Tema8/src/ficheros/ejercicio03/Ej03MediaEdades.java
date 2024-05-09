package ficheros.ejercicio03;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03MediaEdades {

	public static void main(String[] args) {
		int sum = 0;
		double  avg = 0;
		int cont = 0;

		try {
			Scanner sc = new Scanner(new FileReader("src/ficheros/ejercicio03/Alumnos.txt"));
			while (sc.hasNext()) {
				try {
					sum += sc.nextInt();
					cont++;
				} catch (InputMismatchException e) {
					sc.next();
				}			
			}
			
			avg =(double) (sum / cont);
			System.out.println(avg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
