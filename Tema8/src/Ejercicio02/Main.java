package Ejercicio02;

public class Main {

	public static void main(String[] args) {

		try {
			HoraExacta he = new HoraExacta(13, 36, 14);
			System.out.println(he);
		} catch (NegativeSecondException e) {
			e.printStackTrace();
		} catch (NegativeMinuteException e) {
			e.printStackTrace();
		} catch (HourNegativeException e) {
			e.printStackTrace();
		}

	}// main

}
