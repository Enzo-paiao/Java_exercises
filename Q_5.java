import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double gasolina = 5, alcool = 3, combustivel, kmgas, kmalc, kmlgas, kmlalc;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos km de gasolina seu carro faz por litro?");
    kmgas = scanner.nextDouble();

    System.out.println("Quantos km de álcool seu carro faz por litro?");
    kmalc = scanner.nextDouble();

    if(kmalc/kmgas >= 0.7){
      
      System.out.println("Gasolina compensa mais");
      
    }else if(kmalc/kmgas < 0.7){
      
      System.out.println("álcool é melhor");
    }else{
      
      System.out.println("Informação inválida. Tente novamente...");
    } 
  
    System.out.println("Quantos litros de combustivel?");
    combustivel = scanner.nextDouble();
   
    kmlgas = gasolina / kmgas;
    kmlalc = alcool / kmalc;

        System.out.println("Se você optou por gasolina, o preço por km é " + kmlgas);
        System.out.println("Se você optou por álcool, o preço por km é " + kmlalc);
}
}