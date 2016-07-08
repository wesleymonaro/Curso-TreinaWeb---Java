package br.com.treinaweb.parte1;

public class OperadorBinario {

  public static void main(String[] args) {
    int x = 13;
    int r = 0;
    String b="";

    System.out.println("x: " + x);
    b = Integer.toBinaryString(x);
    System.out.println("b: " + b);
    System.out.println("Conferindo: " + Integer.parseInt(b,2));
    System.out.println("--------");

    //Operador Shift
    r= x>>1;
    System.out.println("r: " + r);
    b = Integer.toBinaryString(r);
    System.out.println("b: " + b);
    System.out.println("Conferindo: " + Integer.parseInt(b,2));

    System.out.println("----------");

    r = x << 1;
    System.out.println("r: " + r);
    b = Integer.toBinaryString(r);
    System.out.println("b: " + b);
    System.out.println("Conferindo: " + Integer.parseInt(b,2));

  }

}