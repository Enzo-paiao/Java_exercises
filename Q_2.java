import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String combustivel;
    double gasolinars, alcoolrs, dieselrs, quantidaders;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Fala chefia, qual combustível você quer? gasolina, alcool ou diesel?");
    combustivel = scanner.next();

    if(combustivel.equals("Gasolina")){
      
      System.out.println("gasolina saindo");
      System.out.println("E quantos reais de combustível?");
      quantidaders = scanner.nextDouble();
      gasolinars = (quantidaders / 4.75);
      
      System.out.println("A quantidade em litros foi: "+gasolinars);
      
    }else if(combustivel.equals("Alcool")){
      
      System.out.println("álcool saindo");
      System.out.println("E quantos reais de combustível?");
      quantidaders = scanner.nextDouble();
      alcoolrs = (quantidaders / 4);

      System.out.println("A quantidade em litros foi: "+alcoolrs);
    }
    else if(combustivel.equals("Diesel")){
      
      System.out.println("diesel saindo");
      System.out.println("E quantos reais de combustível?");
      quantidaders = scanner.nextDouble();
      dieselrs = (quantidaders / 3.5);

      System.out.println("A quantidade em litros foi: "+dieselrs);
      
    }else{
      System.out.println("Informações Inválidas! Tente de novo...");
    }
    
}
}