import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) { 
      Scanner ler = new Scanner(System.in);
    float valor, valorMes, valorDia, valorHora;

    System.out.println("Qual o seu sálario anual? ");
    valor = ler.nextInt();

    valorMes = valor / 12;
      valorDia = valorMes / 22;
      valorHora = valorDia / 8;
    
    System.out.println("Seu sálario anual é " + valor +
    "\nSeu sálario mensal é " + valorMes +                
    "\nSeu salario diario é " + valorDia +
    "\nSeu salario por hora é " + valorHora);
  
  }
}