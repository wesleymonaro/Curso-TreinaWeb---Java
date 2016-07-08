package br.com.treinaweb.parte2;
import java.util.*;
public class Map3 {

  public static void main(String[] args) {
    HashMap<String,Double> mapa =  new HashMap<String,Double>();

    mapa.put("JSE",174.90);
    mapa.put("JME",196.90);
    mapa.put("J2EE",210.90);
    mapa.put("EJB",220.90);

    Iterator i = mapa.keySet().iterator();
    while(i.hasNext()){
      String curso = (String)i.next();
      double preco = (double)mapa.get(curso);
      System.out.println(curso + ":" + preco);
    }

  }

}