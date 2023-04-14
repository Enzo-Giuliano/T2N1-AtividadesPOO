package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;


 public class Principal
 {
   public static void main(String args[])
   { 
    double sal, novoSal = 0;
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    
    System.out.print("Digite o valor do sal�rio do funcion�rio: \nR$ ");
    sal = sc.nextDouble();
    
    if ((sal < 500) & (sal > 0)){
      novoSal = sal * 1.3;
      System.out.println("Aumento Concedido! O novo sal�rio do funcion�rio ser� de R$" + df.format(novoSal));
    }
    if (sal >= 500){
      System.out.println("O funcion�rio n�o tem direito ao aumento.");
    }
    if (sal <= 0){
      System.out.println("Valor Inv�lido. Digite corretamente.");
    }
   }
 }
