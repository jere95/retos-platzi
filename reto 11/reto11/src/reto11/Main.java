package reto11;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número mayor a 1000");
		x = entrada.nextInt();
		while (x<=1000) {
			System.out.println("El número ingresado debe ser mayor a 1000, por favor ingrese un valor correcto");
			x = entrada.nextInt();
		}
		System.out.println("Ahora ingrese un número menor a 100");
		y = entrada.nextInt();
		while (y>=100) {
			System.out.println("El número ingresado debe ser menor a 100, por favor ingrese un valor correcto");
			y = entrada.nextInt();
		}
		System.out.println("El número " + y + " entra " + (x/y) + " veces en el número "  + x);
		entrada.close();
	}
}		