package br.com.treinaweb.parte2;

public class Excecao2 {

  public static void main(String[] args) {
    int i = 5;
    int[] v = {0,2,4,8};

    try{
      System.out.println(i/v[0]);//ArithmeticException
      System.out.println(v[4]);//ArrayIndexOutOfBoundsException
    }catch(ArithmeticException e){
      System.out.println("Erro de operação aritmética");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Erro de índice inválido de vetor");
    }catch(Exception e){
      System.out.println("Erro genérico, não previsto acima");
    }finally{
      System.out.println("Sempre passa aqui");
    }

  }

}