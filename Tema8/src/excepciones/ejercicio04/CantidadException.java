package excepciones.ejercicio04;

public class CantidadException extends Exception{
	@Override
	public String toString() {
		return "Cantidad cannot be less than 0";
	}
}
