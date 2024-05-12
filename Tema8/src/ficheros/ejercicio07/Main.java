package ficheros.ejercicio07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/ficheros/ejercicio07/agenda.txt"));
			String a;
			while((a = br.readLine()) != null) {
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
