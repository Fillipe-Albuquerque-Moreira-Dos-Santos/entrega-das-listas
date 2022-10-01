package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo25 {
	
	public void algoritmo25() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double graus;
		double fahrenheit;

		System.out.println("Informe a temperatura em graus");
		graus = sc.nextDouble();
		fahrenheit = (1.8*graus+ 32); 
		System.out.println(" A temperatura convertida em graus fahrenheit é : " + fahrenheit + "\n");
		Principal.operacoes();
		sc.close();

	}

}
