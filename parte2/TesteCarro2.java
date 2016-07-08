package br.com.treinaweb.parte2;

public class TesteCarro2 {

  public static void main(String[] args) {
    Carro2 c1 = new Carro2();
    Carro2 c2 = new Carro2();

    c1.modelo = "Celta";
    Carro2.cor = "Vermelho";

    System.out.println(Carro2.cor);
    System.out.println(c1.modelo);

    c2.modelo = "Astra";
    c2.cor = "Preto";

    System.out.println(c2.modelo);
    System.out.println(c2.cor);

    System.out.println(c1.modelo);
    System.out.println(c1.cor);

  }

}