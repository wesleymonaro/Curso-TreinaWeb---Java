package br.com.treinaweb.parte1;

public class OperadorBinarioAnd {

  public static void main(String[] args) {
    int i = 40; //101000
    int j = 25; //011001
    int x = j & i;//001000
    System.out.println("x = " + x); //x = 8
  }

}