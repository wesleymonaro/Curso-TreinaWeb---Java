package br.com.treinaweb.parte3;

public class TesteBoolean {
  static void main(String[] args) {
    boolean b = false;
    if(b == false){
      System.out.println("Falso");
    }

    String s = "false";
    // Convertendo de String para boolean

    b = Boolean.parseBoolean(s);
    // Convertendo de Boolean para String
    s = Boolean.toString(b);

  }

}