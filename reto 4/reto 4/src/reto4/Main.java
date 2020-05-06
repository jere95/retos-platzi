package reto4;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

	public static void main(String[] args) {
		BigDecimal unNumero = new BigDecimal("4.2764");
		BigDecimal otroNumero = new BigDecimal("2.1234");
		MathContext redondeo = new MathContext(3);
		System.out.println("El valor de la suma con precisión 2 es: " + unNumero.add(otroNumero).round(redondeo));
		

	}

}
