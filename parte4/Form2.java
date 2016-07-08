package br.com.treinaweb.parte4;
import javax.swing.*;
public class Form2 {
  public void criarTela(){
    JFrame f = new JFrame();
    f.setSize(290,150);
    f.setLocation(150,200);
    f.setTitle("Cadastro de Categorias");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel pl = new JPanel();
    pl.setLayout(null);

    JLabel lblIdCategoria = new JLabel("Código");
    lblIdCategoria.setBounds(10,10,60,20);
    pl.add(lblIdCategoria);

    JTextField txtIdCategoria = new JTextField("");
    txtIdCategoria.setBounds(80,10,60,20);
    pl.add(txtIdCategoria);

    JButton cmdBuscar = new JButton("Buscar");
    cmdBuscar.setBounds(150,10,80,20);
    pl.add(cmdBuscar);

    f.add(pl);

    f.setVisible(true);
  }

}