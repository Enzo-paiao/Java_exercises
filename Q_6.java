import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
      
		Scanner ler = new 
    Scanner(System.in);
    
    System.out.println ("Qual a primeira nota?");
      nota1 = ler.nextDouble();

    System.out.println ("Qual a segunda nota?");
      nota2 = ler.nextDouble();
    
    System.out.println ("Qual a terceira nota?");
      nota3 = ler.nextDouble();
    System.out.println ("Qual a quarta nota?");
      nota4 = ler.nextDouble();

   media = (nota1*3+nota2*4+nota3*5+nota4*6) / (3+4+5+6);

    if (media > 6)
     {
      System.out.println ("Aprovado");
     }
    else if  (media < 4)
       {
          System.out.println ("Reprovado");
       }
    else
       {
          System.out.println ("Exame");
       }

  }

}

}
