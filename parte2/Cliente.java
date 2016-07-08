package br.com.treinaweb.parte2;

public class Cliente {
  private int codigo;
  private String nome;
  private boolean ativo;

  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

}