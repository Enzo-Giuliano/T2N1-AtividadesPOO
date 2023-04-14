package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;
 

 public class Principal{
 
   public static void main(String args[])
   { 
     
    byte opt;
    double sal = 0, imp = 0, aum = 0, novoSal = 0;
    
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    
    System.out.println("1. Imposto\n2. Novo Salário\n3. Classificação\nDigite a opção desejada:");
    opt = sc.nextByte();
    
    if (opt == 1){
      System.out.print("Digite o salário: R$ ");
      sal = sc.nextDouble();
      if (sal < 500){
        imp = (sal * 0.05);
      }
      if ((sal >= 500) & (sal<=850)){
        imp = (sal * 0.1);
      }
      if (sal > 850){
        imp = (sal * 0.15);
      }
      System.out.println("O imposto é de " + df.format(imp) + " reais");
    }
    if (opt == 2){
      System.out.print("Digite o salário: R$ ");
      sal = sc.nextDouble();
      if (sal > 1500){
        aum = 25;
      }
      if ((sal >= 750) & (sal<=1500)){
        aum = 50;
      }
      if ((sal >= 450) & (sal < 750)){
        aum = 75;
      }
      if (sal < 450){
        aum = 100;
      }
      novoSal = sal + aum;
      System.out.println("O novo salário é de " + df.format(novoSal) + " reais");
    }
    if (opt == 3){
      System.out.print("Digite o salário: R$ ");
      sal = sc.nextDouble();
      if (sal <= 700){
        System.out.println("Mal Renumerado.");
      }
      if (sal > 700){
        System.out.println("Bem Renumerado.");
      }
    }
    if ((opt < 1) | (opt > 3)){
      System.out.println("Opção Inválida.");
    }
    
   
   }
 }
 
