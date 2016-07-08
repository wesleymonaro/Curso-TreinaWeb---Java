package br.com.treinaweb.parte2;
import java.util.Arrays;
public class Array4 {

  public static void main(String[] args) {
    char[] n1 = {'B','D','A','E','C'};
    char[] n2 = {'B','D','A','E','C'};

    if(Arrays.equals(n1, n2)){
      System.out.println("Os Arrays são iguais");
    }else{
      System.out.println("Os Arrays são diferentes");
    }

  }

}