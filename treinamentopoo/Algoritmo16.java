package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo16 {

	public void algoritmo16() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String nome;
		System.out.println("Informe o nome");
		nome = sc.nextLine();

		// nome
		System.out.println("O nome digitado é: " + nome);
		// primeiro caractere
		System.out.println("O primeiro caractere do nome é: " + nome.charAt(0));
		// Ultimo caractere
		char lastChar = nome.charAt(nome.length() - 1);
		System.out.println("A ultima letra do nome é: " + lastChar);
		// terceiro caractere
		String tresPrimeiros = nome.substring(0, 3);
		System.out.println("O primeiro até o terceiro caractere é: " + tresPrimeiros);
		// Todos menos o primeiro
		String quartocaractere = nome.substring(1);
		System.out.println("O quarto caractere é: " + quartocaractere);
		// Os dois ultimos
				String doisultimos = nome.substring(5);
				System.out.println("Os dois ultimos caracteres  é: " + doisultimos);
		Principal.operacoes();
		sc.close();

	}

}
