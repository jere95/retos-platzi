package reto9;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int cantDias;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de d�as");
		cantDias = entrada.nextInt();
		System.out.println("En " + cantDias + " d�as, han pasado " + (cantDias * 24) + " horas " +  (cantDias * 24 * 60) + " minutos, y " + (cantDias * 24 * 60 * 60) + " segundos");
		entrada.close();
	}
}		