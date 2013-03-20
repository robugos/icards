/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Rafaella
 */
public class JanelaDeletarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JanelaDeletarUsuario
     */
    public JanelaDeletarUsuario() {
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

        DeletarUsuario = new javax.swing.JLabel();
        DeletarCPF = new javax.swing.JLabel();
        DelUsuario = new javax.swing.JFormattedTextField();
        ConfirmarDelUsuario = new javax.swing.JButton();
        CancelarDelUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deletar Usuário");
        setMinimumSize(new java.awt.Dimension(720, 460));

        DeletarUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        DeletarUsuario.setText("Deletar Usuário");

        DeletarCPF.setText("Digite o CPF do Usuário:");

        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###.###.###-##");  
            DelUsuario = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }

        ConfirmarDelUsuario.setText("Confirmar");
        ConfirmarDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarDelUsuarioActionPerformed(evt);
            }
        });

        CancelarDelUsuario.setText("Cancelar");
        CancelarDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarDelUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(DeletarCPF)
                        .addGap(18, 18, 18)
                        .addComponent(DelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(DeletarUsuario)))
                .addGap(219, 234, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(ConfirmarDelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelarDelUsuario)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(DeletarUsuario)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletarCPF)
                    .addComponent(DelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarDelUsuario)
                    .addComponent(CancelarDelUsuario))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarDelUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JanelaInicioAdmin frame = new JanelaInicioAdmin();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_CancelarDelUsuarioActionPerformed

    private void ConfirmarDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarDelUsuarioActionPerformed
        // TODO add your handling code here:
        String deletarCPF = DelUsuario.getText().replaceAll("[.]","");
        deletarCPF = deletarCPF.replaceAll("[-]", "");
    }//GEN-LAST:event_ConfirmarDelUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDeletarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDeletarUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarDelUsuario;
    private javax.swing.JButton ConfirmarDelUsuario;
    private javax.swing.JFormattedTextField DelUsuario;
    private javax.swing.JLabel DeletarCPF;
    private javax.swing.JLabel DeletarUsuario;
    // End of variables declaration//GEN-END:variables
}
