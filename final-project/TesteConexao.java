package br.com.treinaweb.parte4;

public class TesteConexao {

  public static void main(String[] args) {
    Conexao.getConnection();
    System.out.println(Conexao.status);
  }

}