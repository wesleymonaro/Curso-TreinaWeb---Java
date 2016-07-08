package br.com.treinaweb.parte2;
import java.util.Arrays;
public class Array5 {

  public static void main(String[] args) {
    char[] nota = new char[5];

    Arrays.fill(nota,'A');

    for(int i = 0; i < nota.length; i++){
      System.out.println("Nota = " + nota[i]);
    }

  }

}