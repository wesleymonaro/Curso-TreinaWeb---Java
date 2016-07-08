package br.com.treinaweb.parte2;

public class Excecao {

  public static void main(String[] args) {
    int i = 5;
    int x = 0;
    int r = 0;

    try{
      r = i/x;
    }catch(Exception e){
      System.out.println(e.getMessage());
    }finally{

    }
    System.out.println("r = " + r);
  }

}