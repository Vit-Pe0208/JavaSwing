/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        JFrame: setExtendedState(MAXIMIZED_BOTH);
        mprincipal.setVisible(false);
        this.receitaPainel.setVisible(false);
        this.estoquePainel.setVisible(false);
        this.vendasPainel.setVisible(false);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        lbusuario = new javax.swing.JLabel();
        lbsenha = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        bentrar = new javax.swing.JButton();
        receitaPainel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        receitaTotal = new javax.swing.JTextField();
        estoquePainel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        estoque1 = new javax.swing.JTextField();
        vendasPainel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        quantidadeVenda = new javax.swing.JTextField();
        mprincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mcadastroPessoa = new javax.swing.JMenuItem();
        mcadastroProduto = new javax.swing.JMenuItem();
        mDeslogar = new javax.swing.JMenu();
        mControleAcesso = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(102, 102, 102));

        lbusuario.setText("Usuário");

        lbsenha.setText("Senha");

        usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bentrar.setText("Entrar");
        bentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bentrarMouseClicked(evt);
            }
        });

        receitaPainel.setBackground(new java.awt.Color(204, 204, 204));
        receitaPainel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("Receita");

        receitaTotal.setBackground(new java.awt.Color(204, 204, 204));
        receitaTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        receitaTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        receitaTotal.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout receitaPainelLayout = new javax.swing.GroupLayout(receitaPainel);
        receitaPainel.setLayout(receitaPainelLayout);
        receitaPainelLayout.setHorizontalGroup(
            receitaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receitaPainelLayout.createSequentialGroup()
                .addGroup(receitaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receitaPainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(receitaPainelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(receitaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        receitaPainelLayout.setVerticalGroup(
            receitaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receitaPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receitaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        estoquePainel.setBackground(new java.awt.Color(204, 204, 204));
        estoquePainel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("Estoque");

        estoque1.setBackground(new java.awt.Color(204, 204, 204));
        estoque1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estoque1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        estoque1.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout estoquePainelLayout = new javax.swing.GroupLayout(estoquePainel);
        estoquePainel.setLayout(estoquePainelLayout);
        estoquePainelLayout.setHorizontalGroup(
            estoquePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePainelLayout.createSequentialGroup()
                .addGroup(estoquePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(estoquePainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(estoquePainelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(estoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        estoquePainelLayout.setVerticalGroup(
            estoquePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estoquePainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estoque1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        vendasPainel.setBackground(new java.awt.Color(204, 204, 204));
        vendasPainel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setText("Quantidade de Vendas");

        quantidadeVenda.setBackground(new java.awt.Color(204, 204, 204));
        quantidadeVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quantidadeVenda.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout vendasPainelLayout = new javax.swing.GroupLayout(vendasPainel);
        vendasPainel.setLayout(vendasPainelLayout);
        vendasPainelLayout.setHorizontalGroup(
            vendasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendasPainelLayout.createSequentialGroup()
                .addGroup(vendasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vendasPainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(vendasPainelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(quantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        vendasPainelLayout.setVerticalGroup(
            vendasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendasPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantidadeVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        painel.setLayer(lbusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(lbsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(bentrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(receitaPainel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(estoquePainel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(vendasPainel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbsenha)
                            .addComponent(lbusuario))
                        .addGap(63, 63, 63)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(551, 551, 551))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(receitaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(estoquePainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(vendasPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receitaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoquePainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendasPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbusuario))
                .addGap(28, 28, 28)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsenha))
                .addGap(26, 26, 26)
                .addComponent(bentrar)
                .addGap(16, 16, 16))
        );

        jMenu1.setText("Cadastros");

        mcadastroPessoa.setText("Cadastro Pessoa");
        mcadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcadastroPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(mcadastroPessoa);

        mcadastroProduto.setText("Cadastro Produto");
        mcadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(mcadastroProduto);

        mprincipal.add(jMenu1);

        mDeslogar.setText("Sair");
        mDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mDeslogarMouseClicked(evt);
            }
        });
        mprincipal.add(mDeslogar);

        mControleAcesso.setText("Controle de acesso");
        mControleAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mControleAcessoMouseClicked(evt);
            }
        });
        mprincipal.add(mControleAcesso);

        setJMenuBar(mprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcadastroPessoaActionPerformed
       CadastroPessoa cp =new CadastroPessoa();
       painel.add(cp);
       cp.setVisible(true);
    }//GEN-LAST:event_mcadastroPessoaActionPerformed

    private void mcadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcadastroProdutoActionPerformed
        CadastroProduto produto = new CadastroProduto();
        painel.add(produto);
        produto.setVisible(true);
    }//GEN-LAST:event_mcadastroProdutoActionPerformed

    private void bentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bentrarMouseClicked
        
        try {
            Connection coin = ConexaoMysql.conexaoBanco();
            String sql = "SELECT * FROM login WHERE usuario = ? AND senha = UPPER(MD5(?)) AND situacao = 'A' AND tipo_usuario IN('Admin','Normal'); ";
            PreparedStatement stmt=coin.prepareStatement(sql);
            stmt.setString(1,usuario.getText());
            stmt.setString(2,senha.getText());
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                String tipoUsuario = rs.getString("tipo_usuario");
                String situacao = rs.getString("situacao");
                String resetarSenha = rs.getString("resetar_senha");
                String codigoUsuario = rs.getString("id_login");
                             
                if(tipoUsuario.equals("Admin") && situacao.equals("A") && resetarSenha.equals("N")){
                this.mControleAcesso.setVisible(true);  
                this.mprincipal.setVisible(true);
                this.lbusuario.setVisible(false);
                this.lbsenha.setVisible(false);
                usuario.setVisible(false);
                senha.setVisible(false);
                this.bentrar.setVisible(false);
                usuario.setText(null);
                senha.setText(null);  
                telaInicial();
                 
                
                }else if(tipoUsuario.equals("Admin") && situacao.equals("A") && resetarSenha.equals("S")){
                 JOptionPane.showMessageDialog(null, "Você precisa criar outra senha");
                 TelaResetarSenha trs = new TelaResetarSenha();
                 trs.codigoresetar.setText(codigoUsuario);
                 trs.usuarioresetar.setText(this.usuario.getText());
                 painel.add(trs);
                 trs.setVisible(true);
                 telaInicial();
                 
                    
                }else if(tipoUsuario.equals("Normal") && situacao.equals("A") && resetarSenha.equals("N")){
                this.mControleAcesso.setVisible(false);  
                this.mprincipal.setVisible(true);
                this.lbusuario.setVisible(false);
                this.lbsenha.setVisible(false);
                usuario.setVisible(false);
                senha.setVisible(false);
                this.bentrar.setVisible(false);
                usuario.setText(null);
                senha.setText(null);
                telaInicial();
                
                
                
             
                
                }else if(tipoUsuario.equals("Normal") && situacao.equals("A") && resetarSenha.equals("S")){
                    JOptionPane.showMessageDialog(null, "Você precisa criar outra senha");
                    TelaResetarSenha trs = new TelaResetarSenha();
                    trs.codigoresetar.setText(codigoUsuario);
                    trs.usuarioresetar.setText(this.usuario.getText());
                    painel.add(trs);
                    trs.setVisible(true);
                    telaInicial();
                    
                }
                  
                           
            }else{
               JOptionPane.showMessageDialog(null, "Senha,nome de usuario,ou situação inativa Incorretos!!");
               senha.setText(null);
               
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bentrarMouseClicked

    private void mDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mDeslogarMouseClicked
        
                this.mprincipal.setVisible(false);
                this.lbusuario.setVisible(true);
                this.lbsenha.setVisible(true);
                usuario.setVisible(true);
                senha.setVisible(true);
                this.bentrar.setVisible(true);
                    
        
    }//GEN-LAST:event_mDeslogarMouseClicked

    private void mControleAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mControleAcessoMouseClicked
          ControleAcesso ca = new ControleAcesso();
          painel.add(ca);
          ca.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_mControleAcessoMouseClicked

   
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
    
    
    public  void receita(){
        try {
            Connection coin = ConexaoMysql.conexaoBanco();
             String sql = "SELECT SUM(valor_total) AS valor_total FROM venda;";
             PreparedStatement stmt = coin.prepareStatement(sql);
             ResultSet set = stmt.executeQuery();
             while(set.next()){
                  String receita=set.getString("valor_total");
                 this.receitaTotal.setText("R$ "+receita);
                 this.receitaTotal.setEnabled(false);
             }
            
           
             
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

     public void estoque(){
        try {
           Connection coin = ConexaoMysql.conexaoBanco();
           String sql = "SELECT SUM(quantidade_estoque) AS Estoque FROM produto WHERE situacao = 'A';";
           PreparedStatement stmt = coin.prepareStatement(sql);
           ResultSet result = stmt.executeQuery();
           while(result.next()){
               String estoque = result.getString("Estoque");
               this.estoque1.setText(estoque);
               this.estoque1.setEnabled(false);
           }
           result.close();
           stmt.close();
           coin.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    public void quantidadeVendas(){
        try {
           Connection coin = ConexaoMysql.conexaoBanco();
           String sql = "SELECT COUNT(*) AS QuantidadeVendas FROM VENDA WHERE status_venda='P';";
           PreparedStatement stmt = coin.prepareStatement(sql);
           ResultSet result = stmt.executeQuery();
           while(result.next()){
               String quantidadeVendas = result.getString("QuantidadeVendas");
               this.quantidadeVenda.setText(quantidadeVendas);
               this.quantidadeVenda.setEnabled(false);
               
           }
           result.close();
           stmt.close();
           coin.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }   
    } 
    
     
     public void telaInicial(){
         
         
         this.receitaPainel.setVisible(true);
         this.estoquePainel.setVisible(true);
          this.vendasPainel.setVisible(true);
         this.receita();
         this.estoque();
         this.quantidadeVendas();
         
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bentrar;
    private javax.swing.JTextField estoque1;
    private javax.swing.JPanel estoquePainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lbsenha;
    private javax.swing.JLabel lbusuario;
    private javax.swing.JMenu mControleAcesso;
    private javax.swing.JMenu mDeslogar;
    private javax.swing.JMenuItem mcadastroPessoa;
    private javax.swing.JMenuItem mcadastroProduto;
    private javax.swing.JMenuBar mprincipal;
    private javax.swing.JDesktopPane painel;
    private javax.swing.JTextField quantidadeVenda;
    private javax.swing.JPanel receitaPainel;
    private javax.swing.JTextField receitaTotal;
    public javax.swing.JPasswordField senha;
    public javax.swing.JTextField usuario;
    private javax.swing.JPanel vendasPainel;
    // End of variables declaration//GEN-END:variables
}
