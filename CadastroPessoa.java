/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CadastroPessoa extends javax.swing.JInternalFrame {
    String situacao;
      
    public CadastroPessoa() {
        initComponents();
        this.jcodigo.setEnabled(false);
        atualizarTable();
        
        
    }
    
    public void atualizarTable(){
        try {
            Connection con = ConexaoMysql.conexaoBanco();
            String sql ="SELECT * FROM pessoa ORDER BY id_pessoa;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel cadastroPessoa = (DefaultTableModel) tabela.getModel();
            cadastroPessoa.setNumRows(0);
            while(rs.next()){
                Object[] array = {rs.getString("id_pessoa"),rs.getString("nome"),rs.getString("cpf"),rs.getString("telefone"),rs.getString("email"),rs.getString("situacao")};
                cadastroPessoa.addRow(array);
            }
           rs.close();
           stmt.close();
           con.close();   
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        situacaoPessoa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbativo = new javax.swing.JRadioButton();
        rbinativo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Pessoa");

        jLabel1.setText("Código");

        jcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("CPF");

        jLabel6.setText("Telefone");

        jLabel7.setText("situaçao");

        situacaoPessoa.add(rbativo);
        rbativo.setText("Ativo");
        rbativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbativoActionPerformed(evt);
            }
        });

        situacaoPessoa.add(rbinativo);
        rbinativo.setText("Inativo");
        rbinativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbinativoActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Telefone", "Email", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        btCadastrar.setText("Cadastrar");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        jLabel2.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(jcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(email)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbativo)
                                            .addGap(72, 72, 72)
                                            .addComponent(rbinativo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(btCadastrar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbativo)
                    .addComponent(rbinativo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btAlterar)
                            .addComponent(btExcluir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcodigoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jcodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        jNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        cpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        telefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        email.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        situacao = tabela.getValueAt(tabela.getSelectedRow(), 5).toString();
        
        if(situacao.equals("A") ){
            rbativo.setSelected(true);
        }else if(situacao.equals("I")){
            rbinativo.setSelected(true);
        }
         
        
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        try {
            Connection con = ConexaoMysql.conexaoBanco();
            String sql = "UPDATE pessoa SET nome = ?,cpf = ?,telefone = ?, email = ?,situacao = ? WHERE id_pessoa=?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, jNome.getText());
            stmt.setString(2, cpf.getText());
            stmt.setString(3,telefone.getText());
            stmt.setString(4,email.getText() );
            stmt.setString(5, situacao);
            stmt.setString(6, jcodigo.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Pessoa atualizada!!!!");
            atualizarTable();
            con.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btAlterarMouseClicked

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
        try {
            Connection con = ConexaoMysql.conexaoBanco();
            String sql = "INSERT INTO pessoa(nome,cpf,telefone,email)"
                    + "VALUES(?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, this.jNome.getText());
            stmt.setString(2,this.cpf.getText());
            stmt.setString(3, this.telefone.getText());
            stmt.setString(4, this.email.getText());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            con.close();
            stmt.close();
            atualizarTable();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void rbativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbativoActionPerformed
       situacao = "A";
    }//GEN-LAST:event_rbativoActionPerformed

    private void rbinativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbinativoActionPerformed
        situacao = "I";
    }//GEN-LAST:event_rbinativoActionPerformed

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        try {
            Connection con = ConexaoMysql.conexaoBanco();
            String sql = "DELETE FROM pessoa WHERE id_pessoa = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, jcodigo.getText());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Pessoa excluída");
            stmt.close();
            con.close();
            atualizarTable();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            if(ex.getMessage().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sistem_vendaprofessor`.`vendedor`, CONSTRAINT `vendedor_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`))")){
               JOptionPane.showMessageDialog(null, "Pessoa não pode ser deletada,pois está associada ao vendedor"); 
            }else if(ex.getMessage().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sistem_vendaprofessor`.`cliente`, CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`))")){
                JOptionPane.showMessageDialog(null, "Pessoa não pode ser deletada,pois está associada ao cliente");
            }
            
            
            
            
            
        }
        
        
        
    }//GEN-LAST:event_btExcluirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JRadioButton rbativo;
    private javax.swing.JRadioButton rbinativo;
    private javax.swing.ButtonGroup situacaoPessoa;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
