package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo07 {

	public void algoritmo07() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int num = 5;
		System.out.println("O número que foi guardado na variável é: " + num);
		System.out.println("O antecessor deste numero é 4:");
		System.out.println("O sucessor deste numero é 6:\n");
		Principal.operacoes();
		sc.close();

	}

}
