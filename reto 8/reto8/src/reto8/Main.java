package reto8;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		double totalAPagar;
		int cantComenzales;
		double porcentajeDePropina = 20.0; //Por pura comodidad elijo que la propina e impuestos estén previamente convenidos
		double impuestos = 21.0; 
		double totalCuenta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor base de la cuenta");
		totalAPagar = entrada.nextDouble();
		System.out.println("Ingrese la cantidad de comenzales");
		cantComenzales = entrada.nextInt();
		totalCuenta = totalAPagar + (totalAPagar*porcentajeDePropina/100) + (totalAPagar*impuestos/100);
		System.out.println("El total de la cuenta es " + totalCuenta + " y cada comenzal debe pagar " + (totalCuenta/cantComenzales));
		entrada.close();
	}
		
}