package reto1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		System.out.println("Ingrese un nombre por favor");
		
		nombre = entrada.nextLine();
		
		System.out.println("Hola " + nombre);
		
		entrada.close();
	}

}
