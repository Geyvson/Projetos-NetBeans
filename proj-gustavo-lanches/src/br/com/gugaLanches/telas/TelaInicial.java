/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.gugaLanches.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Geyvson
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadUsu = new javax.swing.JMenuItem();
        menCadCli = new javax.swing.JMenuItem();
        menCadProd = new javax.swing.JMenuItem();
        menCadCont = new javax.swing.JMenuItem();
        menVen = new javax.swing.JMenu();
        menVenBalc = new javax.swing.JMenuItem();
        menVenDeliv = new javax.swing.JMenuItem();
        menVenMesa = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelCont = new javax.swing.JMenuItem();
        menRelCli = new javax.swing.JMenuItem();
        menRelUsu = new javax.swing.JMenuItem();
        menRelVend = new javax.swing.JMenuItem();
        menAju = new javax.swing.JMenu();
        menAjuSob = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menOpcDesc = new javax.swing.JMenuItem();
        menOpcFechar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gustavo Lanches");
        setPreferredSize(new java.awt.Dimension(1400, 830));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1133, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Usuário:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        lblData.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menCad.setText("Cadastro");

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadUsu.setText("Usuário");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menCadProd.setText("Produto");
        menCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadProdActionPerformed(evt);
            }
        });
        menCad.add(menCadProd);

        menCadCont.setText("Conta");
        menCad.add(menCadCont);

        Menu.add(menCad);

        menVen.setText("Vendas");

        menVenBalc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menVenBalc.setText("Balcão");
        menVenBalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menVenBalcActionPerformed(evt);
            }
        });
        menVen.add(menVenBalc);

        menVenDeliv.setText("Delivery");
        menVenDeliv.setEnabled(false);
        menVen.add(menVenDeliv);

        menVenMesa.setText("Mesa");
        menVenMesa.setEnabled(false);
        menVen.add(menVenMesa);

        Menu.add(menVen);

        menRel.setText("Relatórios");
        menRel.setEnabled(false);

        menRelCont.setText("Contas");
        menRel.add(menRelCont);

        menRelCli.setText("Clientes");
        menRel.add(menRelCli);

        menRelUsu.setText("Usuários");
        menRel.add(menRelUsu);

        menRelVend.setText("Vendas");
        menRelVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelVendActionPerformed(evt);
            }
        });
        menRel.add(menRelVend);

        Menu.add(menRel);

        menAju.setText("Ajuda");

        menAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menAjuSob.setText("Sobre");
        menAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobActionPerformed(evt);
            }
        });
        menAju.add(menAjuSob);

        Menu.add(menAju);

        menOpc.setText("Opção");

        menOpcDesc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menOpcDesc.setText("Desconectar");
        menOpcDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcDescActionPerformed(evt);
            }
        });
        menOpc.add(menOpcDesc);

        menOpcFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menOpcFechar.setText("Fechar");
        menOpcFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcFecharActionPerformed(evt);
            }
        });
        menOpc.add(menOpcFechar);

        Menu.add(menOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1414, 830));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menRelVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelVendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menRelVendActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Colocando a Data 
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menOpcFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcFecharActionPerformed
        // Sair do Sistema
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja SAIR?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menOpcFecharActionPerformed

    private void menOpcDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcDescActionPerformed
        // Desconectar
        int sair = JOptionPane.showConfirmDialog(null, "Deseja Desconectar?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_menOpcDescActionPerformed

    private void menAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobActionPerformed
        // Chamando a tela Sobre
        TelaSobre tela = new TelaSobre();
        tela.setVisible(true);
    }//GEN-LAST:event_menAjuSobActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
        // Chamando a tela de usuário dentro do painel desktop
        TelaUsuario tela = new TelaUsuario();
        tela.setVisible(true);
        desktop.add(tela);
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        // TODO add your handling code here:
        TelaCliente tela = new TelaCliente();
        tela.setVisible(true);
        desktop.add(tela);
    }//GEN-LAST:event_menCadCliActionPerformed

    private void menCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadProdActionPerformed
        // TODO add your handling code here:
        TelaProdutos tela= new TelaProdutos();
        tela.setVisible(true);
        desktop.add(tela);
    }//GEN-LAST:event_menCadProdActionPerformed

    private void menVenBalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menVenBalcActionPerformed
        // TODO add your handling code here:
        TelaVendasBalcao tela = new TelaVendasBalcao();
        tela.setVisible(true);
        desktop.add(tela);
    }//GEN-LAST:event_menVenBalcActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenuItem menAjuSob;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadCont;
    private javax.swing.JMenuItem menCadProd;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuItem menOpcDesc;
    private javax.swing.JMenuItem menOpcFechar;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelCli;
    private javax.swing.JMenuItem menRelCont;
    private javax.swing.JMenuItem menRelUsu;
    private javax.swing.JMenuItem menRelVend;
    private javax.swing.JMenu menVen;
    private javax.swing.JMenuItem menVenBalc;
    public static javax.swing.JMenuItem menVenDeliv;
    public static javax.swing.JMenuItem menVenMesa;
    // End of variables declaration//GEN-END:variables
}
