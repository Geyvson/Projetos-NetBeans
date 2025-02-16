/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.wj.dal;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Geyvson
 */
public class Autinticadora {
    
    
    
    
    
    
    
    
    
    private LocalDate dtprevista;

    
    public void avisoInicial(){
        LocalDate data = LocalDate.now();
        
        long resultDias = ChronoUnit.DAYS.between(data, dtprevista);
        
        
        
        
        if (resultDias < 15 && resultDias > 0) {
            if(resultDias < 15 && resultDias > 1){
                JOptionPane.showMessageDialog(null, "Existe parametros do sistema a serem modificados/n O DESENVOLVEDOR precisa ser informado!");
            }else{
                JOptionPane.showMessageDialog(null, "Sistema bloqueado/n Informe ao DESENVOLVEDOR!");
                
            }
            
        } else {
        }
    }
    
}
