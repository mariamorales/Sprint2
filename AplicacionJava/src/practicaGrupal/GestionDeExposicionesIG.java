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
 * GestionDeExposicionesIG.java
 *
 * Created on 10-dic-2011, 11:47:16
 */
package practicaGrupal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionDeExposicionesIG extends javax.swing.JDialog {
    
    private ArrayList<Exposicion> misExposiciones = new ArrayList<Exposicion>();
    /** Creates new form GestionDeExposicionesIG */
    public GestionDeExposicionesIG(java.awt.Frame parent, boolean modal) {
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

        jbDarDeBaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtExposiciones = new javax.swing.JTable();
        jbModificarDatos = new javax.swing.JButton();
        jbDarDeAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de exposiciones");

        jbDarDeBaja.setText("Dar de baja");
        jbDarDeBaja.setEnabled(false);
        jbDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeBajaActionPerformed(evt);
            }
        });

        jtExposiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtExposicionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtExposiciones);

        jbModificarDatos.setText("Modificar datos");
        jbModificarDatos.setEnabled(false);
        jbModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDatosActionPerformed(evt);
            }
        });

        jbDarDeAlta.setText("Dar de alta");
        jbDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbDarDeAlta)
                        .addGap(18, 18, 18)
                        .addComponent(jbDarDeBaja)
                        .addGap(38, 38, 38)
                        .addComponent(jbModificarDatos)
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDarDeBaja)
                    .addComponent(jbModificarDatos)
                    .addComponent(jbDarDeAlta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeAltaActionPerformed
        AltaExposicionIG altaExpo = new AltaExposicionIG(null,true);
        
        altaExpo.setMisExposiciones(this.misExposiciones);
        
        altaExpo.setLocationRelativeTo(null);
        altaExpo.setVisible(true);
   
        this.misExposiciones = altaExpo.getMisExposiciones();
        
        this.cargarExposiciones(this.misExposiciones); 

    }//GEN-LAST:event_jbDarDeAltaActionPerformed

    private void jbDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeBajaActionPerformed
        int i = 0;
        
        while ((!this.jtExposiciones.isRowSelected(i)) &&
                (i < this.jtExposiciones.getRowCount())) {
            i++;
        }
        if (jtExposiciones.isRowSelected(i)) {
               this.misExposiciones.remove(i);

            }
            this.cargarExposiciones(this.misExposiciones);
        
    }//GEN-LAST:event_jbDarDeBajaActionPerformed

    private void jbModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDatosActionPerformed
        int i = 0;

        //i representa el numero de la posición del empleado a modificar
        while ((!this.jtExposiciones.isRowSelected(i))
                && (i < this.jtExposiciones.getRowCount())) {
            i++;
        }

        //Con esta condición controlamos si se ha seleccionado alguna columna o no
        if (this.jtExposiciones.isRowSelected(i)) {
            //Creamos el nuevo JDialog 
            ModificarExposicionIG modifExpo = new ModificarExposicionIG(null, true);

            //Al nuevo JDialog le enviamos los datos pertinentes
            modifExpo.setMisExposiciones(this.misExposiciones);
            modifExpo.setPos(i);


            //Cargamos los datos en los jTextField correspondientes de
            //ModificarExposicionIG
            modifExpo.cargarDatosEnPaneles();
            modifExpo.setLocationRelativeTo(null);
            modifExpo.setVisible(true);

            this.misExposiciones = modifExpo.getMisExposiciones();
            this.cargarExposiciones(this.misExposiciones);
        }
    }//GEN-LAST:event_jbModificarDatosActionPerformed

    private void jtExposicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtExposicionesMouseClicked
        // TODO add your handling code here:
        if (this.jtExposiciones.rowAtPoint(evt.getPoint()) >= 0 && this.jtExposiciones.isEnabled()){
            this.jbModificarDatos.setEnabled(true);
            this.jbDarDeBaja.setEnabled(true);
        }
    }//GEN-LAST:event_jtExposicionesMouseClicked

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
            java.util.logging.Logger.getLogger(GestionDeExposicionesIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeExposicionesIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeExposicionesIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeExposicionesIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                GestionDeExposicionesIG dialog = new GestionDeExposicionesIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDarDeAlta;
    private javax.swing.JButton jbDarDeBaja;
    private javax.swing.JButton jbModificarDatos;
    private javax.swing.JTable jtExposiciones;
    // End of variables declaration//GEN-END:variables
    
    public ArrayList<Exposicion> getMisExposiciones() {
        return misExposiciones;
    }

    public void setMisExposiciones(ArrayList<Exposicion> misExposiciones) {
        this.misExposiciones = misExposiciones;
    }    
    
    public void cargarExposiciones(ArrayList<Exposicion> listaExpo) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Numero");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");

        //Recorremos los proveedores
        Object[] fila = new Object[3];
        for (int i = 0; i < listaExpo.size(); i++) {
            fila[0] = listaExpo.get(i).getNumero();
            fila[1] = listaExpo.get(i).getDireccion();
            fila[2] = listaExpo.get(i).getTelefono();
       
            modelo.addRow(fila);
        }      

        this.jbModificarDatos.setEnabled(false);
        this.jbDarDeBaja.setEnabled(false);
        jtExposiciones.setModel(modelo);
        this.misExposiciones = listaExpo;

    }

}
