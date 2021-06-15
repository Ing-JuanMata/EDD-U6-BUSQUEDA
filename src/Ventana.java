
import busqueda_hash.Hash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
public class Ventana extends javax.swing.JFrame {

    int n;
    Hash objHash;
    int arreglo[];

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();

        btnBinaria.setEnabled(false);
        btnSecuencial.setEnabled(false);
        btnHash.setEnabled(false);

        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(this, "Ingrese el tamaño de N "));
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
        jLabel2 = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        btnBinaria = new javax.swing.JButton();
        btnSecuencial = new javax.swing.JButton();
        btnHash = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setText("METODOS DE BUSQUEDA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabel2.setText("Dato a buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        getContentPane().add(txtDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, -1));

        btnBinaria.setText("Binaria");
        btnBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinariaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnSecuencial.setText("Secuencial");
        btnSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecuencialActionPerformed(evt);
            }
        });
        getContentPane().add(btnSecuencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        btnHash.setText("Hash");
        btnHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashActionPerformed(evt);
            }
        });
        getContentPane().add(btnHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel3.setText("Tipos de busqueda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 100));

        jLabel4.setText("Valores existentes:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        btnGenerar.setText("Generar numeros");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        arreglo = new int[n];
        String auxS = "";
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * (9));
            auxS += String.valueOf(arreglo[i]) + ",";
        }
        btnBinaria.setEnabled(true);
        btnSecuencial.setEnabled(true);
        btnHash.setEnabled(true);
        jTextArea1.setText(auxS);


    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBinariaActionPerformed

    private void btnSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecuencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSecuencialActionPerformed


    private void btnHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashActionPerformed
        int aux = Integer.parseInt(txtDato.getText());
        int hashCode;
        objHash = new Hash(arreglo);
        hashCode = objHash.hashBuscar(aux);

        if (hashCode == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "No existe");
            return;
        }

        if (arreglo[hashCode] == aux) {
            javax.swing.JOptionPane.showMessageDialog(this, "Si existe");
        }


    }//GEN-LAST:event_btnHashActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinaria;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnHash;
    private javax.swing.JButton btnSecuencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}
