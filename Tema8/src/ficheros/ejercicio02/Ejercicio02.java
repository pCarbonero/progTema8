package ficheros.ejercicio02;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int sum = 0;
		try {
			Scanner sc = new Scanner(new FileReader("src/ficheros/ejercicio02/Enteros.txt"));
			while (sc.hasNext()) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
