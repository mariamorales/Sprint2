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
 * VentaCocheIG.java
 *
 * Created on 10-dic-2011, 15:39:37
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentaCocheIG extends javax.swing.JDialog {

    private ArrayList<Empleado> misEmpleados = new ArrayList<Empleado>();
    private ArrayList<Comisionario> misComisionarios = new ArrayList<Comisionario>();
    private ArrayList<CocheConcesionario> misCoches = new ArrayList<CocheConcesionario>();
    private ArrayList<Cliente> misClientes = new ArrayList<Cliente>();
    private ArrayList<Exposicion> misExposiciones = new ArrayList<Exposicion>();
    private int pos;
    private int[] posRealEmpleado;
    private int[] posRealCoche;

    /** Creates new form VentaCocheIG */
    public VentaCocheIG(java.awt.Frame parent, boolean modal) {
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

        jpMostrarVendedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendedor = new javax.swing.JTable();
        jpMostrarCoches = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCoches = new javax.swing.JTable();
        jbConfirmarVenta = new javax.swing.JButton();
        jpMostrarCliente = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jpMostrarCochesR = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtCochesR = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vender un coche");

        jpMostrarVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendedores"));

        jtVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtVendedor);

        javax.swing.GroupLayout jpMostrarVendedorLayout = new javax.swing.GroupLayout(jpMostrarVendedor);
        jpMostrarVendedor.setLayout(jpMostrarVendedorLayout);
        jpMostrarVendedorLayout.setHorizontalGroup(
            jpMostrarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMostrarVendedorLayout.setVerticalGroup(
            jpMostrarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarVendedorLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMostrarCoches.setBorder(javax.swing.BorderFactory.createTitledBorder("Coches"));

        jtCoches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCochesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCoches);

        javax.swing.GroupLayout jpMostrarCochesLayout = new javax.swing.GroupLayout(jpMostrarCoches);
        jpMostrarCoches.setLayout(jpMostrarCochesLayout);
        jpMostrarCochesLayout.setHorizontalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMostrarCochesLayout.setVerticalGroup(
            jpMostrarCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbConfirmarVenta.setText("Confirmar venta");
        jbConfirmarVenta.setEnabled(false);
        jbConfirmarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarVentaActionPerformed(evt);
            }
        });

        jpMostrarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtCliente);

        javax.swing.GroupLayout jpMostrarClienteLayout = new javax.swing.GroupLayout(jpMostrarCliente);
        jpMostrarCliente.setLayout(jpMostrarClienteLayout);
        jpMostrarClienteLayout.setHorizontalGroup(
            jpMostrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMostrarClienteLayout.setVerticalGroup(
            jpMostrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMostrarCochesR.setBorder(javax.swing.BorderFactory.createTitledBorder("Coches reservados por cliente"));

        jtCochesR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCochesRMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtCochesR);

        javax.swing.GroupLayout jpMostrarCochesRLayout = new javax.swing.GroupLayout(jpMostrarCochesR);
        jpMostrarCochesR.setLayout(jpMostrarCochesRLayout);
        jpMostrarCochesRLayout.setHorizontalGroup(
            jpMostrarCochesRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMostrarCochesRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMostrarCochesRLayout.setVerticalGroup(
            jpMostrarCochesRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpMostrarCochesR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpMostrarCoches, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbConfirmarVenta)
                        .addGap(251, 251, 251))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpMostrarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jpMostrarCliente, jpMostrarVendedor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMostrarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpMostrarCochesR, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbConfirmarVenta)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpMostrarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jpMostrarCoches, jpMostrarCochesR});

        jpMostrarVendedor.getAccessibleContext().setAccessibleName("Vendedor");
        jpMostrarCliente.getAccessibleContext().setAccessibleName("Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        this.pos = this.jtCliente.rowAtPoint(evt.getPoint());
        this.cargarCochesReservado(misClientes, pos);
        this.actualizarBoton();
    }//GEN-LAST:event_jtClienteMouseClicked

    private void jbConfirmarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarVentaActionPerformed
        int ven = 0;
        int cli = 0;
        int co = 0;
        int coR = 0;
        int coche = 0;
        int i = 0;
        int j = 0;
        boolean correcto = false;
        boolean correcto2 = false;
        while ((!this.jtVendedor.isRowSelected(ven))
                && (ven < this.jtVendedor.getRowCount())) {
            ven++;
        }
        while ((!this.jtCliente.isRowSelected(cli))
                && (cli < this.jtCliente.getRowCount())) {
            cli++;
        }
        while ((!this.jtCoches.isRowSelected(co))
                && (co < this.jtCoches.getRowCount())) {
            co++;
        }
        while ((!this.jtCochesR.isRowSelected(coR))
                && (coR < this.jtCochesR.getRowCount())) {
            coR++;
        }
        //Se cargan posiciones reales dentro del arraylist
        this.posRealEmpleado = this.posicionRealVendedor(misEmpleados, misComisionarios);
        this.posRealCoche = this.posicionRealCoche(misCoches);

        //Se da preferencia a la seleccion de un coche reservado en caso de seleccionar los 2
        if (this.jtCochesR.isRowSelected(coR)) {
            if (this.jtCoches.isRowSelected(co)) {
                JOptionPane.showMessageDialog(this, "Se da prioridad al coche reservado para venderlo.");
            }
            //Buscamos el coche reservado en coches
            while ((!correcto) && (coche < misCoches.size())) {
                if ((this.misCoches.get(coche).getMarca().equalsIgnoreCase(this.misClientes.get(cli).getCochesReservados().get(coR).getMarca()))
                        && (this.misCoches.get(coche).getModelo().equalsIgnoreCase(this.misClientes.get(cli).getCochesReservados().get(coR).getModelo()))
                        && (this.misCoches.get(coche).getMatricula().equalsIgnoreCase(this.misClientes.get(cli).getCochesReservados().get(coR).getMatricula()))
                        && (this.misCoches.get(coche).getTipoVehiculo().equalsIgnoreCase(this.misClientes.get(cli).getCochesReservados().get(coR).getTipoVehiculo()))
                        && (this.misCoches.get(coche).getPrecioVenta() == this.misClientes.get(cli).getCochesReservados().get(coR).getPrecioVenta())
                        && (this.misCoches.get(coche).getPrecioCompra() == this.misClientes.get(cli).getCochesReservados().get(coR).getPrecioCompra())
                        && (this.misCoches.get(coche).getEstado().equalsIgnoreCase(this.misClientes.get(cli).getCochesReservados().get(coR).getEstado()))) {
                    correcto = true;
                } else {
                    coche++;
                }
            }

            //Buscamos el coche en las exposiciones
            while ((!correcto2) && (i < misExposiciones.size())) {
                while ((!correcto2) && (j < misExposiciones.get(i).getCochesExpo().size())) {
                    if ((this.misCoches.get(coche).getMarca().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getMarca()))
                            && (this.misCoches.get(coche).getModelo().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getModelo()))
                            && (this.misCoches.get(coche).getMatricula().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getMatricula()))
                            && (this.misCoches.get(coche).getTipoVehiculo().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getTipoVehiculo()))
                            && (this.misCoches.get(coche).getPrecioVenta() == this.misExposiciones.get(i).getCochesExpo().get(j).getPrecioVenta())
                            && (this.misCoches.get(coche).getPrecioCompra() == this.misExposiciones.get(i).getCochesExpo().get(j).getPrecioCompra())
                            && (this.misCoches.get(coche).getEstado().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getEstado()))) {
                        correcto2 = true;
                    } else {
                        j++;
                    }
                }
                j = 0;
                if (!correcto2) {
                    i++;
                }
            }
            //Si hemos encontrado el coche en una exposicion, lo borramos
            //i es el numero de exposicion y j es el coche
            if (correcto2) {
                misExposiciones.get(i).getCochesExpo().remove(j);
            }
            if (jtVendedor.getValueAt(ven, 1).toString().equalsIgnoreCase("Comisionario")) {
                JOptionPane.showMessageDialog(this, "Es comisionario");
                //Se pone en el arraylist del comisionario y se pone estado de vendido
                this.misComisionarios.get(this.posRealEmpleado[ven]).venderCoche(this.misCoches.get(coche));
                this.misClientes.get(cli).ComprarCocheReservado(this.misClientes.get(cli).getCochesReservados().get(coR));

            } else {
                JOptionPane.showMessageDialog(this, "No es comisionario");
                this.misCoches.get(coche).ponerVendido();
                this.misClientes.get(cli).ComprarCocheReservado(this.misClientes.get(cli).getCochesReservados().get(coR));
            }
        } else {
            if (jtCoches.isRowSelected(co)) {
                //Buscamos el coche en las exposiciones
                while ((!correcto2) && (i < misExposiciones.size())) {
                    while ((!correcto2) && (j < misExposiciones.get(i).getCochesExpo().size())) {
                        if ((this.misCoches.get(posRealCoche[co]).getMarca().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getMarca()))
                                && (this.misCoches.get(posRealCoche[co]).getModelo().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getModelo()))
                                && (this.misCoches.get(posRealCoche[co]).getMatricula().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getMatricula()))
                                && (this.misCoches.get(posRealCoche[co]).getTipoVehiculo().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getTipoVehiculo()))
                                && (this.misCoches.get(posRealCoche[co]).getPrecioVenta() == this.misExposiciones.get(i).getCochesExpo().get(j).getPrecioVenta())
                                && (this.misCoches.get(posRealCoche[co]).getPrecioCompra() == this.misExposiciones.get(i).getCochesExpo().get(j).getPrecioCompra())
                                && (this.misCoches.get(posRealCoche[co]).getEstado().equalsIgnoreCase(this.misExposiciones.get(i).getCochesExpo().get(j).getEstado()))) {
                            correcto2 = true;
                        } else {
                            j++;
                        }
                    }
                    j = 0;
                    if (!correcto2) {
                        i++;
                    }
                }
                //Si hemos encontrado el coche en una exposicion, lo borramos
                //i es el numero de exposicion y j es el coche
                if (correcto2) {
                    misExposiciones.get(i).getCochesExpo().remove(j);
                }
                if (jtVendedor.getValueAt(ven, 1).toString().equalsIgnoreCase("Comisionario")) {
                    JOptionPane.showMessageDialog(this, "Es comisionario");
                    //Se pone en el arraylist del comisionario y se pone estado de vendido
                    this.misComisionarios.get(this.posRealEmpleado[ven]).venderCoche(this.misCoches.get(this.posRealCoche[co]));
                    this.misClientes.get(cli).ComprarCoche(this.misCoches.get(this.posRealCoche[co]));
                } else {
                    JOptionPane.showMessageDialog(this, "No es comisionario");
                    this.misCoches.get(this.posRealCoche[co]).ponerVendido();
                    this.misClientes.get(cli).ComprarCoche(this.misCoches.get(this.posRealCoche[co]));

                }
            }
        }
        this.cargarCoches(misCoches);
        this.cargarCochesReservado(misClientes, pos);
        this.actualizarBoton();
    }//GEN-LAST:event_jbConfirmarVentaActionPerformed

    private void jtVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVendedorMouseClicked
        // TODO add your handling code here:
        this.actualizarBoton();
    }//GEN-LAST:event_jtVendedorMouseClicked

    private void jtCochesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCochesMouseClicked
        // TODO add your handling code here:
        this.actualizarBoton();
    }//GEN-LAST:event_jtCochesMouseClicked

    private void jtCochesRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCochesRMouseClicked
        // TODO add your handling code here:
        this.actualizarBoton();
    }//GEN-LAST:event_jtCochesRMouseClicked

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
            java.util.logging.Logger.getLogger(VentaCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                VentaCocheIG dialog = new VentaCocheIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbConfirmarVenta;
    private javax.swing.JPanel jpMostrarCliente;
    private javax.swing.JPanel jpMostrarCoches;
    private javax.swing.JPanel jpMostrarCochesR;
    private javax.swing.JPanel jpMostrarVendedor;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTable jtCoches;
    private javax.swing.JTable jtCochesR;
    private javax.swing.JTable jtVendedor;
    // End of variables declaration//GEN-END:variables

    public void cargarVendedores(ArrayList<Empleado> listaEmp, ArrayList<Comisionario> listaCom) {
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");

        //Recorremos los proveedores
        Object[] fila = new Object[2];
        for (int i = 0; i < listaEmp.size(); i++) {
            if (listaEmp.get(i).getTipoEmpleado().equalsIgnoreCase("Mecanico")) {
            } else {
                fila[0] = listaEmp.get(i).getNombre();
                fila[1] = listaEmp.get(i).getTipoEmpleado();
                modelo.addRow(fila);

            }
        }
        for (int i = 0; i < listaCom.size(); i++) {
            fila[0] = listaCom.get(i).getNombre();
            fila[1] = "Comisionario";
            modelo.addRow(fila);
        }

        jtVendedor.setModel(modelo);
        this.misEmpleados = listaEmp;
        this.misComisionarios = listaCom;

    }

    public void cargarClientes(ArrayList<Cliente> listaClien) {
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Dni");

        //Recorremos los proveedores
        Object[] fila = new Object[2];
        for (int i = 0; i < listaClien.size(); i++) {
            fila[0] = listaClien.get(i).getNombre();
            fila[1] = listaClien.get(i).getDni();

            modelo.addRow(fila);
        }

        jtCliente.setModel(modelo);
        this.misClientes = listaClien;


    }

    public void cargarCoches(ArrayList<CocheConcesionario> listaCoche) {
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Matricula");
        modelo.addColumn("Tipo Vehiculo");
        modelo.addColumn("Precio");

        //Recorremos los proveedores
        Object[] fila = new Object[5];
        for (int i = 0; i < listaCoche.size(); i++) {
            if (listaCoche.get(i).getEstado().equalsIgnoreCase("En venta")) {
                fila[0] = listaCoche.get(i).getMarca();
                fila[1] = listaCoche.get(i).getModelo();
                fila[2] = listaCoche.get(i).getMatricula();
                fila[3] = listaCoche.get(i).getTipoVehiculo();
                fila[4] = listaCoche.get(i).getPrecioCompra();
                modelo.addRow(fila);
            }
        }

        jtCoches.setModel(modelo);
        this.misCoches = listaCoche;


    }

    public void cargarCochesReservado(ArrayList<Cliente> listaCocheR, int pos) {
        //Cargamos la tabla superior, la de los proveedores
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Matricula");
        modelo.addColumn("Tipo Vehiculo");
        modelo.addColumn("Precio");

        //Recorremos los proveedores
        Object[] fila = new Object[5];
        for (int i = 0; i < listaCocheR.get(pos).getCochesReservados().size(); i++) {
            fila[0] = listaCocheR.get(pos).getCochesReservados().get(i).getMarca();
            fila[1] = listaCocheR.get(pos).getCochesReservados().get(i).getModelo();
            fila[2] = listaCocheR.get(pos).getCochesReservados().get(i).getMatricula();
            fila[3] = listaCocheR.get(pos).getCochesReservados().get(i).getTipoVehiculo();
            fila[4] = listaCocheR.get(pos).getCochesReservados().get(i).getPrecioCompra();
            modelo.addRow(fila);
        }

        jtCochesR.setModel(modelo);
    }

    public int[] posicionRealVendedor(ArrayList<Empleado> listaEmp, ArrayList<Comisionario> listaCom) {
        int[] posRealVendedor = new int[(listaEmp.size() + listaCom.size())];
        int j = 0;
        for (int i = 0; i < listaEmp.size(); i++) {
            if (listaEmp.get(i).getTipoEmpleado().equalsIgnoreCase("Mecanico")) {
            } else {
                posRealVendedor[j] = i;
                j++;
            }
        }
        for (int i = 0; i < listaCom.size(); i++) {
            posRealVendedor[j] = i;
            j++;
        }
        return posRealVendedor;
    }

    public int[] posicionRealCoche(ArrayList<CocheConcesionario> listaCoche) {
        int[] posRealCoche = new int[listaCoche.size()];
        int j = 0;
        for (int i = 0; i < listaCoche.size(); i++) {
            if (listaCoche.get(i).getEstado().equalsIgnoreCase("En venta")) {
                posRealCoche[j] = i;
                j++;
            }
        }
        return posRealCoche;
    }

    public void actualizarBoton() {
        int ven = 0;
        int cli = 0;
        int co = 0;
        int coR = 0;
        while ((!this.jtVendedor.isRowSelected(ven))
                && (ven < this.jtVendedor.getRowCount())) {
            ven++;
        }
        while ((!this.jtCliente.isRowSelected(cli))
                && (cli < this.jtCliente.getRowCount())) {
            cli++;
        }
        while ((!this.jtCoches.isRowSelected(co))
                && (co < this.jtCoches.getRowCount())) {
            co++;
        }
        while ((!this.jtCochesR.isRowSelected(coR))
                && (coR < this.jtCochesR.getRowCount())) {
            coR++;
        }
        //Se comprueba que esta todo seleccionado
        if ((jtVendedor.isRowSelected(ven))
                && (this.jtCliente.isRowSelected(cli))
                && ((this.jtCoches.isRowSelected(co)) || (this.jtCochesR.isRowSelected(coR)))) {
            this.jbConfirmarVenta.setEnabled(true);
        } else {
            this.jbConfirmarVenta.setEnabled(false);
        }
    }

    public ArrayList<Cliente> getMisClientes() {
        return misClientes;
    }

    public void setMisClientes(ArrayList<Cliente> misClientes) {
        this.misClientes = misClientes;
    }

    public ArrayList<CocheConcesionario> getMisCoches() {
        return misCoches;
    }

    public void setMisCoches(ArrayList<CocheConcesionario> misCoches) {
        this.misCoches = misCoches;
    }

    public ArrayList<Comisionario> getMisComisionarios() {
        return misComisionarios;
    }

    public void setMisComisionarios(ArrayList<Comisionario> misComisionarios) {
        this.misComisionarios = misComisionarios;
    }

    public ArrayList<Empleado> getMisEmpleados() {
        return misEmpleados;
    }

    public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
        this.misEmpleados = misEmpleados;
    }

    public ArrayList<Exposicion> getMisExposiciones() {
        return misExposiciones;
    }

    public void setMisExposiciones(ArrayList<Exposicion> misExposiciones) {
        this.misExposiciones = misExposiciones;
    }
}