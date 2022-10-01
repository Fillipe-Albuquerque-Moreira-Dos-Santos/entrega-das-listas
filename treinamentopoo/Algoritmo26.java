package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo26 {

	public void algoritmo26() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double prestacao;
		double valor;
		double taxa;
		double tempo = 72;

		System.out.println("Sabendo que a taxa de juros é de 5% ao dia");
		System.out.println("Sabendo que a mercadoria está atrasada a 3 dias");
		System.out.println("-----------------------------------");
		System.out.println("Informe o valor da prestação");
		System.out.println("-----------------------------------");
		taxa = (0.15 / 100) * tempo;
		valor = sc.nextDouble();
		prestacao = valor + (valor * (taxa / 100) * tempo);

		System.out.println(" O valor da prestação da multa em atraso é de: " + prestacao + "\n");
		Principal.operacoes();
		sc.close();

	}

}
