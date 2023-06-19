/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import conexao.estoDao;
import conexao.forneDao;
import gerenEsto.estoque;
import gerenForne.fornecedores;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class frmEstoque extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionario
     */
    public frmEstoque() {
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

        title = new javax.swing.JLabel();
        txtIngrediente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        txtIdF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEsto = new javax.swing.JTable();
        btPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdE = new javax.swing.JTextField();
        btCarregarCampo = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbxForne = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        title.setText("ID");

        txtIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngredienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade");

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Id Fornecedor");

        jLabel7.setText("Gerenciamento do Estoque");

        tabEsto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Ingrediente", "Nome Ingrediente", "Quantidade", "Id_Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(tabEsto);

        btPesquisar.setText("LISTAR CAMPOS");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrediente");

        txtIdE.setEnabled(false);
        txtIdE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEActionPerformed(evt);
            }
        });

        btCarregarCampo.setText("SELECIONAR CAMPOS");
        btCarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarregarCampoActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR CAMPOS");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        cbxForne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3" }));
        cbxForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxForneActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione o Fornecedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtIdF, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(title)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIdE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btCadastrar)
                        .addGap(30, 30, 30)
                        .addComponent(btAlterar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel5)
                                .addContainerGap(622, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCarregarCampo)
                                .addGap(18, 18, 18)
                                .addComponent(btPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(title)
                            .addComponent(txtIdE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btAlterar))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCarregarCampo)
                        .addComponent(btLimpar)
                        .addComponent(btPesquisar)
                        .addComponent(cbxForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String ingrediente;
        int qtd, idf;
        qtd = Integer.parseInt(txtQtd.getText());
        ingrediente = txtIngrediente.getText();
        idf = Integer.parseInt(txtIdF.getText());
        
        // Setando os dados digitados no forms para a classe Estoque
        estoque objEsto = new estoque();
        objEsto.setQuantidade(qtd);
        objEsto.setIngrediente(ingrediente);
        objEsto.setIdFornecedor(idf);
        
        // Conexao com forneDAO
        estoDao objEstoDao = new estoDao();
        objEstoDao.cadastrarEstoque(objEsto);
        
        listarEstoque();
        LimparCampos();
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngredienteActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        listarEstoque();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txtIdEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEActionPerformed

    private void btCarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarregarCampoActionPerformed
        
        CarregarCampos();
    }//GEN-LAST:event_btCarregarCampoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        
        AlterarEstoque();
        listarEstoque();                            
        
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        ExcluirForne();
        listarEstoque();
        LimparCampos();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void cbxForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxForneActionPerformed
        int choice = cbxForne.getSelectedIndex();
        switch (choice){
            case 1:
                filtrarEstoque1();
                break;
            case 2:
                filtrarEstoque2();
                break;
            case 3:   
                filtrarEstoque3();
                break;
            default:
                listarEstoque();
                break;
        }
    }//GEN-LAST:event_cbxForneActionPerformed

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
            java.util.logging.Logger.getLogger(frmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCarregarCampo;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbxForne;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabEsto;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtIdE;
    private javax.swing.JTextField txtIdF;
    private javax.swing.JTextField txtIngrediente;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    private void listarEstoque(){
        try {
            estoDao objEsto = new estoDao();
            
            DefaultTableModel model = (DefaultTableModel) tabEsto.getModel();
            model.setNumRows(0);
            
           ArrayList<estoque> lista = objEsto.listarEstoque();
           
           for(int i=0; i<lista.size(); i++){
               model.addRow(new Object[]{
                   lista.get(i).getIdIngrediente(),
                   lista.get(i).getIngrediente(),
                   lista.get(i).getQuantidade(),
                   lista.get(i).getIdFornecedor(),

               });
               
           }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores view " + erro);
        }
    }
    
    private void CarregarCampos(){
        int setar = tabEsto.getSelectedRow();
        
        txtIdE.setText(tabEsto.getModel().getValueAt(setar, 0).toString());
        txtIngrediente.setText(tabEsto.getModel().getValueAt(setar, 1).toString());
        txtQtd.setText(tabEsto.getModel().getValueAt(setar, 2).toString());
        txtIdF.setText(tabEsto.getModel().getValueAt(setar, 3).toString());
  
        
    }
        

     public void filtrarEstoque1(){
        try {
            estoDao objEsto = new estoDao();
            
            DefaultTableModel model = (DefaultTableModel) tabEsto.getModel();
            model.setNumRows(0);
            
           ArrayList<estoque> lista = objEsto.filtrarEstoque1();
           
           for(int i=0; i<lista.size(); i++){
               model.addRow(new Object[]{
                   lista.get(i).getIdIngrediente(),
                   lista.get(i).getIngrediente(),
                   lista.get(i).getQuantidade(),
                   lista.get(i).getIdFornecedor(),

               });
               
           }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores view " + erro);
        }
        
    }
     public void filtrarEstoque2(){
        try {
            estoDao objEsto = new estoDao();
            
            DefaultTableModel model = (DefaultTableModel) tabEsto.getModel();
            model.setNumRows(0);
            
           ArrayList<estoque> lista = objEsto.filtrarEstoque2();
           
           for(int i=0; i<lista.size(); i++){
               model.addRow(new Object[]{
                   lista.get(i).getIdIngrediente(),
                   lista.get(i).getIngrediente(),
                   lista.get(i).getQuantidade(),
                   lista.get(i).getIdFornecedor(),

               });
               
           }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, " Listar valores view  " + erro);
        }
        
    }      
     public void filtrarEstoque3(){
        try {
            estoDao objEsto = new estoDao();
            
            DefaultTableModel model = (DefaultTableModel) tabEsto.getModel();
            model.setNumRows(0);
            
           ArrayList<estoque> lista = objEsto.filtrarEstoque3();
           
           for(int i=0; i<lista.size(); i++){
               model.addRow(new Object[]{
                   lista.get(i).getIdIngrediente(),
                   lista.get(i).getIngrediente(),
                   lista.get(i).getQuantidade(),
                   lista.get(i).getIdFornecedor(),

               });
               
           }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores view " + erro);
        }
        
    }      
    private void LimparCampos(){
        txtIdE.setText("");
        txtIngrediente.setText("");
        txtQtd.setText("");
        txtIdF.setText("");

        txtIngrediente.requestFocus();
    }
    
    private void AlterarEstoque(){
        int idForne, qtd, idEstoque;
        String ingredientes;
        
        idEstoque = Integer.parseInt(txtIdE.getText());
        qtd = Integer.parseInt(txtQtd.getText());
        ingredientes = txtIngrediente.getText();
        idForne = Integer.parseInt(txtIdF.getText());
      
        
        estoque objEsto = new estoque();
        objEsto.setIdFornecedor(idForne);
        objEsto.setIdIngrediente(idEstoque);
        objEsto.setIngrediente(ingredientes);
        objEsto.setQuantidade(qtd);

        
        estoDao objEstoDAO = new estoDao();
        objEstoDAO.alterarEstoque(objEsto);
    }
    private void ExcluirForne(){
        int idIngrediente;
       
        
        idIngrediente = Integer.parseInt(txtIdE.getText());
       
        estoque objEsto = new estoque();
        objEsto.setIdIngrediente(idIngrediente);
        
        
       estoDao objEstoDao = new estoDao();
        objEstoDao.excluirEstoque(objEsto);
    }
}
