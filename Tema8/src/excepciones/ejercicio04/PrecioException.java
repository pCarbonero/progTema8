package excepciones.ejercicio04;

public class PrecioException extends Exception{
	@Override
	public String toString() {
		return "Precio is negative or equals to 0";
	}
}
