package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo11 {

	public void algoritmo11() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double num;
		double terco;
		System.out.println("Informe um número");
		num = sc.nextInt();
		terco = num / 3;
		System.out.println("O terço do número digitado é: " + terco);
		Principal.operacoes();
		sc.close();

	}
}
