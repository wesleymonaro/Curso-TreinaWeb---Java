package br.com.treinaweb.parte3;

public class TesteShort {

  public static void main(String[] args) {
    //Obtendo o maior e o menor valor
      short maior = Short.MAX_VALUE;
      short menor = Short.MIN_VALUE;
      System.out.println("Maior valor: "+ maior);
      System.out.println("Menor valor: " + menor);

      String s = "123";
      short b = 0;
      //Convertendo de String para short
      b = Short.parseShort(s);
      //Convertendo de short para String
      s = Short.toString(b);
  }

}