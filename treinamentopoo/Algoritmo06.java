package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo06 {

	public void algoritmo06() {

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
