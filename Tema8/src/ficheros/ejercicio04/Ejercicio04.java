package ficheros.ejercicio04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String frase = "";
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter("src/ficheros/ejercicio04/Ejercicio04.txt"));
			
			while (!frase.equalsIgnoreCase("fin")) {
				frase = "";
				System.out.println("Inserta primer párrafo ");
				frase = sc.nextLine();
				
				in.write(frase);
				in.newLine();
			}
			
			in.flush();
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
