package br.com.treinaweb.parte3;

public class TesteByte {

  public static void main(String[] args) {
    //Obtendo o maior e o menor valor
    byte maior = Byte.MAX_VALUE;
    byte menor = Byte.MIN_VALUE;
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);

    String s = "123";
    byte b = 0;
    //Convertendo de String para Byte
    b = Byte.parseByte(s);
    //Convertendo de Byte para String
    s = Byte.toString(b);
  }

}