package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo18 {

	
	public void algoritmo18() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int raio = 10;
		int resultado;
		
		resultado = raio / 2;
		
		System.out.println("A área do circulo é: " + resultado);
		System.out.println("O perimetro do circulo é: " + raio);
		Principal.operacoes();
		sc.close();
	}
}
