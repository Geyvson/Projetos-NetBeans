/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.wj.telas;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Geyvson
 */
public class Consulta {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void PegarUsuario(int id){
        
        String sql = "select * from tb_usuarios";
        try {
            pst  =conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

    
}
