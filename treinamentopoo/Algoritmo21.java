package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo21 {
	
	public void algoritmo21() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int altura;
		int base;
		int area;

		System.out.println("Informe a base do triângulo");
		base = sc.nextInt();
		System.out.println("Informe a altura do triângulo");
		altura = sc.nextInt();
		area = base * altura;
		System.out.println(" A área do triângulo é : " + area);
		Principal.operacoes();
		sc.close();

	}

}
