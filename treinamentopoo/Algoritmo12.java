package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo12 {

	public void algoritmo12() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double num1;
		double num2;
		double media;
		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();
		
		media = num1 + num2 / 2;

		System.out.println("A média é: " + media);
		Principal.operacoes();
		sc.close();
	}

}
