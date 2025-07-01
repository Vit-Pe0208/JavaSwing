/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bancodados;


import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CadastroProduto extends javax.swing.JInternalFrame {
    
    String situation;

   
    public CadastroProduto() {
        initComponents();
        idProduto.setEnabled(false);
        
       
       
    }
    
    private void limparCampos(){
        this.idProduto.setText(null);
        this.produto.setText(null);
        this.quantidadeEstoque.setText(null);
        this.precoPorproduto.setText(null);
        this.rsituação.clearSelection();   
    }

   
    
    public void atualizarProduto(){
        try {
            Connection coin = ConexaoMysql.conexaoBanco();
            PreparedStatement str = coin.prepareStatement("SELECT * FROM produto ORDER BY id_produto");
            ResultSet executar = str.executeQuery();
            DefaultTableModel cadastroProduto = ( DefaultTableModel) tabela.getModel();
            cadastroProduto.setRowCount(0);
            while(executar.next()){
                Object[] array ={executar.getString("id_produto"),executar.getString("denominacao"),executar.getString("quantidade_estoque"),executar.getString("preco"),executar.getString("situacao")};
                cadastroProduto.addRow(array);
            }
            coin.close();
            str.close();
            executar.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rsituação = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idProduto = new javax.swing.JTextField();
        produto = new javax.swing.JTextField();
        quantidadeEstoque = new javax.swing.JTextField();
        precoPorproduto = new javax.swing.JTextField();
        jativo = new javax.swing.JRadioButton();
        jinativo = new javax.swing.JRadioButton();
        inserir = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Denominação", "Estoque", "Preço", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setText("Código");

        jLabel2.setText("Produto");

        jLabel3.setText("Quantidade estoque");

        jLabel4.setText("Preço");

        jLabel5.setText("Situação");

        rsituação.add(jativo);
        jativo.setText("Ativo");
        jativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jativoActionPerformed(evt);
            }
        });

        rsituação.add(jinativo);
        jinativo.setText("Inativo");
        jinativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinativoActionPerformed(evt);
            }
        });

        inserir.setText("Inserir");
        inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inserirMouseClicked(evt);
            }
        });

        Update.setText("Atualizar");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        deletar.setText("Deletar");
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });

        select.setText("Consultar");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jativo)
                                    .addGap(50, 50, 50)
                                    .addComponent(jinativo))
                                .addComponent(precoPorproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(select)
                            .addGap(123, 123, 123)
                            .addComponent(inserir)
                            .addGap(144, 144, 144)
                            .addComponent(Update)
                            .addGap(90, 90, 90)
                            .addComponent(deletar)
                            .addGap(19, 19, 19))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precoPorproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jativo)
                    .addComponent(jinativo))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserir)
                    .addComponent(select)
                    .addComponent(Update)
                    .addComponent(deletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
          atualizarProduto();
    }//GEN-LAST:event_selectMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
       idProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
       produto.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
       quantidadeEstoque.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
       precoPorproduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
       situation = tabela.getValueAt(tabela.getSelectedRow(), 4).toString();
        if(situation.equals("A") ){
            jativo.setSelected(true);
        }else if(situation.equals("I")){
            jinativo.setSelected(true);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        try {
            Connection use =ConexaoMysql.conexaoBanco();
            String slq = "UPDATE produto SET denominacao = ?,quantidade_estoque = ?, preco = ?, situacao = ? WHERE id_produto = ?";
            PreparedStatement comando = use.prepareStatement(slq);
            comando.setString(1, produto.getText());
            comando.setString(2, quantidadeEstoque.getText());
            comando.setString(3, this.precoPorproduto.getText());
            comando.setString(4, situation);
            comando.setString(5, idProduto.getText());
            
            String autenticacaoproduto=JOptionPane.showInputDialog(null, "Digite a autenticação para alterar a tabela produtos");
            
            if(autenticacaoproduto.equals("senha")){
             JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!!!");
             comando.executeUpdate();
            
            use.close();
            comando.close();
            atualizarProduto();
            limparCampos();    
            }else{
                 JOptionPane.showMessageDialog(null, "Autenticão Incorreta");
            }
           
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_UpdateMouseClicked

    private void jativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jativoActionPerformed
        situation = "A"; 
    }//GEN-LAST:event_jativoActionPerformed

    private void jinativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinativoActionPerformed
        situation = "I";
    }//GEN-LAST:event_jinativoActionPerformed

    private void inserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inserirMouseClicked
        try {
            Connection con= ConexaoMysql.conexaoBanco();
            String sql = "INSERT INTO produto(denominacao,quantidade_estoque,preco)"
                    + "VALUES(?,?,?);";
            PreparedStatement executar = con.prepareStatement(sql);
            executar.setString(1, this.produto.getText());
            executar.setString(2, this.quantidadeEstoque.getText());
            executar.setString(3,this.precoPorproduto.getText());
            executar.execute();
            
            con.close();
            executar.close();
            atualizarProduto();
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_inserirMouseClicked

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked

             try {
            Connection coin = ConexaoMysql.conexaoBanco();
            String sql = "DELETE FROM produto WHERE id_produto=?";
            PreparedStatement stmt = coin.prepareStatement(sql);
            stmt.setString(1, this.idProduto.getText());
            
            String autenticacaoDelete = JOptionPane.showInputDialog(null,"Digite a senha de autenticação para deletar uma pessoa");
            if(autenticacaoDelete.equals("senha")){
            stmt.execute();
           
            JOptionPane.showMessageDialog(null, "Pessoa excluída");
            stmt.close();
            coin.close();
            atualizarProduto();
               
            }else{
               JOptionPane.showMessageDialog(null, "Erro de senha"); 
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            if(ex.getMessage().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sistem_vendaprofessor`.`vendedor`, CONSTRAINT `vendedor_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`))")){
               JOptionPane.showMessageDialog(null, "Pessoa não pode ser deletada,pois está associada ao vendedor"); 
            }else if(ex.getMessage().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sistem_vendaprofessor`.`cliente`, CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`))")){
                JOptionPane.showMessageDialog(null, "Pessoa não pode ser deletada,pois está associada ao cliente");
            }
            
            
            
            
            
        }
    }//GEN-LAST:event_deletarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Update;
    public javax.swing.JButton deletar;
    private javax.swing.JTextField idProduto;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jativo;
    private javax.swing.JRadioButton jinativo;
    private javax.swing.JTextField precoPorproduto;
    private javax.swing.JTextField produto;
    private javax.swing.JTextField quantidadeEstoque;
    private javax.swing.ButtonGroup rsituação;
    private javax.swing.JButton select;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
