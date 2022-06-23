package org.generatio.jana60.calcolatrice;

public class CalcoliHelper {

	public static double calcoloSomma(double numero1, double numero2) {
		return numero2 + numero1;
	}

	public static double calcoloDiff(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public static double calcoloMolti(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public static double calcoloValore(double numero1) {
		if (numero1 < 0)
			return numero1 = -numero1;
		else
			return numero1;
	}

	public static double calcoloMin(double numero1, double numero2) {
		if (numero1 < numero2)
			return numero1;
		else
			return numero2;
	}

	public static double calcoloMax(double numero1, double numero2) {
		if (numero1 > numero2)
			return numero1;
		else
			return numero2;
	}

	public static double calcoloPotenza(double numero1, double numero2) {
		double risultato = 1;
		if (numero1 == 0 || numero2 == 0)
			return 1;
		else if (numero2 < 0) {
			for (int n = 2; n <= -numero2; n++) {
				risultato *= numero1;
			}
			return 1 / risultato;
		} else
			for (int n = 0; n < numero2; n++) {
				risultato *= numero1;
			}
		return risultato;
	}
}
