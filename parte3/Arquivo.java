package br.com.treinaweb.parte3;
import java.io.*;
public class Arquivo {

  public static void main(String[] args) {
    lerArquivo("c:\\ler.txt");
  }
  public static void lerArquivo(String arquivo){
    File f = new File(arquivo);
    if (!f.exists()){
      System.out.println("Arquivo: " + arquivo + " não existe");
      return;
    }

    try{
      //is representa o fluxo de entrada a partir de um arquivo
      InputStream is = new FileInputStream(arquivo);
      //InputStreamReader é uma classe para converter os bytes em chars
      InputStreamReader isr = new InputStreamReader(is);
      //BufferedReader é um classe para armazenar os chars em memória
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine(); //primeira linha
      while(s!=null){
        System.out.println(s);
        s=br.readLine();
      }
    }catch(Exception x){
      System.out.println(x.getMessage());
    }
  }
}