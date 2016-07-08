package br.com.treinaweb.parte4;
import javax.swing.*;
import java.awt.event.*;
public class Form4 implements ActionListener {
  JFrame f = new JFrame();
  JPanel pl = new JPanel();
  JLabel lblIdCategoria = new JLabel("Código:");
  JTextField txtIdCategoria = new JTextField("");
  JButton cmdExcluir = new JButton("Excluir");
  JLabel lblStatus = new JLabel("Status:");
  public void criarTela(){
    //Configurações da Tela
    f.setSize(290,170);
    f.setLocation(150,200);
    f.setTitle("Cadastro de Categorias");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pl.setLayout(null);
    //Posição dos objetos na tela
    lblIdCategoria.setBounds(10,10,60,20);
    txtIdCategoria.setBounds(100,10,60,20);
    cmdExcluir.setBounds(190,10,80,20);
    lblStatus.setBounds(10,100,280,20);
    //Adicionando manipuladores de eventos
    cmdExcluir.addActionListener(this);
    //Adicionando os objetos no painel
    pl.add(lblIdCategoria);
    pl.add(txtIdCategoria);
    pl.add(cmdExcluir);
    pl.add(lblStatus);
    //Adicionando o painel ao formulário
    f.getContentPane().add(pl);
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    Object o = e.getSource();
    if(o == cmdExcluir){
      excluir();
    }
  }
  void excluir(){
    lblStatus.setText("Código: " + txtIdCategoria.getText() + " excluída");
  }

}