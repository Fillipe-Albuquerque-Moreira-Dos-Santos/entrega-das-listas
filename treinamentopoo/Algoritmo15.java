package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo15 {
	
	public void algoritmo15() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double salario;
		double qlw;
		double novosalario ;
		double novoqlw;
		
		System.out.println("Informe o valor do salário minimo");
		salario = sc.nextDouble();
		System.out.println("Informe o valor em reais dos quilowatts gastos em sua residência");
		qlw = sc.nextDouble();
		novosalario = salario /0.07;
		novoqlw = novosalario - 0.10; 
		System.out.println("O valor do salário minimo é: " + novosalario);
		System.out.println("O valor em reais de cada quilowatts é: " + qlw);
		System.out.println("O novo valor da residência a ser pago é: " + novoqlw );
		Principal.operacoes();
		sc.close();

	}

}
