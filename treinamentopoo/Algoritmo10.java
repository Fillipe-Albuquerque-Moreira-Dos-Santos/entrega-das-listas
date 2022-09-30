package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo10 {
	
	public void algoritmo10() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int num1;
		int num2;
		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();
		System.out.println("O primeiro número digitado é: " + num1 + " O segundo número é: " + num2 + "\n");
		Principal.operacoes();
		sc.close();

	}

}
