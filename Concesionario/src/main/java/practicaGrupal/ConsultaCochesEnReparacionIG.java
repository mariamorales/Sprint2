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
 * ConsultaCochesEnReparacionIG.java
 *
 * Created on 13-dic-2011, 20:26:30
 */
package practicaGrupal;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ConsultaCochesEnReparacionIG extends javax.swing.JDialog {
    private ArrayList<CocheConcesionario> misCochesC =
            new ArrayList<CocheConcesionario>();
    /** Creates new form ConsultaCochesEnReparacionIG */
    public ConsultaCochesEnReparacionIG(java.awt.Frame parent, boolean modal) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jtCochesConcesionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coches en reparación");

        jScrollPane2.setViewportView(jtCochesConcesionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
            .addGap(0, 529, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
            .addGap(0, 192, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultaCochesEnReparacionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCochesEnReparacionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCochesEnReparacionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCochesEnReparacionIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ConsultaCochesEnReparacionIG dialog = new ConsultaCochesEnReparacionIG(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtCochesConcesionario;
    // End of variables declaration//GEN-END:variables
    
      public void cargarCochesEnReparacion() {
        DefaultTableModel modeloCoches = new DefaultTableModel();

        modeloCoches.addColumn("Marca");
        modeloCoches.addColumn("Modelo");
        modeloCoches.addColumn("Precio venta");
        modeloCoches.addColumn("Matrícula");
        modeloCoches.addColumn("Tipo de vehículo");

        //Recorremos los coches del concesionario y añadimos fila
        Object[] filaCoches = new Object[5];
        for (int i = 0; i < this.misCochesC.size(); i++) {
            if ((misCochesC.get(i).getEstado().equalsIgnoreCase("Reparacion"))) {
                filaCoches[0] = this.misCochesC.get(i).getMarca();
                filaCoches[1] = this.misCochesC.get(i).getModelo();
                filaCoches[2] = this.misCochesC.get(i).getPrecioVenta();
                filaCoches[3] = this.misCochesC.get(i).getMatricula();
                filaCoches[4] = this.misCochesC.get(i).getTipoVehiculo();

                modeloCoches.addRow(filaCoches);
            }
        }

        this.jtCochesConcesionario.setModel(modeloCoches);
    }

    public ArrayList<CocheConcesionario> getMisCochesC() {
        return misCochesC;
    }

    public void setMisCochesC(ArrayList<CocheConcesionario> misCochesC) {
        this.misCochesC = misCochesC;
    }
}
