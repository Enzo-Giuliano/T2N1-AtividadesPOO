package br.edu.principal;

import java.util.Scanner;

public class Principal{ 

  public static void main(String args[]){
    
   double salMin, vhora, salMes, vhe, salBruto, imp = 0, salLiq, grat = 0, salFinal;
   short nht, ndep, nhet;
   int vdep;
   
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Digite o valor do sal�rio m�nimo: R$ ");
   salMin = sc.nextDouble();
   System.out.println("Digite o n�mero de horas trabalhadas:");
   nht = sc.nextShort();
   System.out.println("Digite o n�mero de dependentes do funcion�rio:");
   ndep = sc.nextShort();
   System.out.println("Digite o n�mero de horas extras trabalhadas:");
   nhet = sc.nextShort();
   
   vhora = 0.2 * salMin;
   salMes = nht * vhora;
   vdep = 32 * ndep;
   vhe = nhet * (vhora + (vhora * 0.5));
   salBruto = salMes + vdep + vhe;
   
   if (salBruto < 200){
     imp = 0;
   }
   if ((salBruto >=200) & (salBruto <= 500)){
     imp = salBruto * 0.1;
   }
   if (salBruto > 500){
     imp = salBruto * 0.2;
   }
   salLiq = salBruto - imp;
   if (salLiq <= 350){
     grat = 100;
   }
   if (salLiq > 350){
     grat = 50;
   }
   salFinal = salLiq + grat;
   System.out.println("O sal�rio a ser recebido � de " + salFinal + " reais.");
   
   
  }
}
