package br.com.wj.dal;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Geyvson
 */

// classe de conexão
public class ModuloConexao {

//Metodo de Conexão com o Banco de Dados
    public static Connection conectaBD() {

        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/wjchaveiro";
        String user = "dba";
        String password = "Txemr2003";

        try {
            conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar o Banco de Dados:  " + e.getMessage());
            return null;
        }

    }

}
