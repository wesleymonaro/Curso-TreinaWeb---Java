package br.com.treinaweb.parte2;

public class Exemplo {

  public static void main(String[] args){
    // Chamada ao primeiro método
    imprimir();
    // Chamada ao segundo método
    imprimir("Yasmim");
  }

  public static void imprimir(){
    System.out.println("Silvia");
  }

  public static void imprimir(String nome){
    System.out.println(nome);
  }

}