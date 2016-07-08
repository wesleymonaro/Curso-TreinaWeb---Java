package br.com.treinaweb.parte4;
import javax.swing.*;
public class Form3 {
  public void criarTela(){
    JFrame f = new JFrame();
    f.setSize(290,180);
    f.setLocation(150,200);
    f.setTitle("Cadastro de Categorias");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pl = new JPanel();
    pl.setLayout(null);
    //IdCategoria
    JLabel lblIdCategoria = new JLabel("Código:");
    lblIdCategoria.setBounds(10,10,60,20);
    pl.add(lblIdCategoria);
    JTextField txtIdCategoria = new JTextField("");
    txtIdCategoria.setBounds(100,10,60,20);
    pl.add(txtIdCategoria);
    //Categoria
    JLabel lblCategoria = new JLabel("Categoria:");
    lblCategoria.setBounds(10,40,170,20);
    pl.add(lblCategoria);
    JTextField txtCategoria = new JTextField("");
    txtCategoria.setBounds(100,40,170,20);
    pl.add(txtCategoria);
    //Alterar
    JButton cmdAlterar = new JButton("Alterar");
    cmdAlterar.setBounds(10,70,80,20);
    pl.add(cmdAlterar);
    //Incluir
    JButton cmdIncluir = new JButton("Incluir");
    cmdIncluir.setBounds(100,70,80,20);
    pl.add(cmdIncluir);
    //Excluir
    JButton cmdExcluir = new JButton("Excluir");
    cmdExcluir.setBounds(190,70,80,20);
    pl.add(cmdExcluir);
    //Status
    JLabel lblStatus = new JLabel("Status:");
    lblStatus.setBounds(10,100,60,20);
    pl.add(lblStatus);
    f.add(pl);

    f.setVisible(true);
  }

}