package br.com.treinaweb.parte2;
import java.util.Arrays;
public class Array6 {

  public static void main(String[] args) {
    char[] nota = {'B','D','A','E','C'};

    Arrays.sort(nota);

    int posicao = Arrays.binarySearch(nota,'C');

    System.out.println("O Elemento C está na posição " + posicao);

  }

}