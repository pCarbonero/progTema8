package ficheros.ejercicio06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// primero recogemos los numeros del primer archivo
		try {
			Scanner sc = new Scanner(new FileReader("src/ficheros/ejercicio06/desordenados.txt"));		
			while (sc.hasNext()) {
				numeros.add(sc.nextInt());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// ordernamos la lista
		Collections.sort(numeros);
		
		// escribimos los nuevos números
		
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter("src/ficheros/ejercicio06/ordenados.txt"));
			String cad = "";
			for (int a : numeros) {
				cad = String.valueOf(a);
				in.write(cad);
				in.newLine();
				in.flush();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
