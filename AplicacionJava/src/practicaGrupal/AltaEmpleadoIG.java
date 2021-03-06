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
 * AltaEmpleadoIG.java
 *
 * Created on 09-dic-2011, 23:33:16
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AltaEmpleadoIG extends javax.swing.JDialog {
    private ArrayList<Empleado> listaEm;
    private ArrayList<Comisionario> listaCom;
    
    /** Creates new form AltaEmpleadoIG */
    public AltaEmpleadoIG(java.awt.Frame parent, boolean modal) {
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

        jlDireccion = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfSalario = new javax.swing.JTextField();
        jlTipoEmpleado = new javax.swing.JLabel();
        jcbTipoEmpleado = new javax.swing.JComboBox();
        jbAniadir = new javax.swing.JButton();
        jbVaciarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de empleado");

        jlDireccion.setText("Direccion");

        jlTelefono.setText("Telefono");

        jlNombre.setText("Nombre");

        jlDni.setText("DNI");

        jlSalario.setText("Salario");

        jlTipoEmpleado.setText("Tipo de empleado");

        jcbTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Comisionario", "Director", "Mecanico" }));
        jcbTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoEmpleadoActionPerformed(evt);
            }
        });

        jbAniadir.setText("Añadir");
        jbAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAniadirActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTipoEmpleado)
                                .addGap(37, 37, 37)
                                .addComponent(jcbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlSalario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlTelefono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlDireccion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlDni)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlNombre)
                                    .addGap(51, 51, 51)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jbAniadir)
                        .addGap(56, 56, 56)
                        .addComponent(jbVaciarDatos)))
                .addContainerGap(58, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoEmpleado)
                    .addComponent(jcbTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAniadir)
                    .addComponent(jbVaciarDatos))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed
     
        
        if (this.jcbTipoEmpleado.getSelectedItem().toString().equalsIgnoreCase("Comisionario")){
            try {
                this.listaCom.add(new Comisionario(this.jtfNombre.getText(),
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
           
            
        }
        else{
            try{
                this.listaEm.add(new Empleado(this.jtfNombre.getText(),
                    this.jtfDni.getText(),
                    this.jtfDireccion.getText(),
                    Long.parseLong(this.jtfTelefono.getText()),
                    Double.parseDouble(this.jtfSalario.getText()),
                    this.jcbTipoEmpleado.getSelectedItem().toString()));
            }
            catch (Exception ex) {
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
                 if (this.jtfSalario.getText().equalsIgnoreCase("")) {
                    problema = problema + "Debe introducir un salario.\n";
                }
                JOptionPane.showConfirmDialog(this, problema, "Error", 
                        JOptionPane.PLAIN_MESSAGE,JOptionPane.ERROR_MESSAGE);
                }
        }
        this.jbVaciarDatosActionPerformed(null);
    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jbVaciarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarDatosActionPerformed
        this.jtfNombre.setText("");
        this.jtfDni.setText("");
        this.jtfDireccion.setText("");
        this.jtfTelefono.setText("");
        this.jtfSalario.setText("");
        this.jcbTipoEmpleado.setSelectedItem("Vendedor");
    }//GEN-LAST:event_jbVaciarDatosActionPerformed

    private void jcbTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoEmpleadoActionPerformed
        this.jtfSalario.setVisible(!this.jcbTipoEmpleado.
                getSelectedItem().toString().equalsIgnoreCase("Comisionario"));
        this.jlSalario.setVisible(!this.jcbTipoEmpleado.
                getSelectedItem().toString().equalsIgnoreCase("Comisionario"));
    }//GEN-LAST:event_jcbTipoEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(AltaEmpleadoIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaEmpleadoIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaEmpleadoIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaEmpleadoIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                AltaEmpleadoIG dialog = new AltaEmpleadoIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jcbTipoEmpleado;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTipoEmpleado;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfSalario;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

public ArrayList<Comisionario> getListaCom() {
        return listaCom;
    }

    public void setListaCom(ArrayList<Comisionario> listaCom) {
        this.listaCom = listaCom;
    }

    public ArrayList<Empleado> getListaEm() {
        return listaEm;
    }

    public void setListaEm(ArrayList<Empleado> listaEm) {
        this.listaEm = listaEm;
    }
}
