package telas;

public class relatorio2 extends javax.swing.JFrame {

    public relatorio2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnMaiorEstoque2 = new javax.swing.JButton();
        btnMaisVendidos2 = new javax.swing.JButton();
        btnMenosVendidos2 = new javax.swing.JButton();
        btnMenorEstoque2 = new javax.swing.JButton();
        ScrollRelatorio2 = new javax.swing.JScrollPane();
        tblRelatorio = new javax.swing.JTable();
        mnubarRelatorio2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório");
        getContentPane().setLayout(null);

        btnMaiorEstoque2.setBackground(new java.awt.Color(0, 51, 255));
        btnMaiorEstoque2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMaiorEstoque2.setText("Maior Estoque");
        btnMaiorEstoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorEstoque2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaiorEstoque2);
        btnMaiorEstoque2.setBounds(430, 70, 140, 40);

        btnMaisVendidos2.setBackground(new java.awt.Color(0, 51, 255));
        btnMaisVendidos2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMaisVendidos2.setText("Mais Vendidos");
        btnMaisVendidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVendidos2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaisVendidos2);
        btnMaisVendidos2.setBounds(430, 170, 140, 40);

        btnMenosVendidos2.setBackground(new java.awt.Color(0, 51, 255));
        btnMenosVendidos2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMenosVendidos2.setText("Menos Vendidos");
        btnMenosVendidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosVendidos2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosVendidos2);
        btnMenosVendidos2.setBounds(430, 220, 140, 40);

        btnMenorEstoque2.setBackground(new java.awt.Color(0, 51, 255));
        btnMenorEstoque2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMenorEstoque2.setText("Menor Estoque");
        btnMenorEstoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorEstoque2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenorEstoque2);
        btnMenorEstoque2.setBounds(430, 120, 140, 40);

        tblRelatorio.setBackground(new java.awt.Color(60, 63, 65));
        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Tipo Unitário", "Fornecedor"
            }
        ));
        ScrollRelatorio2.setViewportView(tblRelatorio);

        getContentPane().add(ScrollRelatorio2);
        ScrollRelatorio2.setBounds(0, 0, 420, 402);

        mnubarRelatorio2.setBackground(new java.awt.Color(51, 51, 255));

        jMenu1.setText("Cadastro ");
        mnubarRelatorio2.add(jMenu1);

        jMenu3.setText("Ajuda");
        mnubarRelatorio2.add(jMenu3);

        jMenu2.setText("Relatório");
        mnubarRelatorio2.add(jMenu2);

        setJMenuBar(mnubarRelatorio2);

        setSize(new java.awt.Dimension(592, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnMaiorEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void btnMaisVendidos2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void btnMenosVendidos2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void btnMenorEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane ScrollRelatorio2;
    private javax.swing.JButton btnMaiorEstoque2;
    private javax.swing.JButton btnMaisVendidos2;
    private javax.swing.JButton btnMenorEstoque2;
    private javax.swing.JButton btnMenosVendidos2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar mnubarRelatorio2;
    private javax.swing.JTable tblRelatorio;
    // End of variables declaration                   
}



