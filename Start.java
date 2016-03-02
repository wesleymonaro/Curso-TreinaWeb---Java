package br.com.treinaweb.parte4;
import java.sql.*;
public class Start {

  public static void main(String[] args) {
    Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      String url = "jdbc:mysql://127.0.0.1/loja?user=root&password=1234";
      con = DriverManager.getConnection(url);
      System.out.println("Conexão Aberta!");
    }catch(Exception e){
        System.out.println("Conexão falhou" + e.getMessage());
    }
  }
}

/*//MYSQL
Class.forName("com.mysql.jdbc.Driver").newInstance();
String url = "jdbc:mysql://100.100.10.1/loja?user=admin&password=1234";
Connection con = DriverManager.getConnection(url);

//SQL SERVER 2008
Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
String url = "jdbc:microsoft:sqlserver://Localhost:1433";
Connection con = DriverManager.getConnection(url, "admin", "1234");

//POSTGRESQL
Class.forName("org.postgresql.Driver");
String url = "jdbc:postgresql://100.100.10.1:5432/loja";
Connection con = DriverManager.getConnection(url, "admin", "1234");*/