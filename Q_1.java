import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) { 
      Scanner ler = new Scanner(System.in);
   String [] P1 = new String[5];
   String [] C1 = new String[5];
    int valor;
    

    for(int i = 0; i < 5; i++){
            
        System.out.printf("Quais as suas informações?");
        P1[i] = ler.nextLine();
        }
    for(int i = 0; i < 5; i++){
            
    System.out.printf("Quais as informações do ciclano?");
    C1[i] = ler.nextLine();
        }
    System.out.println("Quais informações quer ver? Suas(1) ou as do Ciclano(2)?");
    valor = ler.nextInt();
  if(valor == 1){
    System.out.println("Essas são as 5 infos " + P1[0] + P1[1] + P1[2]+ P1[3]+ P1[4]);
  } else if(valor == 2){
    System.out.println("Essas são as 5 infos do ciclano " + C1[0] + C1[1] + C1[2]+ C1[3]+ C1[4]);}

  }
}