package br.com.treinaweb.parte4;
import javax.swing.JFrame;
public class Form {
  public void criarTela(){
    JFrame f = new JFrame();
    f.setSize(290,150);
    f.setLocation(150,200);
    f.setTitle("Cadastro de Categorias");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}