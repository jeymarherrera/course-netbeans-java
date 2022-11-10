
package medicamentos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Facturacion extends javax.swing.JFrame {

    //constructor
    public Facturacion() 
    {
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("No Factura");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha");
        jTResultado.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jfechaText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fecha");

        jfechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfechaTextActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jfechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jfechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql;
        String fecha=jfechaText.getText();
        if(!fecha.equals(""))
        {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[]={"No Factura","Nombre","Precio","Fecha"};
            modelo = new DefaultTableModel(null, titulos);//creando titulo
            ConectarBasedeDatos Con = new ConectarBasedeDatos(); //conectarme al bd
            try 
            {            
                Con.conectarDB();
                String [] datos = new String [4];
                sql=" SELECT a.num_factura, b.nombre, a.fecha, SUM(c.cantidad*c.precio) as precio "; //importante poner el alias 'a' , as
                sql+=" FROM facturas a, clientes b,  detalle_facturas c ";
                sql+=" WHERE a.id_cliente = b.id_cliente and a.num_factura = c.num_factura and a.fecha=? ";
                sql+=" GROUP BY  a.num_factura";
                //dejar espacio al inicio y final //? para indicar que debe ir un valor/parametro
                PreparedStatement st;
                try
                {
                    st = Con.conexion.prepareStatement(sql); //prepearando consulta para ejecutarlo
                    st.setString(1, fecha);//cantidad de ? y valor que deseo
                    //st.setInt(2, 10);//cantidad de ? y valor que deseo
                    ResultSet resultado=st.executeQuery(); //ejecutar consulta, como boton continuar
                    resultado.last();
                    int count =resultado.getRow();
                    //int count=resultado.getRow(); //pedir cantidad de filas que hay
                    if (count!=0) //comprobar que hay datos en la consulta
                    { //recorrerlo
                        resultado.beforeFirst();
                        while(resultado.next())
                        { //NOMBRE DE LA COLUMNA o indice de la columna
                            datos [0] = resultado.getString("num_factura");
                            datos [1] = resultado.getString("nombre");
                            datos [2] = resultado.getString("precio");
                            datos [3] = resultado.getString("fecha");
                            modelo.addRow(datos); //añadiendolo por columnas, intermediario para trabajar con objetos (modelo)
                        }
                        resultado.close();
                        jTResultado.setModel(modelo);//pasar la tabla al modelo
                        Con.desconectarDB();
                    } 
                   else
                    {
                       JOptionPane.showMessageDialog(rootPane, "No hay datos para esa fecha ", "",JOptionPane.WARNING_MESSAGE);
                    }
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
                } 
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la fecha a consultar", "",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jfechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfechaTextActionPerformed

    private void jTResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadoMouseClicked
      
        int index = jTResultado.getSelectedRow();
        TableModel model = jTResultado.getModel();
        int title1 = Integer.parseInt(model.getValueAt(index,0).toString());
        JOptionPane.showMessageDialog(rootPane, "No de Factura: "+title1, "",JOptionPane.WARNING_MESSAGE);
   
    }//GEN-LAST:event_jTResultadoMouseClicked

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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResultado;
    private javax.swing.JTextField jfechaText;
    // End of variables declaration//GEN-END:variables
}
