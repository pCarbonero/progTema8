package ejercicio03;

public class DniException extends Exception{
	@Override
	public String toString() {
		return "DNI is not a String";
	}
}
