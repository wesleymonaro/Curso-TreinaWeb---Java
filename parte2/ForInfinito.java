package br.com.treinaweb.parte2;

public class ForInfinito {

  public static void main(String[] args) {
    int i = 0;
    for(;;){
      System.out.println("i=" + i++);
      if(i==5)
        break;
    }
  }

}