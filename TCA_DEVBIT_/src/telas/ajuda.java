/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author guidi
 */
public class ajuda extends javax.swing.JFrame {

    /**
     * Creates new form ajuda
     */
    public ajuda() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAjuda = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastrarTelaPrincipal = new javax.swing.JMenu();
        itmcadastrar = new javax.swing.JMenuItem();
        itmalterar = new javax.swing.JMenuItem();
        itmexcluir = new javax.swing.JMenuItem();
        mnrelatorio = new javax.swing.JMenu();
        mnItConsultarRelatorio = new javax.swing.JMenuItem();
        MnAjudaTelaPrincipal = new javax.swing.JMenu();
        itmajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("EmailFicticio@Ficticiomail.com");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 260, 810, 92);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Ajuda Geral: Ctrl + Alt + Z");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 130, 383, 47);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Cadastrar Produto: Ctrl + Alt + V");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 383, 47);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Alterar Produto: Ctrl + Alt + B");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 383, 47);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Excluir Produto: Ctrl + Alt + N");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 383, 47);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Consultar: Ctrl + Alt + C");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 90, 383, 47);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("ATALHOS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 0, 266, 92);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("RELATAR PROBLEMA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 320, 560, 92);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("SUPORTE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 210, 266, 92);

        txtAjuda.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAjuda);
        txtAjuda.setBounds(20, 400, 690, 60);

        btnCadastrar.setBackground(new java.awt.Color(51, 204, 0));
        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Enviar");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(720, 400, 190, 60);

        MnCadastrarTelaPrincipal.setText("Cadastro");

        itmcadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmcadastrar.setText("Cadastrar");
        itmcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmcadastrarActionPerformed(evt);
            }
        });
        MnCadastrarTelaPrincipal.add(itmcadastrar);

        itmalterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmalterar.setText("Alterar");
        itmalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmalterarActionPerformed(evt);
            }
        });
        MnCadastrarTelaPrincipal.add(itmalterar);

        itmexcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmexcluir.setText("Excluir");
        itmexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmexcluirActionPerformed(evt);
            }
        });
        MnCadastrarTelaPrincipal.add(itmexcluir);

        jMenuBar1.add(MnCadastrarTelaPrincipal);

        mnrelatorio.setText("Relatorio");

        mnItConsultarRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnItConsultarRelatorio.setText("Consultar");
        mnItConsultarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsultarRelatorioActionPerformed(evt);
            }
        });
        mnrelatorio.add(mnItConsultarRelatorio);

        jMenuBar1.add(mnrelatorio);

        MnAjudaTelaPrincipal.setText("Ajuda");

        itmajuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmajuda.setText("geral");
        itmajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmajudaActionPerformed(evt);
            }
        });
        MnAjudaTelaPrincipal.add(itmajuda);

        jMenuBar1.add(MnAjudaTelaPrincipal);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1006, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmcadastrarActionPerformed
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_itmcadastrarActionPerformed

    private void itmalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmalterarActionPerformed
        new alterarProduto().setVisible(true);
    }//GEN-LAST:event_itmalterarActionPerformed

    private void itmexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmexcluirActionPerformed
        new excluirProduto().setVisible(true);
    }//GEN-LAST:event_itmexcluirActionPerformed

    private void mnItConsultarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsultarRelatorioActionPerformed
        new relatorio().setVisible(true);
    }//GEN-LAST:event_mnItConsultarRelatorioActionPerformed

    private void itmajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmajudaActionPerformed
        new ajuda().setVisible(true);
    }//GEN-LAST:event_itmajudaActionPerformed

    private void txtAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAjudaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
            if(txtAjuda.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O campo deve ser preenchido");
            txtAjuda.requestFocus();
            return; // para a execução do programa
        }
            
            JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso");
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnAjudaTelaPrincipal;
    private javax.swing.JMenu MnCadastrarTelaPrincipal;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JMenuItem itmajuda;
    private javax.swing.JMenuItem itmalterar;
    private javax.swing.JMenuItem itmcadastrar;
    private javax.swing.JMenuItem itmexcluir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnItConsultarRelatorio;
    private javax.swing.JMenu mnrelatorio;
    private javax.swing.JTextField txtAjuda;
    // End of variables declaration//GEN-END:variables
}
