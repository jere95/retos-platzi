package reto7;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int edad;
		String nombre;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		nombre = entrada.next();
		System.out.println("Gracias " + nombre + " ahora por favor, ingresa tu edad");
		edad = entrada.nextInt();
		System.out.println(nombre + " el año pasado tenías " + (edad-1) + " años, y el próximo tendrás " + (edad+1) + " años");

		entrada.close();
	}
		
}