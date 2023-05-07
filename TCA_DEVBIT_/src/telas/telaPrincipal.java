/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_lojageek", "root", "divino");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM produtos");
            ResultSet resultado = stConsultar.executeQuery();
            //Tira um molde da tabela
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) TbTabelaTelaPrincipal.getModel();
            //Limpa a tabela
            modeloTabela.setRowCount(0);
            //fazer enquanto tiver departamento na variável resultado
            while (resultado.next()) { 
              Object dep[] = {
                resultado.getString("codigo"),
                resultado.getString("produto"),
                resultado.getString("tpunitario"),
                resultado.getString("fornecedor"),
                 resultado.getString("estoque")  
              };
              modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TbTabelaTelaPrincipal = new javax.swing.JTable();
        BtnCadastrarProdutosTelaPrincipal = new javax.swing.JButton();
        BtnExcluirProdutoTelaPrincipal = new javax.swing.JButton();
        BtnAlterarProdutoTelaPrincipal1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastrarTelaPrincipal = new javax.swing.JMenu();
        MnRelatorioTelaPrincipal = new javax.swing.JMenu();
        mnItConsultarRelatorio = new javax.swing.JMenuItem();
        MnAjudaTelaPrincipal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema DEVBIT");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        TbTabelaTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TbTabelaTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TbTabelaTelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Tipo Unitario", "Fornecedor", "Estoque Atual"
            }
        ));
        TbTabelaTelaPrincipal.setName(""); // NOI18N
        TbTabelaTelaPrincipal.setOpaque(false);
        TbTabelaTelaPrincipal.setSelectionBackground(new java.awt.Color(51, 255, 0));
        jScrollPane1.setViewportView(TbTabelaTelaPrincipal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 70, 670, 390);

        BtnCadastrarProdutosTelaPrincipal.setBackground(new java.awt.Color(0, 204, 51));
        BtnCadastrarProdutosTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCadastrarProdutosTelaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtnCadastrarProdutosTelaPrincipal.setText("Cadastrar Produto");
        BtnCadastrarProdutosTelaPrincipal.setBorder(null);
        BtnCadastrarProdutosTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarProdutosTelaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCadastrarProdutosTelaPrincipal);
        BtnCadastrarProdutosTelaPrincipal.setBounds(40, 70, 240, 100);

        BtnExcluirProdutoTelaPrincipal.setBackground(new java.awt.Color(204, 0, 0));
        BtnExcluirProdutoTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnExcluirProdutoTelaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtnExcluirProdutoTelaPrincipal.setText("Excluir Produto");
        BtnExcluirProdutoTelaPrincipal.setBorder(null);
        BtnExcluirProdutoTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirProdutoTelaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExcluirProdutoTelaPrincipal);
        BtnExcluirProdutoTelaPrincipal.setBounds(40, 350, 240, 100);

        BtnAlterarProdutoTelaPrincipal1.setBackground(new java.awt.Color(255, 153, 0));
        BtnAlterarProdutoTelaPrincipal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnAlterarProdutoTelaPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        BtnAlterarProdutoTelaPrincipal1.setText("Alterar Produto");
        BtnAlterarProdutoTelaPrincipal1.setBorder(null);
        BtnAlterarProdutoTelaPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarProdutoTelaPrincipal1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlterarProdutoTelaPrincipal1);
        BtnAlterarProdutoTelaPrincipal1.setBounds(40, 210, 240, 100);

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));

        MnCadastrarTelaPrincipal.setText("Cadastro");
        jMenuBar1.add(MnCadastrarTelaPrincipal);

        MnRelatorioTelaPrincipal.setText("Relatorio");

        mnItConsultarRelatorio.setText("Consultar");
        mnItConsultarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsultarRelatorioActionPerformed(evt);
            }
        });
        MnRelatorioTelaPrincipal.add(mnItConsultarRelatorio);

        jMenuBar1.add(MnRelatorioTelaPrincipal);

        MnAjudaTelaPrincipal.setText("Ajuda");
        jMenuBar1.add(MnAjudaTelaPrincipal);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1006, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastrarProdutosTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarProdutosTelaPrincipalActionPerformed
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_BtnCadastrarProdutosTelaPrincipalActionPerformed

    private void BtnExcluirProdutoTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirProdutoTelaPrincipalActionPerformed
        new excluirProduto().setVisible(true); //Abre o ExcluirProduto
    }//GEN-LAST:event_BtnExcluirProdutoTelaPrincipalActionPerformed

    private void BtnAlterarProdutoTelaPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarProdutoTelaPrincipal1ActionPerformed
    new alterarProduto().setVisible(true);
    }//GEN-LAST:event_BtnAlterarProdutoTelaPrincipal1ActionPerformed

    private void mnItConsultarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsultarRelatorioActionPerformed
        new relatorio().setVisible(true);
    }//GEN-LAST:event_mnItConsultarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterarProdutoTelaPrincipal1;
    private javax.swing.JButton BtnCadastrarProdutosTelaPrincipal;
    private javax.swing.JButton BtnExcluirProdutoTelaPrincipal;
    private javax.swing.JMenu MnAjudaTelaPrincipal;
    private javax.swing.JMenu MnCadastrarTelaPrincipal;
    private javax.swing.JMenu MnRelatorioTelaPrincipal;
    private javax.swing.JTable TbTabelaTelaPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnItConsultarRelatorio;
    // End of variables declaration//GEN-END:variables
}
