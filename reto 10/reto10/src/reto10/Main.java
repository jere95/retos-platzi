package reto10;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		final double milla = 1.609344; 
		int cantMillas;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de millas que desea convertir a kil�metros");
		cantMillas = entrada.nextInt();
		System.out.println("En " + cantMillas + " millas, hay " + (cantMillas*milla) + "kil�metros");
		entrada.close();
	}
}		