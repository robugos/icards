/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import bean.Cartao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.GerenciarCartao;
import negocio.GerenciarDB;

/**
 *
 * @author Uguinho
 */
public class JanelaDebito extends javax.swing.JFrame {
    public String senhaCartao;
    public String CNPJ;

    /**
     * Creates new form JanelaEstabelecimento
     */
    public JanelaDebito() {
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

        iStoreLabel = new javax.swing.JLabel();
        NumCartaoLabel = new javax.swing.JLabel();
        NumCartaoUsuario = new javax.swing.JTextField();
        ValorLabel = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        SenhaLabel = new javax.swing.JLabel();
        SenhaCartao = new javax.swing.JPasswordField();
        BotaoEnviar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        erroCampos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iCards - iStore");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iStoreLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        iStoreLabel.setText("iStore");
        getContentPane().add(iStoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, -1, -1));

        NumCartaoLabel.setText("Número do cartão:");
        getContentPane().add(NumCartaoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, 30));

        NumCartaoUsuario.setToolTipText("Digite o número do cartão");
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-####");
            NumCartaoUsuario = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        getContentPane().add(NumCartaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 30));

        ValorLabel.setText("Valor:");
        getContentPane().add(ValorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 110, 30));

        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 148, 30));

        SenhaLabel.setText("Senha do cartão:");
        getContentPane().add(SenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, 30));
        getContentPane().add(SenhaCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 148, 30));

        BotaoEnviar.setText("Enviar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 30));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 100, 30));

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 100, 30));

        erroCampos.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(erroCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 240, 30));

        setSize(new java.awt.Dimension(728, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        // TODO add your handling code here:
        String numCartao = NumCartaoUsuario.getText();
        String valor = Valor.getText();
        String senha = SenhaCartao.getText();
        
            if ((NumCartaoUsuario.getText().length()>0)
                &&(Valor.getText().length()>0)
                    &&(SenhaCartao.getText().length()>0)){
                                
                GerenciarDB banco = new GerenciarDB();
                Cartao cartao = new Cartao(numCartao);
                GerenciarCartao gerCartao = new GerenciarCartao(cartao);
            try {
                boolean acesso = banco.checkSenhaCartaoDB(numCartao, senha, 0);
                if (acesso) {
                    banco.addExtrato(banco.getEstabelecimentoDB(CNPJ), valor, banco.getData(), CNPJ, numCartao);
                    JanelaEst frame = new JanelaEst();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);   
                    this.dispose();
                    
                }
                
            } catch (Exception ex) {
                Logger.getLogger(JanelaDebito.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                erroCampos.setText("Existem campos em branco.");
            }
    }//GEN-LAST:event_BotaoEnviarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        JanelaInicioAdmin frame = new JanelaInicioAdmin();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        NumCartaoUsuario.setText("");
        Valor.setText("");
        SenhaCartao.setText("");
        
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDebito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDebito().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel NumCartaoLabel;
    public javax.swing.JTextField NumCartaoUsuario;
    protected javax.swing.JPasswordField SenhaCartao;
    private javax.swing.JLabel SenhaLabel;
    protected javax.swing.JTextField Valor;
    private javax.swing.JLabel ValorLabel;
    private javax.swing.JLabel erroCampos;
    private javax.swing.JLabel iStoreLabel;
    // End of variables declaration//GEN-END:variables

}