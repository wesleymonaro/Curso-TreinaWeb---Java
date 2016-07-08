package br.com.treinaweb.parte3;

public class TesteMath {

  public static void main(String[] args) {
    int a = -2;
    //Obtendo o valor absoluto
    a = Math.abs(a);
    System.out.println(a);

    //Exponenciação
    double d = Math.pow(2,8);
    System.out.println(d);

    //Gerando números Randômicos
    for(int i = 0; i< 10;i++){
      System.out.println(Math.random());
    }
  }

}