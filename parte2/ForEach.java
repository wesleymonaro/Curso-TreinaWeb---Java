package br.com.treinaweb.parte2;

public class ForEach {

  public static void main(String[] args) {
    int [] x = {0,2,4,6,8};

    //Modo convecional
    for(int i = 0; i < x.length; i++){
      System.out.println("x[" + i + "]=" + x[i]);
    }

    //Modo Java 5.0
    for (int elemento : x){
      System.out.println("elemento = " + elemento);
    }
  }
}