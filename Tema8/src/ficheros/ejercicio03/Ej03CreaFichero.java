package ficheros.ejercicio03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej03CreaFichero {

	public static void main(String[] args) {
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter("src/ficheros/ejercicio03/Alumnos.txt"));
			
			// alumno 1
			in.write("juan 22 1.77");
			in.newLine();
			in.write("luis 21 1.80");
			in.newLine();
			in.write("pedro 20 1.73");
			in.newLine();
			
			in.flush();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
