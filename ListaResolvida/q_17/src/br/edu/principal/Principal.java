package br.edu.principal;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
    
    double a;
    double b;
    double c;
    double delta = 0;
    double x1;
    double x2;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o valor do \"a\" da equação: ");
    a = sc.nextFloat();
    System.out.println("Insira o valor do \"b\" da equação: ");
    b = sc.nextFloat();
    System.out.println("Insira o valor do \"c\" da equação: ");
    c = sc.nextFloat();
    
    if (a == 0) {
    	System.out.println("Estes valores não formam uma equação de segundo grau.");
    } else {
    	delta = (b * b) - (4 * (a) * (c));
    	System.out.println(delta);
    	
    	if (delta < 0) {
        	System.out.println("Não existe uma raiz real.");
        }
        
        if (delta == 0) {
        	System.out.println("Existe uma raiz real.");
        	x1 = - b / (2 * a);
        	System.out.println("A raiz real é: " + x1);
        }
        
        if (delta > 0) {
        	System.out.println("Existem duas raízes reais.");
        	x1 = (- b + Math.sqrt(delta)) / (2 * a);
        	x2 = (- b - Math.sqrt(delta)) / (2 * a);
        	System.out.println("As raízes reais são: " + x1 + " e " + x2);
        }
    }
    
	}

}
