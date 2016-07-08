package br.com.treinaweb.parte1;

public class OperadorBinarioTil {

  public static void main(String[] args) {
    int i = 40; //101000
    int x = ~i; //11111111111111111111111111010111
    System.out.println("x = " + x); //x = -41
  }

}