package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo14 {

	public void algoritmo14() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double saldo;
		double novosaldo;
		double reajuste = 0.01;
		System.out.println("Informe o saldo da aplicação");
		saldo = sc.nextInt();
        
		novosaldo= saldo / reajuste;

		System.out.println("O novo com reajuste é : " + novosaldo);
		Principal.operacoes();
		sc.close();
	}

}
