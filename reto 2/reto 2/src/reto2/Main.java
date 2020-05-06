package reto2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.println("Ingrese un nombre por favor");
		nombre = entrada.nextLine();
		System.out.println("Ahora ingrese su apellido");
		apellido = entrada.nextLine();
		System.out.println("Hola " + nombre + " " + apellido);
		entrada.close();
	}

}




