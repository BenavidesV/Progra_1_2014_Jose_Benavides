/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        lblTitulo = new javax.swing.JLabel();
        btnPresionar = new javax.swing.JButton();
        txtvalor1 = new javax.swing.JTextField();
        txtvalor2 = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEmails = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSugerencia = new javax.swing.JTextPane();
        cmdAnimales = new javax.swing.JComboBox();
        chkEspanol = new javax.swing.JCheckBox();
        chkIngles = new javax.swing.JCheckBox();
        chkFrances = new javax.swing.JCheckBox();
        btnIdiomas = new javax.swing.JButton();
        jvmenu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo.setText("Hola Mundo");

        btnPresionar.setText("Presionar");
        btnPresionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresionarActionPerformed(evt);
            }
        });

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        lblMensaje.setText("Mensaje");

        txtEmails.setColumns(20);
        txtEmails.setRows(5);
        jScrollPane2.setViewportView(txtEmails);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtSugerencia.setBorder(null);
        txtSugerencia.setForeground(new java.awt.Color(204, 204, 204));
        txtSugerencia.setText("usuario@portal.com");
        txtSugerencia.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtSugerencia);

        chkEspanol.setText("Español");

        chkIngles.setText("Ingles");

        chkFrances.setText("Frances");

        btnIdiomas.setText("Idiomas");
        btnIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomasActionPerformed(evt);
            }
        });
        setJMenuBar(jvmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(lblMensaje))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsuario)
                                        .addComponent(txtvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtvalor2)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btnValidar)))
                            .addComponent(lblTitulo)
                            .addComponent(btnPresionar))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkEspanol)
                            .addComponent(chkIngles)
                            .addComponent(chkFrances)
                            .addComponent(btnIdiomas))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnPresionar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(lblMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkEspanol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkIngles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkFrances)
                        .addGap(12, 12, 12)
                        .addComponent(btnIdiomas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidar)
                    .addComponent(cmdAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresionarActionPerformed
        // TODO add your handling code here:
       /* lblTitulo.setText("Hola mundo");
         JOptionPane.showMessageDialog(null, "Hola mundo!!!");*/
        int valor = Integer.valueOf(txtvalor1.getText()) + Integer.valueOf(txtvalor2.getText());
        lblTitulo.setText(String.valueOf(valor));
    }//GEN-LAST:event_btnPresionarActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        if (txtUsuario.getText().equals("Efren") && txtPassword.getText().equals("12345")) {
            lblMensaje.setText("Usuario correcto");
        } else {
            lblMensaje.setText("Ususario incorrecto");
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        txtEmails.append(txtEmail.getText() + "\n");
        txtEmail.setText("");

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomasActionPerformed
        // TODO add your handling code here:
        if(chkEspanol.isSelected()){
        JOptionPane.showMessageDialog(null, "Ha selccionado Español");
        }
        if(chkIngles.isSelected()){
        JOptionPane.showMessageDialog(null, "Ha selccionado Ingles");
        }
        if(chkFrances.isSelected()){
        JOptionPane.showMessageDialog(null, "Ha selccionado Frances");
        }
    }//GEN-LAST:event_btnIdiomasActionPerformed
                                      
    

    private void CargarCombo() {
        cmdAnimales.addItem("Perro");
        cmdAnimales.addItem("Raton");
        cmdAnimales.addItem("Gato");
        cmdAnimales.addItem("Perico");

    }

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
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnIdiomas;
    private javax.swing.JButton btnPresionar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JCheckBox chkEspanol;
    private javax.swing.JCheckBox chkFrances;
    private javax.swing.JCheckBox chkIngles;
    private javax.swing.JComboBox cmdAnimales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar jvmenu;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEmails;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextPane txtSugerencia;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtvalor1;
    private javax.swing.JTextField txtvalor2;
    // End of variables declaration//GEN-END:variables
}
