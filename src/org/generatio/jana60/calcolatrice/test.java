package org.generatio.jana60.calcolatrice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double numero1, numero2;
		int operazione;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"inserisci operazione: 1 per somma - 2 per sottrazione - 3 per moltiplicazione - 4 per valore assoluto - 5 per minimo - 6 per massimo - 7 per calcolare potenza: ");
		operazione = Integer.parseInt(scan.nextLine());
		switch (operazione) {
		case 1:
			System.out.println("Hai sceltro la somma! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloSomma(numero1, numero2));
			break;
		case 2:
			System.out.println("Hai scelto la sottrazione! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloDiff(numero1, numero2));
			break;
		case 3:
			System.out.println("Hai scelto la moltiplicazione! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloMolti(numero1, numero2));
			break;
		case 4:
			System.out.println("Hai sceltro il valore assoluto! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloValore(numero1));
			break;
		case 5:
			System.out.println("Hai scelto numero minimo! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloMin(numero1, numero2));
			break;
		case 6:
			System.out.println("Hai scelto numero massimo! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloMax(numero1, numero2));
			break;
		case 7:
			System.out.println("Hai scelto calcolo della potenza! Inserisci 2 numeri");
			numero1 = Double.parseDouble(scan.nextLine());
			numero2 = Double.parseDouble(scan.nextLine());
			System.out.println(CalcoliHelper.calcoloPotenza(numero1, numero2));
			break;
		}
		scan.close();
	}

}
