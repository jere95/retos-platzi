package reto5;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

	public static void main(String[] args) {
		BigDecimal sumando1 = new BigDecimal("4.2764");
		BigDecimal sumando2 = new BigDecimal("2.1234");
		BigDecimal multiplicando = new BigDecimal("3.543");
		MathContext redondeo = new MathContext(3);
		System.out.println("El valor de la suma con precisión 2 es: " + ((sumando1.add(sumando2)).multiply(multiplicando)).round(redondeo));
		

	}

}
