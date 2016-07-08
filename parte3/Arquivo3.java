package br.com.treinaweb.parte3;
import java.io.*;
public class Arquivo3 {

  public static void main(String[] args) {
    digitarTeclado();
  }
  public static void digitarTeclado(){
    String linha;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);
    System.out.println("Digite algo no console e tecle enter.");
    try{
      linha = in.readLine();
      System.out.println("linha: " + linha);
      in.close();
    }catch(Exception e){
      e.getMessage();
    }
  }
}