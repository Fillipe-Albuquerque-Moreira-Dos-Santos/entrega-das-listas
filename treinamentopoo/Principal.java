package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operacoes();

	}

	public static void operacoes() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("------------------Bem vindo a Lista de exercicios -----------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Professor Romulo digite de 1 a 27 para corrigir meu trabalho de POO");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("---------------Digite 28 para sair da aplicação--------------------------");
		System.out.println("-------------------------------------------------------------------------");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			Algoritmo01 alg1 = new Algoritmo01();
			alg1.algoritmo01();

		case 2:
			Algoritmo02 alg2 = new Algoritmo02();
			alg2.algoritmo02();

		case 3:
			Algoritmo03 alg3 = new Algoritmo03();
			alg3.algoritmo03();

		case 4:
			Algoritmo04 alg4 = new Algoritmo04();
			alg4.algoritmo04();

		case 5:
			Algoritmo05 alg5 = new Algoritmo05();
			alg5.algoritmo05();

		case 6:
			Algoritmo06 alg6 = new Algoritmo06();
			alg6.algoritmo06();

		case 7:
			Algoritmo07 alg7 = new Algoritmo07();
			alg7.algoritmo07();
			
		case 8:
			Algoritmo08 alg8 = new Algoritmo08();
			alg8.algoritmo08();
			
		case 9:
			Algoritmo09 alg9 = new Algoritmo09();
			alg9.algoritmo09();
			
		case 10:
			Algoritmo10 alg10 = new Algoritmo10();
			alg10.algoritmo10();
			
		case 11:
			Algoritmo11 alg11 = new Algoritmo11();
			alg11.algoritmo11();
			
		case 12:
			Algoritmo12 alg12 = new Algoritmo12();
			alg12.algoritmo12();
			
		case 13:
			Algoritmo13 alg13 = new Algoritmo13();
			alg13.algoritmo13();
			
		case 14:
			Algoritmo14 alg14 = new Algoritmo14();
			alg14.algoritmo14();
			
			
		case 15:
			Algoritmo15 alg15 = new Algoritmo15();
			alg15.algoritmo15();
			
		case 16:
			Algoritmo16 alg16 = new Algoritmo16();
			alg16.algoritmo16();
			
		case 17:
			Algoritmo17 alg17 = new Algoritmo17();
			alg17.algoritmo17();
			
		case 18:
			Algoritmo18 alg18 = new Algoritmo18();
			alg18.algoritmo18();
			
		case 19:
			Algoritmo19 alg19 = new Algoritmo19();
			alg19.algoritmo19();
			
		case 20:
			Algoritmo20 alg20 = new Algoritmo20();
			alg20.algoritmo20();
			
		case 21:
			Algoritmo21 alg21 = new Algoritmo21();
			alg21.algoritmo21();
			
		case 22:
			Algoritmo22 alg22 = new Algoritmo22();
			alg22.algoritmo22();
			
		case 23:
			Algoritmo23 alg23 = new Algoritmo23();
			alg23.algoritmo23();
			
		case 24:
			Algoritmo24 alg24 = new Algoritmo24();
			alg24.algoritmo24();
			
		case 25:
			Algoritmo25 alg25 = new Algoritmo25();
			alg25.algoritmo25();

		case 26:
			Algoritmo26 alg26 = new Algoritmo26();
			alg26.algoritmo26();
			
		case 27:
			Algoritmo27 alg27 = new Algoritmo27();
			alg27.algoritmo27();
			
		case 28:
			System.out.println("Obrigado por visitar a minha lista de exercícios professor. Até mais. =)");
			System.exit(0);
			break;

		default:
			System.out.println("Opção Inválida");
			System.out.println("Digite um número entre 1 a 27.");
			System.out.println("28 para sair da aplicação");
			operacoes();
			break;

		}

		sc.close();

	}

}
