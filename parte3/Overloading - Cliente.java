package br.com.treinaweb.parte3;

public abstract class Cliente {
  protected int codigo = 0;
  protected String nome = "";
  protected String status = "";
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
  public String getStatus() {
    return status;
  }

  public void excluir (){
    status = "O Cliente " + codigo + " foi excluido";
  }

  public void excluir (int codigo){
    status = "O Cliente " + codigo + " foi excluido";
  }

}