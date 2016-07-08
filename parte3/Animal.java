package br.com.treinaweb.parte3;

abstract class Animal {
  abstract void som();
}

package br.com.treinaweb.parte3;

public class Gato extends Animal {
  public void som(){
    System.out.println("miauuuuuuu!!!!");
  }

}

package br.com.treinaweb.parte3;

public class Cachorro extends Animal {
  public void som(){
    System.out.println("auauauauauauau!!");
  }

}