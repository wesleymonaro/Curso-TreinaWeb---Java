package br.com.treinaweb.parte3;
import java.io.*;
public class Arquivo2 {

  public static void main(String[] args) {
    copiarArquivo();
  }
  public static void copiarArquivo(){
    //lendo linhas
    try{
      FileReader i = new FileReader("c:\\ler.txt");
      FileWriter o = new FileWriter("c:\\gravar.txt");
      BufferedReader in = new BufferedReader(i);
      PrintWriter out = new PrintWriter(o);
      String linha;
      while((linha = in.readLine()) != null){
        System.out.println(linha);
        out.println(linha);
      }
      out.flush();
      i.close();
      o.close();
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}