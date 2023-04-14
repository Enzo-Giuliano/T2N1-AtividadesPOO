package br.edu.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

 public class Principal
 {
   public static void main(String args[])
   { 
    int code;
    double preco, novoPreco = 0;
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat ("#.00");
    
    System.out.println("Digite o c�digo do produto:");
    code = sc.nextInt();
    System.out.print("Digite o pre�o do produto: \nR$ ");
    preco = sc.nextDouble();
    
    if (preco <= 30){
      novoPreco = preco;
    }
    if ((preco > 30) & (preco <=100)){
      novoPreco = preco * 0.9;
    }
    if (preco > 100){
      novoPreco = preco * 0.85;
    }
    System.out.println("\nPre�o atual do produto de c�digo " + code + ": R$ " + df.format(preco) + "\nDesconto: " + df.format(100 * (preco - novoPreco)/preco) + "% (R$ " + df.format(preco - novoPreco) + " a menos" + ")\nNovo Pre�o: R$ " + df.format(novoPreco));
    
   }
 }

