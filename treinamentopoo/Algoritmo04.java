package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo04 {

	public void algoritmo04() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double num1 = 9;
		double num2 = 8;
		double num3 = 7;
		double media;

		media = num1 + num2 + num3 / 3;

		System.out.println("A média é: " + media);
		Principal.operacoes();
		sc.close();
	}
}
