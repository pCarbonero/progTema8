package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	public static int readInt(Scanner sc) {
		int num;
		try {
			System.out.println("Inserta un numero entero ");
			num = sc.nextInt();
			System.out.println("El número es " + num); 
		}catch(InputMismatchException e){
			num = 0;
			System.out.println("El valor insertado no es de tipo int ");
		}	
		finally {
			sc.nextLine();		
		}
		return num;
	}
	
	public static double readDouble(Scanner sc) {
		double num;
		try {
			System.out.println("Inserta un numero decimal ");
			num = sc.nextDouble();
			System.out.println("El número es " + num); 
		}catch(InputMismatchException e){
			num = 0;
			System.out.println("El valor insertado no es de tipo double ");
		}	
		finally {
			sc.nextLine();
		}
		return num;
	}
}
