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

public class excluirProduto extends javax.swing.JFrame {

    /**
     * Creates new form excluirProduto
     */
    public excluirProduto() {
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

        iblAvisoExcluir4 = new javax.swing.JLabel();
        iblCodigoExcluir = new javax.swing.JLabel();
        iblAvisoExcluir1 = new javax.swing.JLabel();
        iblAvisoExcluir2 = new javax.swing.JLabel();
        iblAvisoExcluir3 = new javax.swing.JLabel();
        iblAvisoExcluir = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        BtnExcluirExcluir = new javax.swing.JButton();
        MnExcluir = new javax.swing.JMenuBar();
        MnCadastroExcluir = new javax.swing.JMenu();
        MnRelatorioExcluir = new javax.swing.JMenu();
        MnAjudaTelaExcluir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        iblAvisoExcluir4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iblAvisoExcluir4.setForeground(new java.awt.Color(255, 102, 102));
        iblAvisoExcluir4.setText("excluí-las e considere fazer um backup dos dados importantes antes de qualquer exclusão. ");
        getContentPane().add(iblAvisoExcluir4);
        iblAvisoExcluir4.setBounds(130, 200, 790, 100);

        iblCodigoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        iblCodigoExcluir.setText("CÓDIGO:");
        getContentPane().add(iblCodigoExcluir);
        iblCodigoExcluir.setBounds(120, 280, 150, 100);

        iblAvisoExcluir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iblAvisoExcluir1.setForeground(new java.awt.Color(255, 102, 102));
        iblAvisoExcluir1.setText("Por favor, esteja ciente de que, quando você excluir informações da tabela, elas serão");
        getContentPane().add(iblAvisoExcluir1);
        iblAvisoExcluir1.setBounds(150, 110, 680, 100);

        iblAvisoExcluir2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iblAvisoExcluir2.setForeground(new java.awt.Color(255, 102, 102));
        iblAvisoExcluir2.setText("permanentemente removidas e não poderão ser recuperadas.");
        getContentPane().add(iblAvisoExcluir2);
        iblAvisoExcluir2.setBounds(240, 140, 490, 100);

        iblAvisoExcluir3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iblAvisoExcluir3.setForeground(new java.awt.Color(255, 102, 102));
        iblAvisoExcluir3.setText("Recomendamos que você verifique cuidadosamente todas as informações antes de");
        getContentPane().add(iblAvisoExcluir3);
        iblAvisoExcluir3.setBounds(150, 170, 680, 100);

        iblAvisoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        iblAvisoExcluir.setForeground(new java.awt.Color(255, 102, 102));
        iblAvisoExcluir.setText("AVISO: Exclusão de informações na tabela");
        getContentPane().add(iblAvisoExcluir);
        iblAvisoExcluir.setBounds(140, 40, 720, 100);

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(100, 360, 610, 100);

        BtnExcluirExcluir.setBackground(new java.awt.Color(255, 51, 51));
        BtnExcluirExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnExcluirExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BtnExcluirExcluir.setText("Excluir");
        BtnExcluirExcluir.setBorder(null);
        BtnExcluirExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExcluirExcluir);
        BtnExcluirExcluir.setBounds(720, 360, 170, 100);

        MnCadastroExcluir.setText("Cadastro");
        MnExcluir.add(MnCadastroExcluir);

        MnRelatorioExcluir.setText("Relatorio");
        MnExcluir.add(MnRelatorioExcluir);

        MnAjudaTelaExcluir.setText("Ajuda");
        MnExcluir.add(MnAjudaTelaExcluir);

        setJMenuBar(MnExcluir);

        setSize(new java.awt.Dimension(1006, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void BtnExcluirExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirExcluirActionPerformed
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            //Indica o nome da classe do driver JDBC colocada na Library do projto
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Faz a conexão com o banco de dados  guarda na variável conectado
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_lojageek", "root", "divino");
            //Prepara um comando SQL DELETE incompleto
            PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
            //Completa o comando SQL DELETE preparado na linha anterior
            stExcluir.setString(1, txtCodigo.getText());
             //Executa o comando DELETE e insere os dados digitados na tabela departamento do banco de dados
            stExcluir.executeUpdate();
            //Mostra a mensagem de confirmação da exclusao do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
            //Limpar os campos na tela
            txtCodigo.setText("");           
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_BtnExcluirExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(excluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(excluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(excluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(excluirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new excluirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluirExcluir;
    private javax.swing.JMenu MnAjudaTelaExcluir;
    private javax.swing.JMenu MnCadastroExcluir;
    private javax.swing.JMenuBar MnExcluir;
    private javax.swing.JMenu MnRelatorioExcluir;
    private javax.swing.JLabel iblAvisoExcluir;
    private javax.swing.JLabel iblAvisoExcluir1;
    private javax.swing.JLabel iblAvisoExcluir2;
    private javax.swing.JLabel iblAvisoExcluir3;
    private javax.swing.JLabel iblAvisoExcluir4;
    private javax.swing.JLabel iblCodigoExcluir;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
