package ejercicio03;

public class NombreException extends Exception {
	@Override
	public String toString() {
		return "Nombre is not a String";
	}
}
