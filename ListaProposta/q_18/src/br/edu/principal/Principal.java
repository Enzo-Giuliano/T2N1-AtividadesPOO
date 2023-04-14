package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	int idade;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a sua idade: ");
	idade = sc.nextInt();
	
	if (idade >= 18) {
		System.out.println("Você é por lei um adulto. Parabéns, vai ter que pagar contas e impostos, e já pode ser preso!");
	} else {
		System.out.println("Você ainda não atingiu a maioridade. Aproveite a sua inocência enquanto não trabalha.");
	}

	}

}
