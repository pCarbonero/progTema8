package ficheros.ejercicio01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int cont = 0;
		try {
			Scanner sc = new Scanner(new FileReader("src/ficheros/ejercicio01/NumerosReales.txt"));
			while (sc.hasNext()) {
				sum += sc.nextInt();
				cont++;
			}
			avg = sum/cont;
			System.out.println(avg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
