import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    double juro = 1.2;
    double avist = 0.9;
    double valorcadap;
    double valorprod;
    double numdep;
      
		Scanner ler = new 
    Scanner(System.in);
    
    System.out.println ("Qual o valor do produto?");
      valorprod = ler.nextDouble();

    System.out.println ("Quantas prestações?");
      numdep = ler.nextDouble();

    avist = avist * valorprod;
    juro = juro * valorprod;
    valorcadap = juro / numdep;

    System.out.println ("Valor do produto a vista " + avist);
    System.out.println ("Valor do produto a prazo " + juro);
    System.out.println ("Valor de cada prestação " + valorcadap);
    


  }

}


  }

}
