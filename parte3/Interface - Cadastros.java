package br.com.treinaweb.parte3;

public interface Cadastros {
  public void incluir();
  public void alterar();
  public void excluir(int codigo);
}

package br.com.treinaweb.parte3;

public interface Enderecos {
  public String getEndereco();
  public void setEndereco(String endereco);
  public String getCep();
  public void setCep(String cep);
  public String getCidade();
  public void setCidade(String cidade);
}