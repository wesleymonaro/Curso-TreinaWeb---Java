package br.com.treinaweb.parte2;
import java.sql.ResultSet;
public class Cliente2 {
  private int codigo=0;
  private String nome="";
  private boolean ativo = false;

  public boolean getAtivo() {
    return ativo;
  }
  public int getCodigo() {
    return codigo;
  }
  public String getNome() {
    return nome;
  }
  public void setAtivo(boolean b) {
    ativo = b;
  }
  public void setCodigo(int i) {
    codigo = i;
  }
  public void setNome(String string) {
    nome = string;
  }
  public void alterarCliente(){
    //Instruções para alterar clientes
  }
  public int obterNumeroClientes(){
    int numeroClientes=0;
    // Instruções para obter o número de clientes
    return numeroClientes;
  }
  public int obterNumeroClientes(int situacao){
    int numeroClientes=0;
    //Instruções para obter o número de clientes
    //em determinada situação:ativo e inativo
    return numeroClientes;
  }
  public ResultSet listarClientes(){
    ResultSet rs = null;
    //Instruções para obter a lista de clientes
    return rs;
  }
}