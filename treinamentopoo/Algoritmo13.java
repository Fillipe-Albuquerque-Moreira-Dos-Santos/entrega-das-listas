package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo13 {

	
	public void algoritmo13() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double num1;
		double num2;
		double num3;
		double num4;
		double media;
		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();
		System.out.println("Informe o terceiro número");
		num3 = sc.nextInt();
		System.out.println("Informe o quarto número");
		num4 = sc.nextInt();
		
		media = num1 + num2 + num3 + num4 / 4;

		System.out.println("A média ponderada é: " + media);
		Principal.operacoes();
		sc.close();
	}
}
