package br.com.treinaweb.parte3;

public class TesteClasseThread {

  public static void main(String[] args) {
    ClasseThread x = new ClasseThread();
    ClasseThread y = new ClasseThread();

    x.setMensagem("x:");
    y.setMensagem("y:");

    x.start();
    y.start();

  }
}