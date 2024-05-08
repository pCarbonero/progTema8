package ejercicio03;

public class Main {

	public static void main(String[] args) {
		try {
			CuentaCorriente cc = new CuentaCorriente("12389038E", "PABLO", 300);
			System.out.println(cc);
		} catch (DniException | SaldoException | NombreException e) {
			e.printStackTrace();
		}
	}

}
