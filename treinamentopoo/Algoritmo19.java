package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo19 {
	
	public void algoritmo19() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int altura;
		int base;
		int perimetro;
		int area;
		int diagonal;
		System.out.println("Informe a base do quadrado");
		base = sc.nextInt();
		System.out.println("Informe a altura quadrado");
		altura = sc.nextInt();

		area = base * altura;
		perimetro = base * 2 + altura * 2;
		diagonal = base * altura / 2;
		System.out.println(" o perimetro do quadrado é : " + perimetro);
		System.out.println(" A área do quadrado é : " + area);
		System.out.println(" A diagonal do quadrado é : " + diagonal + "\n");
		Principal.operacoes();
		sc.close();

	}

}
