package br.com.gugaLanches.dal;

/**
 *
 * @author Geyvson
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ModuloConexao {
    //Métodoresponsável para estabelecer a conexão
    public static Connection conectaDb(){
        //iniciando a conexão
        Connection conn = null;
        
        //Chamar o Driver
        
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/gustavo_lanches";
        String user = "root";
        String senha = "Txemr2003";
        
        
        try {
            conn = DriverManager.getConnection(url, user, senha);
            return conn;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o Banco de Dados!!!");
            //Linha para verificar o erro
            //System.out.println(e);
            return null;
        }
        
                     
        
        
    }
    
}
