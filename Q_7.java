import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double horanormal, horaextra, preconormal, precoextra, salario;
    
		Scanner ler = new 
    Scanner(System.in);
    
    System.out.println ("Quantas horas normais trabalhadas?");
     horanormal = ler.nextDouble();

    System.out.println ("Quantas horas extras trabalhadas?");
      horaextra = ler.nextDouble();
    
    System.out.println ("Qual o preço da sua hora normal?");
      preconormal = ler.nextDouble();

   salario = horanormal * preconormal + horaextra * (preconormal *1.50);

    System.out.println ("O salário a receber é " + salario );

  }

}


