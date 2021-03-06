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
 * GestionDeCochesDeProveedoresIG.java
 *
 * Created on 10-dic-2011, 6:35:57
 */
package practicaGrupal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionDeCochesDeProveedoresIG extends javax.swing.JDialog {
    private ArrayList<Proveedor> misProveedores = new ArrayList<Proveedor>();
    private int rowProveedor = 0;
    private int rowCoche = 0;

    /** Creates new form GestionDeCochesDeProveedoresIG */
    public GestionDeCochesDeProveedoresIG(java.awt.Frame parent, boolean modal) {
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

        jpMostrarProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProveedores = new javax.swing.JTable();
        jpMostrarCoches = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCochesProveedor = new javax.swing.JTable();
        jbModificarDatos = new javax.swing.JButton();
        jbDarDeBaja = new javax.swing.JButton();
        jbDarDeAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de coches de los proveedores");
        setResizable(false);

        jpMostrarProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));

        jtProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProveedores);

        javax.swing.GroupLayout jpMostrarProveedoresLayout = new javax.swing.GroupLayout(jpMostrarProveedores);
        jpMostrarProveedores.setLayout(jpMostrarProveedoresLayout);
        jpMostrarProveedoresLayout.setHorizontalGroup(
            jpMostrarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMostrarProveedoresLayout.setVerticalGroup(
            jpMostrarProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarProveedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMostrarCoches.setBorder(javax.swing.BorderFactory.createTitledBorder("Coches del proveedor seleccionado"));

        jtCochesProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCochesProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCochesProveedor);

        jbModificarDatos.setText("Modificar datos");
        jbModificarDatos.setEnabled(false);
        jbModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDatosActionPerformed(evt);
            }
        });

        jbDarDeBaja.setText("Dar de baja");
        jbDarDeBaja.setEnabled(false);
        jbDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeBajaActionPerformed(evt);
            }
        });

        jbDarDeAlta.setText("Dar de alta");
        jbDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMostrarCochesLayout = new javax.swing.GroupLayout(jpMostrarCoches);
        jpMostrarCoches.setLayout(jpMostrarCochesLayout);
        jpMostrarCochesLayout.setHorizontalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMostrarCochesLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jbDarDeAlta)
                .addGap(37, 37, 37)
                .addComponent(jbDarDeBaja)
                .addGap(38, 38, 38)
                .addComponent(jbModificarDatos)
                .addGap(82, 82, 82))
        );
        jpMostrarCochesLayout.setVerticalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDarDeAlta)
                    .addComponent(jbDarDeBaja)
                    .addComponent(jbModificarDatos))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMostrarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jpMostrarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpMostrarCoches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProveedoresMouseClicked
                    
       //Obtenemos la posición en la tabla y en el ArrayList de un proveedor
       this.rowProveedor = this.jtProveedores.rowAtPoint(evt.getPoint());   
       
       //Una vez sabemos sobre qué proveedor hemos hecho click con el ratón,
       //mostramos sus coches.
       
       this.cargarCochesDeProveedores();
    }//GEN-LAST:event_jtProveedoresMouseClicked

    private void jbDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeAltaActionPerformed
        AltaCocheProveedorIG altaCocheProv = new AltaCocheProveedorIG(null,true);
        
        altaCocheProv.setTipoVehiculoProveedor(this.misProveedores.get(this.rowProveedor).getTipoCoche());
        altaCocheProv.setCoches(this.misProveedores.get(this.rowProveedor).getCoches());
        
        altaCocheProv.setLocationRelativeTo(null);
        altaCocheProv.setVisible(true);
   
        this.misProveedores.get(this.rowProveedor).setCoches(altaCocheProv.getCoches());
        
        this.cargarProveedores(); 
                
    }//GEN-LAST:event_jbDarDeAltaActionPerformed

    private void jbDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeBajaActionPerformed
        if (this.rowCoche >= 0 && this.jtCochesProveedor.isEnabled()){
            if (JOptionPane.showConfirmDialog(this,"¿Está seguro?",
                    "Borrar coche de proveedor",JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE)== JOptionPane.YES_OPTION){
                this.misProveedores.get(this.rowProveedor).getCoches().remove(rowCoche);
                JOptionPane.showMessageDialog(this, 
                    "Coche borrado");
            }
            this.cargarCochesDeProveedores();
        }
        
    }//GEN-LAST:event_jbDarDeBajaActionPerformed

    private void jbModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDatosActionPerformed
        ModificarCocheProveedorIG modcv = new ModificarCocheProveedorIG(null,true);
        
        modcv.setMisProveedores(this.misProveedores);
        modcv.setProveedorSeleccionado(rowProveedor);
        modcv.setCocheSeleccionado(rowCoche);
        modcv.cargarDatosCoche();
        
        modcv.setLocationRelativeTo(null);
        modcv.setVisible(true);
        
        if (modcv.isHaModificadoCoche()){
            this.cargarCochesDeProveedores();
        }
    }//GEN-LAST:event_jbModificarDatosActionPerformed

    private void jtCochesProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCochesProveedorMouseClicked
        // TODO add your handling code here:
        this.rowCoche = this.jtCochesProveedor.rowAtPoint(evt.getPoint());
        if (this.rowCoche >= 0 && this.jtCochesProveedor.isEnabled()){
            this.jbModificarDatos.setEnabled(true);
            this.jbDarDeBaja.setEnabled(true);
        }
    }//GEN-LAST:event_jtCochesProveedorMouseClicked

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
            java.util.logging.Logger.getLogger(GestionDeCochesDeProveedoresIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeCochesDeProveedoresIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeCochesDeProveedoresIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeCochesDeProveedoresIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GestionDeCochesDeProveedoresIG dialog = new GestionDeCochesDeProveedoresIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDarDeAlta;
    private javax.swing.JButton jbDarDeBaja;
    private javax.swing.JButton jbModificarDatos;
    private javax.swing.JPanel jpMostrarCoches;
    private javax.swing.JPanel jpMostrarProveedores;
    private javax.swing.JTable jtCochesProveedor;
    private javax.swing.JTable jtProveedores;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Proveedor> getMisProveedores() {
        return misProveedores;
    }

    public void setMisProveedores(ArrayList<Proveedor> misProveedores) {
        this.misProveedores = misProveedores;
    }

    public void cargarProveedores() {
      
        
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Código");
        modelo.addColumn("Tipo de coche");

        //Recorremos los proveedores
        Object[] fila = new Object[4];
        for (int i = 0; i < this.misProveedores.size(); i++) {
            fila[0] = this.misProveedores.get(i).getNombre();
            fila[1] = this.misProveedores.get(i).getDireccion();
            fila[2] = this.misProveedores.get(i).getCodigo();
            fila[3] = this.misProveedores.get(i).getTipoCoche();
       
            modelo.addRow(fila);
        }     

        this.jbModificarDatos.setEnabled(false);
        this.jbDarDeBaja.setEnabled(false);
        jtProveedores.setModel(modelo);        
    }
    
    private void cargarCochesDeProveedores(){
       DefaultTableModel modeloCoches = new DefaultTableModel();

        modeloCoches.addColumn("Marca");
        modeloCoches.addColumn("Modelo");
        modeloCoches.addColumn("Precio venta");
        modeloCoches.addColumn("Matrícula");
        modeloCoches.addColumn("Tipo de vehículo");

        //Recorremos los coches de un proveedor y añadimos fila
        Object[] filaCoches = new Object[5];
        for (int i = 0; i < this.misProveedores.get(this.rowProveedor).getCoches().size(); i++) {
            filaCoches[0] = this.misProveedores.get(this.rowProveedor).getCoches().get(i).getMarca();
            filaCoches[1] = this.misProveedores.get(this.rowProveedor).getCoches().get(i).getModelo();
            filaCoches[2] = this.misProveedores.get(this.rowProveedor).getCoches().get(i).getPrecioVenta();
            filaCoches[3] = this.misProveedores.get(this.rowProveedor).getCoches().get(i).getMatricula();
            filaCoches[4] = this.misProveedores.get(this.rowProveedor).getCoches().get(i).getTipoVehiculo();
       
            modeloCoches.addRow(filaCoches);
        }      
     
       this.jbModificarDatos.setEnabled(false);
       this.jbDarDeBaja.setEnabled(false);
       this.jtCochesProveedor.setModel(modeloCoches); 
    }
}
