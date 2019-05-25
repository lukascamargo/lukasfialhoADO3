/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Carro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ,ukas.camargo
 */
public class DAO {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";    //Driver do MySQL 8.0 em diante - Se mudar o SGBD mude o Driver
    private static final String LOGIN = "root";                         //nome de um usuário do banco de dados
    private static final String SENHA = "";                             //sua senha de acesso
    private static String URL = "jdbc:mysql://localhost:3306/lojacarro?useTimezone=true&serverTimezone=UTC";  //URL do banco de dados
    private static Connection conexao;
    
    public static boolean salvar(Carro p)
    {
         boolean retorno = false;
        
        try {
            //Simulo uma inserção no banco de dados (INSERT INTO...)
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate("INSERT INTO carro (modelo,ano, valor) " + 
                    "VALUES(" +
                    "'" + p.getModelo() + "'" + "," +
                    "'" + p.getAno() + "'" + "," +
                    "'" + p.getValor() + "'" + ")"
                    );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
              
    }
    
    public static boolean atualizar(Carro p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        //return SimulaDB.getInstance().AtualizarCliente(p);
        
        boolean retorno = false;
        
        try {
            //Simulo uma inserção no banco de dados (INSERT INTO...)
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate("UPDATE carro SET " + 
                    " modelo =" + "'" + p.getModelo() + "'" + "," +
                    " ano =" + "'" + p.getAno() + "'" + "," +
                    " valor =" + "'" + p.getValor()+ "'"  +
                    " WHERE idcarro =" + p.getId()
                    );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
        
        
        
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        //return SimulaDB.getInstance().ExcluirCliente(pID);
        boolean retorno = false;
        
        try {
            //Simulo uma inserção no banco de dados (INSERT INTO...)
            //return SimulaDB.getInstance().SalvarCliente(p);
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            Statement comando = conexao.createStatement();
            int linhasAfetadas = comando.executeUpdate("DELETE FROM carro " + 
                    " WHERE idcarro =" + pID
                    );
            
            if(linhasAfetadas>0)
            {
                retorno = true;
            }
            else{
                retorno = false;
            }
            
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                retorno = false;
            }
            
        }
        
        return retorno;
        
                       
    }
    
    public static ArrayList<Carro> getCarros()
    {
         ArrayList<Carro> listaCarros = new ArrayList<Carro>();
        
        try {
            //return SimulaDB.getInstance().getClientes();
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM carro;");
            while(rs.next())
            {
                Carro c = new Carro();
                c.setId(rs.getInt("idcarro"));
                c.setModelo(rs.getString("modelo"));
                c.setAno(rs.getInt("ano"));
                c.setValor(rs.getDouble("Valor"));
                listaCarros.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            listaCarros = null;
        } catch (SQLException ex) {
            listaCarros = null;
        } finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaCarros = null;
            }
        }
        
        return listaCarros;
    }
}
