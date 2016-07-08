package br.com.treinaweb.parte3;

public class TesteCliente {

  public static void main(String[] args) {
    Fisica c = new Fisica();
    c.setCodigo(1);
    c.setNome("Carlos");
    c.setCpf("000.000.000-00");
    c.incluir();
    System.out.println(c.getStatus());
  }

}