/****************************************
 * NOMBRE: Adrián Sanz Contreras        *
 * DNI: 49097240-Z                      *
 * Nº EXP: 145                          *
 *                                      *
 * NOMBRE: Alfonso Santamaría Rodríguez *
 * DNI: 49095131-K                      *   
 * Nº EXP: 63                           *
 *                                      *
 * NOMBRE: Fco Javier Pasamontes Moreno *
 * DNI: 47516684-H                      *
 * Nº EXP: 153                          *
 *                                      *
 * 2º GRADO EN INGERNIERÍA DEL SOFTWARE *
 * CURSO: 2011-2012                     *
 ****************************************/

/*
 * AltaClienteIG.java
 *
 * Created on 10-dic-2011, 13:12:57
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AltaClienteIG extends javax.swing.JDialog {
    private ArrayList<Cliente> misClientes = new ArrayList<Cliente>();

    /** Creates new form AltaClienteIG */
    public AltaClienteIG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAniadir = new javax.swing.JButton();
        jlDireccion = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jbVaciarDatos = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de cliente");

        jbAniadir.setText("Añadir");
        jbAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAniadirActionPerformed(evt);
            }
        });

        jlDireccion.setText("Direccion");

        jlTelefono.setText("Telefono");

        jlNombre.setText("Nombre");

        jlDni.setText("DNI");

        jbVaciarDatos.setText("Vaciar datos");
        jbVaciarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVaciarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addGap(51, 51, 51)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jbAniadir)
                .addGap(56, 56, 56)
                .addComponent(jbVaciarDatos)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAniadir)
                    .addComponent(jbVaciarDatos))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed
        try {
            this.misClientes.add(new Cliente(this.jtfNombre.getText(),
                    this.jtfDni.getText(),
                    this.jtfDireccion.getText(),
                    Long.parseLong(this.jtfTelefono.getText())));
        } catch (Exception ex) {
            String problema = new String();

            if (this.jtfNombre.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un nombre.\n";
            }
            if (this.jtfDni.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un dni.\n";
            }
            if (this.jtfDireccion.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir una dirección.\n";
            }
            if (this.jtfTelefono.getText().equalsIgnoreCase("")) {
                problema = problema + "Debe introducir un teléfono.\n";
            }
            
            JOptionPane.showConfirmDialog(this, problema, "Error",
                    JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
        }
        this.jbVaciarDatosActionPerformed(null);
    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jbVaciarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarDatosActionPerformed
        this.jtfNombre.setText("");
        this.jtfDni.setText("");
        this.jtfDireccion.setText("");
        this.jtfTelefono.setText("");
    }//GEN-LAST:event_jbVaciarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(AltaClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaClienteIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AltaClienteIG dialog = new AltaClienteIG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbVaciarDatos;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Cliente> getMisClientes() {
        return misClientes;
    }

    public void setMisClientes(ArrayList<Cliente> misClientes) {
        this.misClientes = misClientes;
    }

}
