package reto6;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cantPorcionesIniciales;
		int cantPorcionesQueComimos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de porciones de pizza que había al llegar a la fiesta");
		cantPorcionesIniciales = (int) entrada.nextInt();
		System.out.println("Ahora ingrese la cantidad de porciones de pizza que se comieron");
		cantPorcionesQueComimos = (int) entrada.nextInt();
		while(cantPorcionesIniciales < cantPorcionesQueComimos) {
			System.out.println("No podés comer más pizza de la que tenés, por favor ingresar la verdadera cantidad de porciones que comieron");
			cantPorcionesQueComimos = (int) entrada.nextInt();
		}
		System.out.println("Al final de la fiesta quedaron " + (cantPorcionesIniciales-cantPorcionesQueComimos) + " porciones de pizza");

		entrada.close();
	}
		
}
