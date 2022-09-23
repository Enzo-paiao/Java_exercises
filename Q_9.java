import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double litrogaso, kmmes, kmlitro, trocaoleo, seguroanual, ipva, precocarro, custosrev, precomes;
      
		Scanner ler = new 
    Scanner(System.in);
    
    System.out.println ("Qual o litro da gasolina?");
      litrogaso = ler.nextDouble();

    System.out.println ("Quantos km o carro roda por mês?");
      kmmes = ler.nextDouble();
    
    System.out.println ("Quantos km o carro faz por litro?");
      kmlitro = ler.nextDouble();

    System.out.println ("Qual o preço da troca de oleo?");
      trocaoleo = ler.nextDouble();

    System.out.println ("Qual o valor do seguro anual?");
      seguroanual = ler.nextDouble();

    System.out.println ("Qual o preço do carro?");
      precocarro = ler.nextDouble();

    System.out.println ("Qual o custo de revisão e gastos eventuais?");
      custosrev = ler.nextDouble();

    ipva = precocarro * (5/100);

   precomes =  ((kmmes / kmlitro) * litrogaso) + ((trocaoleo * 2) / 12) + (seguroanual / 12) + (ipva /12) + custosrev;

    System.out.println ("O valor para se manter um carro um mês em reais é " + precomes);
    


  }

}
}
