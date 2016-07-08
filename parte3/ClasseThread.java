package br.com.treinaweb.parte3;

public class ClasseThread extends Thread {
  private String mensagem = "Linha";

  public void setMensagem(String mensagem){
    this.mensagem = mensagem;
  }
  public void run(){
    for(int x=0;x<1000000;x++){
      String s = mensagem + " " + x;
      System.out.println(s);
    }
  }

}