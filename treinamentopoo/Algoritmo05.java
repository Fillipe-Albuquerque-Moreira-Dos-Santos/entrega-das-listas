package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo05 {

	public void algoritmo05() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int num;
		System.out.println("Informe um número");
		num = sc.nextInt();
		System.out.println("O número digitado é: " + num);
		Principal.operacoes();
		sc.close();

	}
}
