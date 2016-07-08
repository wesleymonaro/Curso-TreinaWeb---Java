package br.com.treinaweb.parte1;
public class UtilizacaoBinario {
  static final int ler = 1;
  static final int alterar = 2;
  static final int incluir = 4;
  static final int excluir = 8;
  public static void main(String[] args) {
    int permissao = 0;
    //Atribuindo permissões
    permissao = permissao | ler;
    permissao = permissao | alterar;
    //Conferindo permissão
    System.out.println("permissão: " + permissao);//permissão: 5
    System.out.println(Integer.toBinaryString(permissao));//11

    //Verificando permissões
    if ((permissao & ler) == ler ){
      System.out.println("Tem permissão de leitura");
    }else{
      System.out.println("Não tem permissão de leitura");
    }
    if ((permissao & alterar) == alterar ){
      System.out.println("Tem permissão de alterar");
    }else{
      System.out.println("Não tem permissão de alterar");
    }
    if ((permissao & incluir) == incluir ){
      System.out.println("Tem permissão de incluir");
    }else{
      System.out.println("Não tem permissão de incluir");
    }
    if ((permissao & excluir) == excluir ){
      System.out.println("Tem permissão de excluir");
    }else{
      System.out.println("Não tem permissão de excluir");
    }
  }
}