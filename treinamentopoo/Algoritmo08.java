package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo08 {

	public void algoritmo08() {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Informe o nome");
		nome = sc.nextLine();
		System.out.println("Informe o endereço");
		endereco = sc.nextLine();
		System.out.println("Informe o telefone");
		telefone = sc.nextLine();
		System.out.println("O nome é: " + nome);
		System.out.println("O endereço é: " + endereco);
		System.out.println("O telefone é: " + telefone + "\n");
		Principal.operacoes();
		sc.close();

	}
}
