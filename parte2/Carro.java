package br.com.treinaweb.parte2;

public class Carro {
  //Atributos da classe
  public static String cor="";
  public String modelo="";
  public String motor="";

  //Métodos da classe
  public void ligar(){
    System.out.println("Ligando o carro");
  }
  public void desligar(){
    System.out.println("Desligando o carro");
  }
  public void acelerar(){
    System.out.println("Acelerando o carro");
  }
  public void brecar(){
    System.out.println("Brecando o carro");
  }
  void mudarMarcha(){
    System.out.println("Marcha engatada");
  }
}