package br.com.treinaweb.parte2;

public class IfElse {

  public static void main(String[] args) {
    int nota = 4;
    String resultado = "";
    if (nota > 7){
      resultado = "Aprovado";
    }else if (nota > 4){
      resultado = "Em recuperação";
    }else{
      resultado = "Reprovado";
    }

    System.out.println(resultado);

  }
}