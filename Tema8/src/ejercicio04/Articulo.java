package ejercicio04;

import ejercicio03.NombreException;
import ejercicio03.SaldoException;

public class Articulo {
	/**
	 * atributo para el nombre del articulo
	 */
	private String nombre = "";
	/**
	 * atributo para el precio del articulo
	 */
	private double precio = 0;
	/**
	 * constante que almacena el iva
	 */
	private final double IVA = 21;
	/**
	 * atributo que almacena cuantas unidades quedan en el almacen de el articulo
	 */
	private int cuantosQuedan = 0;

	/**
	 * constructor con parámetros nombre, precio y cantidad qeu quedan en el almacen
	 * 
	 * @param nombre
	 * @param precio
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) throws NombreException, PrecioException, CantidadException{
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		else {
			throw new NombreException();
		}

		if (precio > 0) {
			this.precio = precio;
		}
		else {
			throw new PrecioException();
		}

		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
		else {
			throw new CantidadException();
		}
	}

	// GET Y SET //

	/**
	 * Metodo que devuelve el atributo nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * metodo que modifica el valor del atributo nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el atributo cuantosQuedan
	 * 
	 * @return
	 */
	public int getCuantosQuedan() {
		return this.cuantosQuedan;
	}

	/**
	 * metodo que modifica el valor del atributo cuantosQuedan
	 * 
	 * @param cuantosQuedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Metodo que devuelve el atributo precio
	 * 
	 * @return
	 */
	public double getPrecio() {
		return this.precio;
	}

	/**
	 * metodo que modifica el valor del atributo precio
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// METODOS

	/**
	 * Metodo qeu imprime la información del artículo
	 */
	void imprimeInfo() {
		System.out.println(nombre);
		System.out.println("Precio(sin IVA): " + precio + " €");
		System.out.println("Precio(con IVA): " + getPVP() + " €");
		System.out.println("Cantidad disponible: " + cuantosQuedan);
	}

	/**
	 * Metodo que calcula el precio del articulo con iva
	 * 
	 * @return el valor del articulo
	 */
	double getPVP() {
		double precioFinal = 0;

		precioFinal = precio + (precio * (IVA / 100));

		return precioFinal;
	}

	/**
	 * 
	 * @param descuento
	 * @return
	 */
	double getPVPDescuento(double descuento) {
		double precioFinal = 0;

		precioFinal = getPVP() - (getPVP() * (descuento / 100));

		return precioFinal;
	}

	/**
	 * Metodo que devuelve true si se puede vender y false si no
	 * 
	 * @param cantidad la cnatidad que se quiere vender
	 * @return
	 */
	boolean vender(int cantidad) {
		boolean siPuede = true;
		if (cantidad <= this.cuantosQuedan) {
			this.cuantosQuedan -= cantidad;
		} else {
			siPuede = false;
		}
		return siPuede;
	}

	void almacenar(int cantidad) {
		this.cuantosQuedan += cantidad;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += this.nombre + "\n";
		cadena += "Precio: " + this.precio + "€" + "\n";
		cadena += "Stock: " + this.cuantosQuedan + "\n";
		return cadena;
	}
}
