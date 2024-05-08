package Ejercicio02;

public class Hora {
	/**
	 * Atributo que almacena la hora
	 */
	protected int hora;
	/**
	 * Atributo que almacena los minutos
	 */
	protected int minuto;

	// COSNTRUCTOR
	/**
	 * Constructor de la clase con parametros para las hora y los minutos
	 * 
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) throws HourNegativeException, NegativeMinuteException {
		if (hora > 0) {
			this.hora = hora;
		}
		else if (hora < 0){
			throw new HourNegativeException();
		}

		if (minuto > 0) {
			this.minuto = minuto;
		}
		else {
			throw new NegativeMinuteException();
		}

	}// constructor

	// SETTERS
	/**
	 * 
	 * @param hora
	 * @return
	 */
	boolean setHora(int hora) throws HourNegativeException{
		boolean esPosible = false;
		if (hora > 0) {
			this.hora = hora;
			esPosible = true;
		}
		else if (hora < 0){
			throw new HourNegativeException();
		}
		return esPosible;
	}

	/**
	 * 
	 * @param minuto
	 * @return
	 */
	boolean setMinutos(int minuto) throws NegativeMinuteException{
		boolean esPosible = false;
		if (minuto > 0) {
			this.minuto = minuto;
			esPosible = true;
		}
		else {
			throw new NegativeMinuteException();
		}
		return esPosible;
	}

	// METODOS
	void inc() {
		this.minuto++;
		if (this.minuto == 60) {
			this.minuto = 0;
			this.hora++;
		}

		if (this.hora == 24) {
			this.hora = 0;
		}
	}

	// TO STRING
	/**
	 * metodo toString para imprimir los atributos de la
	 * 
	 * @return cadena
	 */
	@Override
	public String toString() {
		String cadena = "";
		// hora
		if (this.hora < 10) {
			cadena += "0" + this.hora + ":";
		} else {
			cadena += this.hora + ":";
		}
		// minutos
		if (this.minuto < 10) {
			cadena += "0" + this.minuto;
		} else {
			cadena += this.minuto;
		}
		//
		return cadena;
	}
}
