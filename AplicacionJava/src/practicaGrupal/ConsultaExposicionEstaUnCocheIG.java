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
 * ConsultaExposicionEstaUnCocheIG.java
 *
 * Created on 13-dic-2011, 20:29:12
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaExposicionEstaUnCocheIG extends javax.swing.JDialog {

    private ArrayList<CocheConcesionario> listaCoches;
    private ArrayList<Exposicion> listaExpo;
    private int[] pos;

    /** Creates new form ConsultaExposicionEstaUnCocheIG */
    public ConsultaExposicionEstaUnCocheIG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void CargarCoches(ArrayList<CocheConcesionario> miCoche) {
        this.pos = new int[miCoche.size()];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Matricula");
        modelo.addColumn("Tipo Vehiculo");
        modelo.addColumn("Precio");

        //Recorremos los proveedores
        Object[] fila = new Object[5];
        int cont = 0;
        for (int i = 0; i < miCoche.size(); i++) {
            if (miCoche.get(i).getEstado().equalsIgnoreCase("En venta")) {
                fila[0] = miCoche.get(i).getMarca();
                fila[1] = miCoche.get(i).getModelo();
                fila[2] = miCoche.get(i).getMatricula();
                fila[3] = miCoche.get(i).getTipoVehiculo();
                fila[4] = miCoche.get(i).getPrecioCompra();
                modelo.addRow(fila);
                this.pos[cont] = i;
                cont++;
            }
        }

        jtCoches.setModel(modelo);
        this.listaCoches = miCoche;
        jtExpo.setModel(new DefaultTableModel());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtCoches = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtExpo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exposición en la que se encuentra un coche");

        jtCoches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCoches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCochesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCoches);

        jtExpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtExpo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jtCochesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCochesMouseClicked
// TODO add your handling code here:
    int i = 0;
    int j = 0;
    int ic = 0;
    boolean correcto = false;

    while ((!jtCoches.isRowSelected(ic)) && (ic < jtCoches.getRowCount())) {
        ic++;
    }
    if (jtCoches.isRowSelected(ic)) {
        //Buscamos el coche en las exposiciones

        while ((!correcto) && (i < listaExpo.size())) {
            while ((!correcto) && (j < listaExpo.get(i).getCochesExpo().size())) {
                if ((this.listaCoches.get(pos[ic]).getMarca().equalsIgnoreCase(this.listaExpo.get(i).getCochesExpo().get(j).getMarca()))
                        && (this.listaCoches.get(pos[ic]).getModelo().equalsIgnoreCase(this.listaExpo.get(i).getCochesExpo().get(j).getModelo()))
                        && (this.listaCoches.get(pos[ic]).getMatricula().equalsIgnoreCase(this.listaExpo.get(i).getCochesExpo().get(j).getMatricula()))
                        && (this.listaCoches.get(pos[ic]).getTipoVehiculo().equalsIgnoreCase(this.listaExpo.get(i).getCochesExpo().get(j).getTipoVehiculo()))
                        && (this.listaCoches.get(pos[ic]).getPrecioVenta() == this.listaExpo.get(i).getCochesExpo().get(j).getPrecioVenta())
                        && (this.listaCoches.get(pos[ic]).getPrecioCompra() == this.listaExpo.get(i).getCochesExpo().get(j).getPrecioCompra())
                        && (this.listaCoches.get(pos[ic]).getEstado().equalsIgnoreCase(this.listaExpo.get(i).getCochesExpo().get(j).getEstado()))) {
                    correcto = true;
                } else {
                    j++;
                }
            }
            j = 0;
            if (!correcto) {
                i++;
            }
        }

        if(correcto){
            this.cargarExposiciones(listaExpo, i);
        } else {
            JOptionPane.showMessageDialog(this, "El coche no esta en ninguna exposicion");
            jtExpo.setModel(new DefaultTableModel());
        }
        


    }

}//GEN-LAST:event_jtCochesMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaExposicionEstaUnCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaExposicionEstaUnCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaExposicionEstaUnCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaExposicionEstaUnCocheIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ConsultaExposicionEstaUnCocheIG dialog = new ConsultaExposicionEstaUnCocheIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable jtCoches;
    private javax.swing.JTable jtExpo;
    // End of variables declaration//GEN-END:variables

    public void cargarExposiciones(ArrayList<Exposicion> listaExpo, int i) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Numero");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");

        //Recorremos los proveedores
        Object[] fila = new Object[3];
        fila[0] = listaExpo.get(i).getNumero();
        fila[1] = listaExpo.get(i).getDireccion();
        fila[2] = listaExpo.get(i).getTelefono();

        modelo.addRow(fila);

        jtExpo.setModel(modelo);

    }

    public ArrayList<CocheConcesionario> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<CocheConcesionario> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public ArrayList<Exposicion> getListaExpo() {
        return listaExpo;
    }

    public void setListaExpo(ArrayList<Exposicion> listaExpo) {
        this.listaExpo = listaExpo;
    }
}