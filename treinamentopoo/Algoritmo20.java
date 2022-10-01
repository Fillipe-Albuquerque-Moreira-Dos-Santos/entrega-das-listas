package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo20 {

	public void algoritmo20() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int a;
		int b;
		int c;
		int diagonal;
		System.out.println("Informe o lado A do paralelepípedo");
		a = sc.nextInt();
		System.out.println("Informe o lado B do paralelepípedo");
		b = sc.nextInt();
		System.out.println("Informe o lado C do paralelepípedo");
		c = sc.nextInt();
		diagonal = (a * a) + (b * b) + (c * c);
		System.out.println(" A diagonal do paralelepípedo é : " + diagonal + "\n");
		Principal.operacoes();
		sc.close();

	}

}
