/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import visao.JanelaInicialiCards;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Uguinho
 */
public class JanelaInicioUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JanelaInicio
     */
    public JanelaInicioUsuario() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NumeroCartao = new javax.swing.JLabel();
        SenhadeAcesso = new javax.swing.JLabel();
        NumCartaoUsuario = new javax.swing.JTextField();
        SenhaAcessoUsuario = new javax.swing.JPasswordField();
        BotaoEntrarUsuario = new javax.swing.JButton();
        BotaoRecarregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MarcaPanda = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        IrHome = new javax.swing.JMenu();
        IrparaHome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iCards - Inicial");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("iCards");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 115, 44);

        NumeroCartao.setText("Número do cartão:");
        getContentPane().add(NumeroCartao);
        NumeroCartao.setBounds(240, 90, 120, 30);

        SenhadeAcesso.setText("Senha de acesso:");
        getContentPane().add(SenhadeAcesso);
        SenhadeAcesso.setBounds(240, 130, 120, 30);

        NumCartaoUsuario.setToolTipText("Digite o número do cartão");
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-####");  
            NumCartaoUsuario = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        getContentPane().add(NumCartaoUsuario);
        NumCartaoUsuario.setBounds(360, 90, 110, 30);
        getContentPane().add(SenhaAcessoUsuario);
        SenhaAcessoUsuario.setBounds(360, 130, 110, 30);

        BotaoEntrarUsuario.setText("Entrar");
        BotaoEntrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrarUsuario);
        BotaoEntrarUsuario.setBounds(320, 180, 80, 30);

        BotaoRecarregar.setText("Recarregar");
        BotaoRecarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRecarregarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRecarregar);
        BotaoRecarregar.setBounds(290, 290, 130, 35);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 280, 0, 0);

        MarcaPanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visaoTeste/panda_bg.png"))); // NOI18N
        MarcaPanda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MarcaPandaFocusGained(evt);
            }
        });
        getContentPane().add(MarcaPanda);
        MarcaPanda.setBounds(530, 290, 200, 200);

        IrHome.setText("Home");

        IrparaHome.setText("Ir para Home");
        IrparaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrparaHomeActionPerformed(evt);
            }
        });
        IrHome.add(IrparaHome);

        jMenuBar1.add(IrHome);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(736, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarUsuarioActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Your message.");
    }//GEN-LAST:event_BotaoEntrarUsuarioActionPerformed

    private void MarcaPandaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MarcaPandaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaPandaFocusGained

    private void BotaoRecarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRecarregarActionPerformed
        this.dispose();
        JanelaRecarga frame = new JanelaRecarga();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_BotaoRecarregarActionPerformed

    private void IrparaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrparaHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JanelaInicialiCards frame = new JanelaInicialiCards();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_IrparaHomeActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaInicioUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrarUsuario;
    private javax.swing.JButton BotaoRecarregar;
    private javax.swing.JMenu IrHome;
    private javax.swing.JMenuItem IrparaHome;
    private javax.swing.JLabel MarcaPanda;
    private javax.swing.JTextField NumCartaoUsuario;
    private javax.swing.JLabel NumeroCartao;
    private javax.swing.JPasswordField SenhaAcessoUsuario;
    private javax.swing.JLabel SenhadeAcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
}