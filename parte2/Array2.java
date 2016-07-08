package br.com.treinaweb.parte2;

public class Array2 {

  public static void main(String[] args) {
    char[] nota = {'A','B','C','D','E'};

    int elementos = nota.length;

    System.out.println("Elementos = " + elementos);

    for(int i = 0; i < nota.length; i++){
      System.out.println("Nota = " + nota[i]);
    }
  }
}