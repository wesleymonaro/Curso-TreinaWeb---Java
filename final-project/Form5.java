package br.com.treinaweb.parte4;
import javax.swing.*;
import java.awt.event.*;
public class Form5 implements ActionListener,KeyListener {
  JFrame f = new JFrame();
  JPanel pl = new JPanel();
  JLabel lblIdCategoria = new JLabel("Codigo:");
  JTextField txtIdCategoria = new JTextField("");
  JLabel lblCategoria = new JLabel("Categoria:");
  JTextField txtCategoria = new JTextField("");
  JButton cmdAlterar = new JButton("Alterar");
  JButton cmdIncluir = new JButton("Incluir");
  JButton cmdExcluir = new JButton("Excluir");
  JLabel lblStatus = new JLabel("Status:");
  //Adicionando Menus
  JMenuBar mnuBarra = new JMenuBar();
  JMenu mnuArquivo = new JMenu("Arquivo");
  JMenu mnuEditar = new JMenu("Editar");
  JMenuItem mnuSair = new JMenuItem("Sair");
  JMenuItem mnuAlterar = new JMenuItem("Alterar");
  JMenuItem mnuExcluir = new JMenuItem("Excluir");
  JMenuItem mnuIncluir = new JMenuItem("Incluir");
  JMenuItem mnuBuscar = new JMenuItem("Buscar");
  public void criarTela(){
    f.setSize(300,200);
    f.setLocation(150,200);
    f.setTitle("Cadastro de Categorias");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pl.setLayout(null);
    //Posição dos objetos na tela
    lblIdCategoria.setBounds(10,10,60,20);
    txtIdCategoria.setBounds(100,10,60,20);
    lblCategoria.setBounds(10,40,60,20);
    txtCategoria.setBounds(100,40,170,20);
    cmdAlterar.setBounds(10,70,80,20);
    cmdIncluir.setBounds(100,70,80,20);
    cmdExcluir.setBounds(190,70,80,20);
    lblStatus.setBounds(10,100,180,20);
    //Adicionando manipuladores de eventos
    cmdIncluir.addActionListener(this);
    cmdExcluir.addActionListener(this);
    cmdAlterar.addActionListener(this);
    txtIdCategoria.addKeyListener(this);
    //Adicionando os objetos no painel
    pl.add(lblIdCategoria);
    pl.add(txtIdCategoria);
    pl.add(lblCategoria);
    pl.add(txtCategoria);
    pl.add(cmdAlterar);
    pl.add(cmdIncluir);
    pl.add(cmdExcluir);
    pl.add(lblStatus);
    //Menus
    mnuBarra.add(mnuArquivo);
    mnuBarra.add(mnuEditar);
    mnuArquivo.add(mnuSair);
    mnuEditar.add(mnuAlterar);
    mnuEditar.add(mnuExcluir);
    mnuEditar.add(mnuIncluir);
    mnuEditar.add(new JSeparator());
    mnuEditar.add(mnuBuscar);
    mnuSair.addActionListener(this);
    mnuAlterar.addActionListener(this);
    mnuExcluir.addActionListener(this);
    mnuIncluir.addActionListener(this);
    mnuBuscar.addActionListener(this);
    f.setJMenuBar(mnuBarra);
    //Adicionando o painel ao formulário
    f.getContentPane().add(pl);
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
      Object o = e.getSource();
      if((o == cmdAlterar) || (o == mnuAlterar)){
        alterar();
      }
      if((o == cmdIncluir) || (o == mnuIncluir)){
        incluir();
      }
      if((o == cmdExcluir) || (o ==mnuExcluir)){
        excluir();
      }
      if(o==mnuBuscar){
        buscar();
      }
      if(o==mnuSair){
        txtCategoria.setText("Menu Sair");
        System.exit(0);
      }
  }
  void alterar(){
    lblStatus.setText("Alterar");
  }
  void excluir(){
    lblStatus.setText("Excluir");
  }
  void incluir(){
    lblStatus.setText("Incluir");
  }
  void buscar(){
    lblStatus.setText("Buscar");
  }
  public void keyPressed(KeyEvent e){
    int tecla = e.getKeyCode();
    if(tecla == KeyEvent.VK_F10)
      JOptionPane.showMessageDialog(f, "Tecla F10 pressionada");
  }
  public void keyReleased(KeyEvent e){
  }

  public void keyTyped(KeyEvent e) {
    char tecla = e.getKeyChar();
    lblStatus.setText("Tecla: " + tecla);
  }

}