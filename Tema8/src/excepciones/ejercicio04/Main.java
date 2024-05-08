package excepciones.ejercicio04;

import excepciones.ejercicio03.NombreException;

public class Main {

	public static void main(String[] args) {
		try {
			Articulo a = new Articulo("Gibson Les Paul Custom", 3999, -9);
			System.out.println(a);
		} catch (NombreException | PrecioException | CantidadException e) {
			e.printStackTrace();
		}

	}

}
