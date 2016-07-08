package br.com.treinaweb.parte3;

public class Filha extends Pai {
  protected String status = "Status Filha";

  private void imprimirFilha(){
    System.out.println(status);
    System.out.println(super.status);
  }

}