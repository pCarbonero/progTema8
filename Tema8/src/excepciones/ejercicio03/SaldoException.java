package excepciones.ejercicio03;

public class SaldoException extends Exception{
	@Override
	public String toString() {
		return "Saldo is not double";
	}
}
