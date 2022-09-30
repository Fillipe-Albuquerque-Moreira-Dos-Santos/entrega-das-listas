package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo09 {

	public void algoritmo09() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int num1;
		int num2;
		int soma;
		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("A soma desses numeros é: " + soma + "\n");
		Principal.operacoes();
		sc.close();

	}
}
