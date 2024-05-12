package ficheros.ejercicio07;

import java.util.Collections;
import java.util.TreeMap;

public class Contactos {
	static TreeMap<String, Integer> lista = new TreeMap<>();

	public static boolean isFull(String nombre) {
		boolean itIs = false;

		if (lista.size() >= 20 || lista.containsKey(nombre)) {
			itIs = true;
		}
		return itIs;
	}

	public static boolean addContacto(String nombre, int numero) {
		boolean done = false;
		if (!isFull(nombre)) {
			lista.put(nombre, numero);
			done = true;

		}
		return done;
	}

	public static int mostrarNumero(String nombre) {
		return lista.get(nombre);
	}

	public static void mostrarLista() {
		System.out.println(lista);
	}
}
