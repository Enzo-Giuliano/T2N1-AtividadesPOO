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
    
    System.out.print("Digite o valor do salário do funcionário: \nR$ ");
    sal = sc.nextDouble();
    
    if ((sal < 500) & (sal > 0)){
      novoSal = sal * 1.3;
      System.out.println("Aumento Concedido! O novo salário do funcionário será de R$" + df.format(novoSal));
    }
    if (sal >= 500){
      System.out.println("O funcionário não tem direito ao aumento.");
    }
    if (sal <= 0){
      System.out.println("Valor Inválido. Digite corretamente.");
    }
   }
 }
