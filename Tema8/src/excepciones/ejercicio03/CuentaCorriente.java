package excepciones.ejercicio03;


public class CuentaCorriente {
	/**
	 * Atributo para el dni del titular
	 */
	private String dni;
	/**
	 * atributo para el nombre del titular
	 */
	private String nombre;
	/**
	 * atributo para almacenar el saldo de la cuenta
	 */
	private double saldo;

	/**
	 * 
	 * @param dni
	 * @param saldo
	 */
	public CuentaCorriente(String dni, double saldo) throws DniException, SaldoException{
		// igualamos el atributo dni al valor del parámetro si no es nulo y no es una
		// cadena vacia
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		else {
			throw new DniException();
		}
		// igualamos el valor del atributo saldo al del parámetro de entrada si no es un
		// valor negativo
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		else {
			throw new SaldoException();
		}

	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) throws DniException, SaldoException, NombreException{
		this(dni, saldo);

		// igualamos el atributo nombre al valor del parámetro si no es nulo y no es una
		// cadena vacia
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		else {
			throw new NombreException();
		}
	}

	// GETTERR Y SETTERS

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	///

	/**
	 * Metodo que se encarga de realizar una operacion apra sacar dinero
	 * 
	 * @param solicitudRetirada indica la cantidad de dinero que se quiere retirar
	 * @return devuelve true si puede sacar dinero y false si no
	 */
	public boolean sacarDinero(double solicitudRetirada) {
		boolean puede = false;

		if (solicitudRetirada <= saldo) {
			puede = true;
			saldo -= solicitudRetirada;
		}

		return puede;
	}

	/**
	 * Metodo para realizar una operacion de igreso de dinero
	 * 
	 * @param ingreso cantidad de dinero qeu se quiere ingresar
	 */
	public void ingresarDinero(double ingreso) {
		saldo += ingreso;
	}

	/**
	 * metodo que muestra la informacion de la cuenta
	 */
	public void mostrarInfo() {
		System.out.println("DNI TITULAR: " + dni);
		System.out.println("NOMBRE TITULAR: " + nombre);
		System.out.println("SALDO CUENTA: " + saldo);
	}

	@Override
	public String toString() {
		//
		String cadena = "";
		cadena += "DNI: " + this.dni + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Saldo: " + this.saldo + "\n";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;

		if (this.dni == cuenta2.dni) {
			isEqual = true;
		}

		return isEqual;
	}
}
