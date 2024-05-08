package excepciones.ejercicio02;


public class HoraExacta extends Hora {
	/**
	 * Atributo que almacena los minutos de la hora
	 */
	private int segundos = 0;

	// CONSTRUCTOR
	/**
	 * Constructor de la clase EoraExacta
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundos
	 */
	public HoraExacta(int hora, int minuto, int segundos) throws NegativeSecondException, HourNegativeException, NegativeMinuteException{
		super(hora, minuto);
		if (segundos > 0) {
			this.segundos = segundos;
		}
		else {
			throw new NegativeSecondException();
		}
	}

	// SET
	boolean setSegundos(int segundos) throws NegativeSecondException{
		boolean esPosible = false;
		if (segundos > 0) {
			this.segundos = segundos;
		}
		else {
			throw new NegativeSecondException();
		}
		return esPosible;
	}

	//
	void inc() {
		this.segundos++;
		if (this.segundos == 60) {
			this.segundos = 0;
			super.inc();
		}
	}

	//
	@Override
	public String toString() {
		String cadena = "";
		cadena += super.toString();
		if (segundos < 10) {
			cadena += ":0" + this.segundos;
		} else {
			cadena += ":" + this.segundos;
		}
		return cadena;
	}

}
