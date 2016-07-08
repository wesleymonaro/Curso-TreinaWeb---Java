package br.com.treinaweb.parte3;

public class Fisica extends Cliente {
  protected String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void incluir(){
    status = "O cliente " + cpf + " foi incluido";
  }
}