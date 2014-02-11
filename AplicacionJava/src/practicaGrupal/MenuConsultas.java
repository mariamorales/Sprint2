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
 * MenuConsultas.java
 *
 * Created on 13-dic-2011, 18:01:39
 */
package practicaGrupal;


public class MenuConsultas extends javax.swing.JDialog {
    
    private Concesionario conceConsulta;

    /** Creates new form MenuConsultas */
    public MenuConsultas(java.awt.Frame parent, boolean modal) {
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

        jbMostrarCochesVenta = new javax.swing.JButton();
        jbMostrarCochesReservados = new javax.swing.JButton();
        jbMostrarCochesVendidos = new javax.swing.JButton();
        jbMostrarCochesReparacion = new javax.swing.JButton();
        jbMostrarClientesCocheReservado = new javax.swing.JButton();
        jbMostrarDatosClienteSegunCoche = new javax.swing.JButton();
        jbMostrarExposicionDeUnCoche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú de informes");

        jbMostrarCochesVenta.setText("Mostrar coches en venta");
        jbMostrarCochesVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarCochesVentaActionPerformed(evt);
            }
        });

        jbMostrarCochesReservados.setText("Mostrar coches reservados");
        jbMostrarCochesReservados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarCochesReservadosActionPerformed(evt);
            }
        });

        jbMostrarCochesVendidos.setText("Mostrar coches vendidos por un vendedor a comisión");
        jbMostrarCochesVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarCochesVendidosActionPerformed(evt);
            }
        });

        jbMostrarCochesReparacion.setText("Mostrar coches en reparación");
        jbMostrarCochesReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarCochesReparacionActionPerformed(evt);
            }
        });

        jbMostrarClientesCocheReservado.setText("Mostrar clientes que tienen un coche reservado");
        jbMostrarClientesCocheReservado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarClientesCocheReservadoActionPerformed(evt);
            }
        });

        jbMostrarDatosClienteSegunCoche.setText("Mostrar datos del cliente según el coche que ha comprado");
        jbMostrarDatosClienteSegunCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarDatosClienteSegunCocheActionPerformed(evt);
            }
        });

        jbMostrarExposicionDeUnCoche.setText("Mostrar exposición en la que se encuentra un coche");
        jbMostrarExposicionDeUnCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarExposicionDeUnCocheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbMostrarExposicionDeUnCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMostrarCochesVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMostrarCochesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMostrarCochesReservados)
                    .addComponent(jbMostrarDatosClienteSegunCoche, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jbMostrarCochesReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jbMostrarClientesCocheReservado, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbMostrarClientesCocheReservado, jbMostrarCochesReparacion, jbMostrarCochesReservados, jbMostrarCochesVendidos, jbMostrarCochesVenta, jbMostrarDatosClienteSegunCoche, jbMostrarExposicionDeUnCoche});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbMostrarCochesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarCochesReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarCochesReservados)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarCochesVendidos)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarClientesCocheReservado)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarDatosClienteSegunCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbMostrarExposicionDeUnCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbMostrarClientesCocheReservado, jbMostrarCochesReparacion, jbMostrarCochesReservados, jbMostrarCochesVendidos, jbMostrarCochesVenta, jbMostrarDatosClienteSegunCoche, jbMostrarExposicionDeUnCoche});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarCochesVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarCochesVentaActionPerformed
        ConsultaCochesEnVentaIG ccev = new ConsultaCochesEnVentaIG(null, true);
        
        ccev.setMisCochesC(this.conceConsulta.getCochesConcesionario());
        ccev.cargarCochesEnVenta();
        
        ccev.setLocationRelativeTo(null);
        ccev.setVisible(true);
    }//GEN-LAST:event_jbMostrarCochesVentaActionPerformed
    
    private void jbMostrarCochesReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarCochesReparacionActionPerformed
        ConsultaCochesEnReparacionIG ccer = new ConsultaCochesEnReparacionIG(null, true);
        
        ccer.setMisCochesC(this.conceConsulta.getCochesConcesionario());
        ccer.cargarCochesEnReparacion();
        
        ccer.setLocationRelativeTo(null);
        ccer.setVisible(true);
        
    }//GEN-LAST:event_jbMostrarCochesReparacionActionPerformed
    
    private void jbMostrarCochesReservadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarCochesReservadosActionPerformed
        ConsultaCochesReservadosIG ccr = new ConsultaCochesReservadosIG(null, true);
        
        ccr.setMisCochesC(this.conceConsulta.getCochesConcesionario());
        ccr.cargarCochesReservados();
        
        ccr.setLocationRelativeTo(null);
        ccr.setVisible(true);
    }//GEN-LAST:event_jbMostrarCochesReservadosActionPerformed
    
    private void jbMostrarCochesVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarCochesVendidosActionPerformed
        ConsultaCochesVendidosComisionarioIG ccvc = new ConsultaCochesVendidosComisionarioIG(null, true);
        
        ccvc.setLocationRelativeTo(null);
        ccvc.CargarComisionario(this.conceConsulta.getComisionarios());
        ccvc.setVisible(true);
    }//GEN-LAST:event_jbMostrarCochesVendidosActionPerformed
    
    private void jbMostrarClientesCocheReservadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarClientesCocheReservadoActionPerformed
        ConsultaClientesTienenCocheReservadoIG cctcr = new ConsultaClientesTienenCocheReservadoIG(null, true);
        
        cctcr.setMisClientes(this.conceConsulta.getClientes());
        cctcr.cargarClientes();
        cctcr.setLocationRelativeTo(null);
        cctcr.setVisible(true);
    }//GEN-LAST:event_jbMostrarClientesCocheReservadoActionPerformed
    
    private void jbMostrarDatosClienteSegunCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarDatosClienteSegunCocheActionPerformed
        ConsultaClienteComproCocheIG cccc = new ConsultaClienteComproCocheIG(null, true);
        
        cccc.setMisClientes(this.conceConsulta.getClientes());
        cccc.setMisCoches(this.conceConsulta.getCochesConcesionario());
        cccc.cargarCoches();
        cccc.setLocationRelativeTo(null);
        cccc.setVisible(true);
    }//GEN-LAST:event_jbMostrarDatosClienteSegunCocheActionPerformed
    
    private void jbMostrarExposicionDeUnCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarExposicionDeUnCocheActionPerformed
        ConsultaExposicionEstaUnCocheIG ce = new ConsultaExposicionEstaUnCocheIG(null, true);
        ce.CargarCoches(this.conceConsulta.getCochesConcesionario());
        ce.setListaExpo(this.conceConsulta.getExposiciones());
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }//GEN-LAST:event_jbMostrarExposicionDeUnCocheActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                MenuConsultas dialog = new MenuConsultas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbMostrarClientesCocheReservado;
    private javax.swing.JButton jbMostrarCochesReparacion;
    private javax.swing.JButton jbMostrarCochesReservados;
    private javax.swing.JButton jbMostrarCochesVendidos;
    private javax.swing.JButton jbMostrarCochesVenta;
    private javax.swing.JButton jbMostrarDatosClienteSegunCoche;
    private javax.swing.JButton jbMostrarExposicionDeUnCoche;
    // End of variables declaration//GEN-END:variables

    public Concesionario getConceConsulta() {
        return conceConsulta;
    }
    
    public void setConceConsulta(Concesionario conceConsulta) {
        this.conceConsulta = conceConsulta;
    }
}
