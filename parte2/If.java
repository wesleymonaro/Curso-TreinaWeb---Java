package br.com.treinaweb.parte2;

public class If {

  public static void main(String[] args) {
    int nota = 4;

    if (nota > 7)
      System.out.println("Aprovado");
    else
      System.out.println("Reprovado");


    System.out.println(nota > 7 ? "Aprovado" : "Reprovado");

  }

}