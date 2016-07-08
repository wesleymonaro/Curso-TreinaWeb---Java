package br.com.treinaweb.parte3;

public class TesteAnimal {

  public static void main(String[] args) {
    Animal a;
    Gato g = new Gato();
    Cachorro c = new Cachorro();
    a = g;
    a.som(); // vai ecoar um miau.....
    a = c;
    a.som(); // vai ecoar um auauauau..

  }

}