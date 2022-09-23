import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) { 
      Scanner ler = new Scanner(System.in);
    float q = 0, rb,rh, t,th, c, l1, l2;
    int valor;
    

    System.out.println("Selecione o a opção; Quadrado(1), Retangulo(2), Triangulo(3), Circulo(4), Sair(5) ");
    valor = ler.nextInt();
  if(valor == 1){
    System.out.println("Qual o lado do quadrado?");
     q = ler.nextFloat();
    System.out.println("A aréa é " + q * q + "\nO perimetro é "+ q*4);
  } else if(valor == 2){
    System.out.println("Qual a base do retangulo?");
  rb = ler.nextFloat();
    System.out.println("Qual a altura do retangulo?");
     rh = ler.nextFloat();
    System.out.println("A aréa é " +rb*rh+ "\nO perimetro é "+ (rb + rb + rh + rh));
  }else if(valor == 3){
    System.out.println("Qual a base do triangulo?");
  t = ler.nextFloat();
    System.out.println("Qual a altura do triangulo?");
    th = ler.nextFloat();
    System.out.println("Qual o lado 1 do triangulo?");
     l1 = ler.nextFloat();
    System.out.println("Qual o lado 2 do triangulo?");
     l2 = ler.nextFloat();
    System.out.println("A aréa é " +(t*th) / 2+ "\nO perimetro é "+ (t + l2 + l1));
  }else if(valor == 4){
    System.out.println("Qual o raio do circulo?");
  c = ler.nextFloat();
    System.out.println("A aréa é " +3.14 * (c*c)+ "\nO perimetro é "+ (2*3.14) * c);
  }else if(valor == 5){  System.exit(0);
  }
  }
}
