package br.com.treinaweb.parte3;

public class TesteChar {

  public static void main(String[] args) {
    // Verificando se é digito ou letra
    char c ='5';
    if(Character.isDigit(c))
      System.out.println(c + " é digito:");
    if (Character.isLetter(c))
      System.out.println(c + " é letra: ");

  }

}