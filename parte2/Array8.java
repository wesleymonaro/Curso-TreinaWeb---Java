package br.com.treinaweb.parte2;

public class Array8 {

  public static void main(String[] args) {
    int d[][] = new int [2][3];
    d[0][0] = 3;
    d[0][1] = 6;
    d[0][2] = 9;
    d[1][0] = 12;
    d[1][1] = 15;
    d[1][2] = 18;

    for(int i = 0; i<d.length; i++){
      for(int j=0; j < d[i].length;j++){
        System.out.print(d[i][j] + " ");
      }
      System.out.print("\n");
    }

  }

}