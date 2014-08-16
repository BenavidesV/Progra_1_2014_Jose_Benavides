/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

import Listas.Equipos;
import Listas.Grupos;
import Listas.Jugadores;
import Nodos.NodoEquipo;
import Nodos.NodoEquipoenGrupo;
import Nodos.NodoGrupo;
import Nodos.NodoJugador;
import project2014.clsLlenar;
import project2014.clsLlenarGrupos;

/**
 *
 * @author Jose E & Alvaro
 */
public class frmM extends javax.swing.JFrame {

    /**
     * Creates new form frmM
     */
 
    public frmM() {
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

        lblBrasil2014 = new javax.swing.JLabel();
        btnEquipos = new javax.swing.JButton();
        btnGrupos = new javax.swing.JButton();
        btnSedes1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JToggleButton();
        btnGoleadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBrasil2014.setFont(new java.awt.Font("WenQuanYi Micro Hei", 0, 24)); // NOI18N
        lblBrasil2014.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrasil2014.setText("BRASIL 2014");
        lblBrasil2014.setMaximumSize(new java.awt.Dimension(130, 28));
        lblBrasil2014.setMinimumSize(new java.awt.Dimension(130, 28));

        btnEquipos.setText("Equipos");
        btnEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEquiposMouseClicked(evt);
            }
        });

        btnGrupos.setText("Grupos");
        btnGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGruposMouseClicked(evt);
            }
        });

        btnSedes1.setText("Sedes");
        btnSedes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSedes1MouseClicked(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        btnGoleadores.setText("Goleadores");
        btnGoleadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoleadoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEquipos)
                            .addComponent(btnSedes1))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrupos)
                            .addComponent(btnGoleadores)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBrasil2014, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblBrasil2014, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEquipos)
                    .addComponent(btnGoleadores))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSedes1)
                    .addComponent(btnGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEquiposMouseClicked
        // TODO add your handling code here:
        frmEquipos ListaOrdenada = new frmEquipos();
        ListaOrdenada.setVisible(true);
    }//GEN-LAST:event_btnEquiposMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        frmM M= new frmM();
        M.setVisible(false);
        
        frmMain oMain = new frmMain();
        oMain.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnSedes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSedes1MouseClicked
        // TODO add your handling code here:
        frmSedes sedes = new frmSedes();
        sedes.setVisible(true);
    }//GEN-LAST:event_btnSedes1MouseClicked

    private void btnGoleadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoleadoresMouseClicked
        // TODO add your handling code here:
        frmGoleadores gol = new frmGoleadores();
        gol.setVisible(true);
    }//GEN-LAST:event_btnGoleadoresMouseClicked

    private void btnGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGruposMouseClicked
        frmGrupos o = new frmGrupos();
        o.setVisible(true);
    }//GEN-LAST:event_btnGruposMouseClicked

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
            java.util.logging.Logger.getLogger(frmM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEquipos;
    private javax.swing.JButton btnGoleadores;
    private javax.swing.JButton btnGrupos;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JButton btnSedes1;
    private javax.swing.JLabel lblBrasil2014;
    // End of variables declaration//GEN-END:variables
}