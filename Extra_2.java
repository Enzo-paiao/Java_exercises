import java.util.Scanner;
import java.io.*;


class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
    String nome1, nome2, serie1, serie2, j1, j2, j3,j4;
    int count, idade1, idade2, numerost, numerost2;
    float peso1, peso2, altura1, altura2;
    boolean Jogos1, Jogos2, Jogos3, Jogos4;
    char senha;
    char senha1;
    char tenis;
    char tenis1;
    count=0;

       
            

     
    System.out.println("Digite  um nome: ");
    nome1 = ler.nextLine();
    System.out.println("Digite outro nome: ");
    nome2 = ler.nextLine();
    if (nome1.equals(nome2)) {System.out.println("Seu nome é igual ao meu"); count++;} else {System.out.println("Nomes diferentes");}
    
    System.out.println("Digite sua série favorita: ");
    serie1 = ler.nextLine();
    System.out.println("Digite a outra série favorita: ");
    serie2 = ler.nextLine();
    if (serie1.equals(serie2)) {System.out.println("Nossas séries favoritas são         iguais"); count++;} else {System.out.println("Nossas séries favoritas são diferentes");}

    System.out.println("Digite  sua idade: ");
    idade1 = ler.nextInt();
    System.out.println("Digite outra idade: ");
    idade2 = ler.nextInt();
  if (idade1==idade2) {System.out.println("Nossas idades são iguais"); count++;} else    {System.out.println("Nossas idades são diferentes");}

     System.out.println("Digite seu número da SORTE: ");
    numerost = ler.nextInt();
    System.out.println("Digite outro número da sorte: ");
    numerost2 = ler.nextInt();
  if (numerost==numerost2) {System.out.println("Números da sorte igauis");     count++;} else {System.out.println("Número da sorte diferente");}

    System.out.println("Digite  seu peso: ");
    peso1 = ler.nextFloat();
    System.out.println("Digite outro peso: ");
    peso2 = ler.nextFloat();
  if (peso1==peso2) {System.out.println("Nossos pesos são iguais");count++;} else       {System.out.println("Nossos pesos são diferentes");}

    System.out.println("Digite sua altura: ");
    altura1 = ler.nextFloat();
    System.out.println("Digite outra altura: ");
    altura2 = ler.nextFloat();
  if (altura1==altura2) {System.out.println("Nossas alturas são iguais"); count++;}     else {System.out.println("Nossas alturas são diferentes");}

   System.out.println("já zerou Elden Ring?  (y ou n)");
    j1 = ler.nextLine();
    System.out.println("(y ou n)");
    OUTER:
     while (true) {
           j1 = ler.next().trim().toLowerCase();
            switch (j1) {
                case "y":
                    Jogos1 = true;
                    break OUTER;
                case "n":
                    Jogos1 = false;
                    break OUTER;
                default:
                    System.out.println("Ação inesperada");
                    break;
            }
     }
    System.out.println("E você? ");
    j2 = ler.nextLine();
    System.out.println("(y ou n)");
    OUTER:
     while (true) {
           j2 = ler.next().trim().toLowerCase();
            switch (j2) {
                case "y":
                    Jogos2 = true;
                    break OUTER;
                case "n":
                    Jogos2 = false;
                    break OUTER;
                default:
                    System.out.println("Ação inesperada");
                    break;
            }
     }
  if (Jogos1==Jogos2) {System.out.println("Já zeramos Elden Ring"); count++;} else           {System.out.println("Não zeramos o mesmo jogo");}

    System.out.println("já zerou Minecraft?  (y ou n)");
    j3 = ler.nextLine();
    System.out.println("(y ou n)");
    OUTER:
     while (true) {
           j3 = ler.next().trim().toLowerCase();
            switch (j3) {
                case "y":
                    Jogos3 = true;
                    break OUTER;
                case "n":
                    Jogos3 = false;
                    break OUTER;
                default:
                    System.out.println("Ação inesperada");
                    break;
            }
     }
    System.out.println("E você? ");
    j4 = ler.nextLine();
    System.out.println("(y ou n)");
    OUTER:
     while (true) {
           j4 = ler.next().trim().toLowerCase();
            switch (j4) {
                case "y":
                    Jogos4 = true;
                    break OUTER;
                case "n":
                    Jogos4 = false;
                    break OUTER;
                default:
                    System.out.println("Ação inesperada");
                    break;
            }
     }
  if (Jogos3==Jogos4) {System.out.println("Já zeramos Minecraft"); count++;} else           {System.out.println("Não zeramos o mesmo jogo");}

System.out.println("Qual a sua senha?");
senha = ler.next().charAt(0);
            
System.out.println("Qual a sua senha fulaninho?");
senha1 = ler.next().charAt(0);
if (senha == senha1) {System.out.println("Senhas iguais"); count++;} 
else{System.out.println("Senhas diferentes");}

System.out.println("Qual o tamanho do tênis?");
tenis = ler.next().charAt(0);
            
System.out.println("Qual o tamanho do tênis de fulano?");
tenis1 = ler.next().charAt(0);
if (tenis == tenis1) {System.out.println("Tamanho igual"); count++;} 
else{System.out.println("Tamanho diferente");}



    
  if (count>=5) {System.out.println("Essa pessoa é parecida comigo");
} else {System.out.println("Essa pessoa não é parecida comigo");}
    
}
  }

