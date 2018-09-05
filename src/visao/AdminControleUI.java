/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleAdminControle;
import controle.ControleListaItens;
import controle.ControleListaClientes;

/**
 *
 * @author 18200647
 */
public class AdminControleUI extends javax.swing.JFrame {
    ControleAdminControle controle;
    /**
     * Creates new form AdminControle
     */
    public AdminControleUI(ControleAdminControle aThis) {
        controle = aThis;
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

        jPanel1 = new javax.swing.JPanel();
        botaoCadastraFuncionarios = new javax.swing.JButton();
        botaoCadastraClientes = new javax.swing.JButton();
        botaoCadastraProdutos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botao_listar_clientes = new javax.swing.JButton();
        botao_listar_produto = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle do Administrador"));

        botaoCadastraFuncionarios.setText("Cadastrar Funcionarios");
        botaoCadastraFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraFuncionariosActionPerformed(evt);
            }
        });

        botaoCadastraClientes.setText("Cadastrar Clientes");
        botaoCadastraClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraClientesActionPerformed(evt);
            }
        });

        botaoCadastraProdutos.setText("Cadastrar Produtos");
        botaoCadastraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraProdutosActionPerformed(evt);
            }
        });

        jButton4.setText("Listar Funcionarios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        botao_listar_clientes.setText("Listar Clientes");
        botao_listar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_listar_clientesActionPerformed(evt);
            }
        });

        botao_listar_produto.setText("Listar Produtos");
        botao_listar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_listar_produtoActionPerformed(evt);
            }
        });

        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCadastraFuncionarios)
                            .addComponent(botaoCadastraClientes)
                            .addComponent(botaoCadastraProdutos))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_listar_clientes)
                            .addComponent(jButton4)
                            .addComponent(botao_listar_produto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoCadastraClientes, botaoCadastraFuncionarios, botaoCadastraProdutos, botao_listar_clientes, botao_listar_produto, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastraFuncionarios)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastraClientes)
                    .addComponent(botao_listar_clientes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastraProdutos)
                    .addComponent(botao_listar_produto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        LoginUI login = new LoginUI();
//        login.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void botaoCadastraFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraFuncionariosActionPerformed
        CadastroFuncionarioUI telaCadastroFuncionario = new CadastroFuncionarioUI();
        telaCadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_botaoCadastraFuncionariosActionPerformed

    private void botaoCadastraClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraClientesActionPerformed
        CadastroClienteUI telaCadastroCliente = new CadastroClienteUI();
        telaCadastroCliente.setVisible(true);
        
    }//GEN-LAST:event_botaoCadastraClientesActionPerformed

    private void botaoCadastraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraProdutosActionPerformed
        CadastroProdutoUI telaCadastroProdutos = new CadastroProdutoUI();
        telaCadastroProdutos.setVisible(true);
        
    }//GEN-LAST:event_botaoCadastraProdutosActionPerformed

    private void botao_listar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_listar_produtoActionPerformed
        new ControleListaItens().iniciarListaProdutos();
        //telaListaProdutos.setVisible(true);   
    }//GEN-LAST:event_botao_listar_produtoActionPerformed

    private void botao_listar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_listar_clientesActionPerformed
        new ControleListaClientes().iniciarListaClientes();
    }//GEN-LAST:event_botao_listar_clientesActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* 1Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminControleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminControleUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastraClientes;
    private javax.swing.JButton botaoCadastraFuncionarios;
    private javax.swing.JButton botaoCadastraProdutos;
    private javax.swing.JButton botao_listar_clientes;
    private javax.swing.JButton botao_listar_produto;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
