package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo22 {

	public void algoritmo22() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int altura;
		int base;
		int area;

		System.out.println("Informe a base do losango");
		base = sc.nextInt();
		System.out.println("Informe a altura do losango");
		altura = sc.nextInt();
		area = base * altura;
		System.out.println(" A área do losango é : " + area);
		Principal.operacoes();
		sc.close();

	}

}
