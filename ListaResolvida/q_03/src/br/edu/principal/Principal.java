package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	float num1;
	float num2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro número: ");
	num1 = sc.nextFloat();
	System.out.println("Digite o segundo número: ");
	num2 = sc.nextFloat();
	
	if (num1 > num2) {
	    System.out.println("O maior número é: " + num1);
    } else if (num1 < num2) {
    	System.out.println("O maior número é: " + num2);
    } else if (num1 == num2) {
    	System.out.println("Os números são iguais");
    }

	}

}
