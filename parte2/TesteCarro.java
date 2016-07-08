package br.com.treinaweb.parte2;

public class TesteCarro {

  public static void main(String[] args) {
    Carro c = new Carro();
    c.modelo = "Celta";
    c.motor = "1.0";
    c.cor = "Preta";
    c.ligar();
    c.mudarMarcha();
    c.acelerar();
    c.brecar();
    c.desligar();
  }

}