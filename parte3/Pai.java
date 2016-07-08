package br.com.treinaweb.parte3;

public class Pai {
  protected String status = "Status pai";

  public void imprimir(){
    System.out.println(status);
  }

  public void imprimir(String status){
    System.out.println(status);
    System.out.println(this.status);
  }

}