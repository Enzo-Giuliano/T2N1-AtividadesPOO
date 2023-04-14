package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

 class Principal
 {
   public static void main(String args[])
   { 
    byte code, precUni = 0;
    int qntd, precNota = 0;
    double precFinal = 0;
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    
    System.out.println("Digite o código do produto");
    code = sc.nextByte();
  
    if ((code >= 1) & (code <=10)){
      precUni = 10;
      System.out.println("O preço unitário do produto é de R$10.00");
    }
    if ((code >= 11) & (code <=20)){
      precUni = 15;
      System.out.println("O preço unitário do produto é de R$15.00");
    }
    if ((code >= 21) & (code <=30)){
      precUni = 20;
      System.out.println("O preço unitário do produto é de R$20.00");
    }
    if ((code >= 31) & (code <=40)){
      precUni = 30;
      System.out.println("O preço unitário do produto é de R$30.00");
    }
    if ((code < 1) | (code > 40)){
      System.out.println("Código Inválido.");
    }
    
    
    if ((code >= 1) & (code <= 40)){
     System.out.println("\nDigite a quantidade comprada do produto");
     qntd = sc.nextInt();
     precNota = qntd * precUni;
     System.out.println("O preço total da nota é de R$" + df.format(precNota));
    
    
     if (precNota <= 250){
      precFinal = precNota * 0.95;
     }
     if ((precNota > 250) & (precNota < 500)){
      precFinal = precNota * 0.9;
     }
     if (precNota >= 500){
      precFinal = precNota * 0.85;
     }
    
     System.out.println("\nHouve " + (100 * (precNota - precFinal)/precNota) + "% de desconto, resultando numa diminuição de R$ " + df.format((precNota - precFinal)) + ". O novo valor total da nota é de R$ " + df.format(precFinal) + ".");
    }
    
    
   }
 }



