package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo23 {

	public void algoritmo23() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String nome;
		int idade;
		System.out.println("Informe o nome");
		nome = sc.nextLine();
		System.out.println("Informe a idade");
		idade = sc.nextInt();
		System.out.println("O nome é: " + nome);
		System.out.println("O idadeé: " + idade + "\n");
		Principal.operacoes();
		sc.close();

	}

}
