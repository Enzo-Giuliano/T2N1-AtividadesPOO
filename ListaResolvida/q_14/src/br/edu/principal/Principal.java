package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	float sal;
	float novo_sal;
	float boni = 0;
	float aux = 0;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	System.out.print("Insira o seu salário em reais: \nR$");
	sal = sc.nextFloat();
	
	if (sal <= 500) {
		boni = sal * 5 / 100;
	} if (sal > 500 && sal <= 1200) {
		boni = sal * 12 / 100;
	} if (sal > 1200) {
		boni = 0;
	} if (sal <= 600) {
		aux = 150;
	} if (sal > 600) {
		aux = 100;
	}
    
	novo_sal = sal + boni + aux;
	System.out.println("O seu novo salário é de: R$" + df.format(novo_sal));
	
	}

}
