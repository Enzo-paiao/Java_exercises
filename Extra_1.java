import java.util.Scanner;
import java.io.*;
import java.util.Random;

  
class Main {
  public static void main(String[] args) { 
      Scanner ler = new Scanner(System.in);
      int x = 1+new Random().nextInt(100);
      int g1 = 0, g2 = 0, g3= 0, g4= 0, g5= 0, g6= 0, g7= 0, g8= 0, g9= 0, g10= 0;

        System.out.println("Primeira tentativa");
    g1 = ler.nextInt();
    if (g1 != x){
      System.out.println("QUE PENA, TENTE NOVAMENTE!");} else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");
      }
    
    System.out.println("Segunda tentativa");
    g2 = ler.nextInt();
    if (g2 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");}
    else{System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
    System.out.println("Terceira tentativa");
    g3 = ler.nextInt();
    if (g3 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}

    System.out.println("Quarta tentativa");
    g4 = ler.nextInt();
    if (g4 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
     System.out.println("Quinta tentativa");
    g5 = ler.nextInt();
    if (g5 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
     System.out.println("Sexta tentativa");
    g6 = ler.nextInt();
    if (g6 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
     System.out.println("Sétima tentativa");
    g7 = ler.nextInt();
    if (g7 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
     System.out.println("Oitava tentativa");
    g8 = ler.nextInt();
    if (g8 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
      g8 = ler.nextInt();
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}
    
     System.out.println("Nona tentativa");
    g9 = ler.nextInt();
    if (g9 != x) {
      System.out.println("QUE PENA, TENTE NOVAMENTE!");
      g9 = ler.nextInt();
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}

    System.out.println("Décima tentativa");
    g10 = ler.nextInt();
    if (g10 != x) {
      System.out.println("VOCÊ PERDEU!");
    }else{
      System.out.println("PARABÉNS, VOCÊ GANHOU!");}

      
    System.out.println("o valor sorteado era " + x + " Na proxíma você consegue ganhar!!");
  }}
