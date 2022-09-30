package br.com.voearlines.treinamentopoo;

import java.util.Locale;
import java.util.Scanner;

public class testando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double num1 = 9;
		double num2 = 8;
		double num3 = 7;
		double media;	
		
		media = num1 + num2 + num3 / 3;
		
		System.out.println("A média é: " + media);
		sc.close();
		}

	}


