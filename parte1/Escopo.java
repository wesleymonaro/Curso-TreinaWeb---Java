package br.com.treinaweb.parte1;

public class Escopo {
    //site é uma variável membro de uma classe
    //ela é visível em qualquer lugar dentro da classe
    String site = "www.treinaweb.com.br";
    public static void main(String[] args) {
      //curso é uma variável no nível de método
      //ela é visível apenas dentro do bloco do método
      String curso = "J2SE";
      try{
        //msg é uma variável local
        //ela é visível apenas dentro do bloco try
        String msg= "Curso " + curso;
        System.out.println(msg);
      }catch(Exception e){
        //e é uma variável local passada como parâmetro
        //ela é visível apenas dentro do bloco catch
        System.out.println(e.getMessage());
      }

    }
}