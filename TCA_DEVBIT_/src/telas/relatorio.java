package telas;

public class relatorio extends javax.swing.JFrame {

    public relatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnMaiorEstoque = new javax.swing.JButton();
        btnMenosVendidos = new javax.swing.JButton();
        btnMenorEstoque = new javax.swing.JButton();
        btnMaisVendidos = new javax.swing.JButton();
        mnubarRelatorio = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatórios");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        btnMaiorEstoque.setBackground(new java.awt.Color(0, 51, 255));
        btnMaiorEstoque.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMaiorEstoque.setText("Maior Estoque");
        btnMaiorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaiorEstoque);
        btnMaiorEstoque.setBounds(220, 90, 140, 40);

        btnMenosVendidos.setBackground(new java.awt.Color(0, 51, 255));
        btnMenosVendidos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMenosVendidos.setText("Menos Vendidos");
        btnMenosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosVendidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenosVendidos);
        btnMenosVendidos.setBounds(220, 240, 140, 40);

        btnMenorEstoque.setBackground(new java.awt.Color(0, 51, 255));
        btnMenorEstoque.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMenorEstoque.setText("Menor Estoque");
        btnMenorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenorEstoque);
        btnMenorEstoque.setBounds(220, 140, 140, 40);

        btnMaisVendidos.setBackground(new java.awt.Color(0, 51, 255));
        btnMaisVendidos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnMaisVendidos.setText("Mais Vendidos");
        btnMaisVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVendidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaisVendidos);
        btnMaisVendidos.setBounds(220, 190, 140, 40);

        mnubarRelatorio.setBackground(new java.awt.Color(51, 51, 255));

        jMenu1.setText("Cadastro ");
        mnubarRelatorio.add(jMenu1);

        jMenu3.setText("Ajuda");
        mnubarRelatorio.add(jMenu3);

        jMenu2.setText("Relatório");
        mnubarRelatorio.add(jMenu2);

        setJMenuBar(mnubarRelatorio);

        setSize(new java.awt.Dimension(616, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnMaiorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void btnMenosVendidosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void btnMenorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void btnMaisVendidosActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnMaiorEstoque;
    private javax.swing.JButton btnMaisVendidos;
    private javax.swing.JButton btnMenorEstoque;
    private javax.swing.JButton btnMenosVendidos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar mnubarRelatorio;
    // End of variables declaration                   
}
