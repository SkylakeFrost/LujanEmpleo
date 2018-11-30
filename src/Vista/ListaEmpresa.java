package Vista;

import Controlador.EmpresasJpaController;
import Modelo.Empresas;
import com.placeholder.PlaceHolder;
import java.awt.Cursor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Ismael
 */
public class ListaEmpresa extends javax.swing.JFrame {

    private EmpresasJpaController cn = new EmpresasJpaController();

    private DefaultTableModel dm;

    /**
     * Creates new form ListaEmpresa
     */
    public ListaEmpresa() {
        initComponents();

        PlaceHolder holder = new PlaceHolder(txtBusquedaNombre, "Buscar por Nombre");
        PlaceHolder holder1 = new PlaceHolder(txtBusquedaActividad, "Buscar por Actividad");
        PlaceHolder holder2 = new PlaceHolder(txtBusquedaCeo, "Buscar por Ceo");
        PlaceHolder holder3 = new PlaceHolder(txtBusquedaCuil, "Buscar por Cuil/Cuit");
        PlaceHolder holder4 = new PlaceHolder(txtBusquedaDescripcion, "Buscar por Descripcion");
        PlaceHolder holder5 = new PlaceHolder(txtBusquedaDireccion, "Buscar por Direccion");
        PlaceHolder holder6 = new PlaceHolder(txtBusquedaRubro, "Buscar por Rubro");
        PlaceHolder holder7 = new PlaceHolder(txtBusquedaTelefono, "Buscar por Telefono");
        BotonesConfig();
        popUpMenu();
        setLocationRelativeTo(null);
        CrearModelo();
        LlenarTabla();
        totalEmpresas();
        setExtendedState(MAXIMIZED_BOTH);

    }

    //menu popUp para editar y eliminar empresa de la tabla
    public void popUpMenu() {
        JPopupMenu popup = new JPopupMenu();
        Icon ico = new ImageIcon(getClass().getResource("/Imagenes/icons8-lápiz-30.png"));
        JMenuItem menu1 = new JMenuItem("Editar Empresa", ico);

        //CODIGO PARA MANDAR LOS DATOS DE LA JTABLE AL FRAME DE EDITAR ATRAVEZ DE JPOPUP
        menu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                editarEmpresa();

            }
        });
        popup.add(menu1);
//        popup.add(menu2);

        jTableEmpresas.setComponentPopupMenu(popup);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpleoTestPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("EmpleoTestPU").createEntityManager();
        empresasQuery = java.beans.Beans.isDesignTime() ? null : EmpleoTestPUEntityManager.createQuery("SELECT e FROM Empresas e");
        empresasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empresasQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        btnAgregarEmpresa = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        labelTotalEmpresas = new javax.swing.JLabel();
        txtBusquedaNombre = new javax.swing.JTextField();
        txtBusquedaDireccion = new javax.swing.JTextField();
        txtBusquedaCuil = new javax.swing.JTextField();
        txtBusquedaTelefono = new javax.swing.JTextField();
        txtBusquedaRubro = new javax.swing.JTextField();
        txtBusquedaCeo = new javax.swing.JTextField();
        txtBusquedaActividad = new javax.swing.JTextField();
        txtBusquedaDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 164, 59));

        jTableEmpresas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEmpresas.getTableHeader().setReorderingAllowed(false);
        jTableEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresas);

        btnAgregarEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-agregar-propiedad-64.png"))); // NOI18N
        btnAgregarEmpresa.setText("Agregar Empresa");
        btnAgregarEmpresa.setBorder(null);
        btnAgregarEmpresa.setBorderPainted(false);
        btnAgregarEmpresa.setContentAreaFilled(false);
        btnAgregarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpresaActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-64_1.png"))); // NOI18N
        btnVolver.setText("Volver Al Menu");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        labelTotalEmpresas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtBusquedaNombre.setToolTipText("");
        txtBusquedaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaNombreActionPerformed(evt);
            }
        });
        txtBusquedaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaNombreKeyReleased(evt);
            }
        });

        txtBusquedaDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaDireccionActionPerformed(evt);
            }
        });

        txtBusquedaCuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaCuilActionPerformed(evt);
            }
        });

        txtBusquedaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaTelefonoActionPerformed(evt);
            }
        });

        txtBusquedaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaRubroActionPerformed(evt);
            }
        });

        txtBusquedaCeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaCeoActionPerformed(evt);
            }
        });

        txtBusquedaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActividadActionPerformed(evt);
            }
        });

        txtBusquedaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTotalEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addComponent(btnVolver)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(txtBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaCeo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaCeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusquedaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAgregarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpresaActionPerformed
        dispose();
        new AgregarEmpresa().setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpresaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTableEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpresasMouseClicked

    }//GEN-LAST:event_jTableEmpresasMouseClicked

    private void txtBusquedaNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaNombreKeyReleased
        filtro(txtBusquedaNombre.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaNombreKeyReleased

    private void txtBusquedaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaNombreActionPerformed

    private void txtBusquedaDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaDireccionActionPerformed
        filtro(txtBusquedaDireccion.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaDireccionActionPerformed

    private void txtBusquedaCuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaCuilActionPerformed
        filtro(txtBusquedaCuil.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaCuilActionPerformed

    private void txtBusquedaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaTelefonoActionPerformed
        filtro(txtBusquedaTelefono.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaTelefonoActionPerformed

    private void txtBusquedaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaRubroActionPerformed
        filtro(txtBusquedaRubro.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaRubroActionPerformed

    private void txtBusquedaCeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaCeoActionPerformed
        filtro(txtBusquedaCeo.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaCeoActionPerformed

    private void txtBusquedaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActividadActionPerformed
        filtro(txtBusquedaActividad.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaActividadActionPerformed

    private void txtBusquedaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaDescripcionActionPerformed
        filtro(txtBusquedaDescripcion.getText().trim(), jTableEmpresas);
    }//GEN-LAST:event_txtBusquedaDescripcionActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EmpleoTestPUEntityManager;
    private javax.swing.JButton btnAgregarEmpresa;
    private javax.swing.JButton btnVolver;
    private java.util.List<Modelo.Empresas> empresasList;
    private javax.persistence.Query empresasQuery;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JLabel labelTotalEmpresas;
    private javax.swing.JTextField txtBusquedaActividad;
    private javax.swing.JTextField txtBusquedaCeo;
    private javax.swing.JTextField txtBusquedaCuil;
    private javax.swing.JTextField txtBusquedaDescripcion;
    private javax.swing.JTextField txtBusquedaDireccion;
    private javax.swing.JTextField txtBusquedaNombre;
    private javax.swing.JTextField txtBusquedaRubro;
    private javax.swing.JTextField txtBusquedaTelefono;
    // End of variables declaration//GEN-END:variables

    //Muestra la cantidad de empresas encontradas en la base de datos
    private void totalEmpresas() {
        labelTotalEmpresas.setText("Total De Empresas Encontradas :  " + jTableEmpresas.getRowCount());
    }

    DefaultTableModel modelo;

    private void CrearModelo() {

        try {
            modelo = (new DefaultTableModel(
                    null, new String[]{
                        "ID", "Nombre",
                        "Direccion", "CUIL", "Telefono", "Rubro", "CEO",
                        "Actividad", "Descripcion"}) {
                Class[] types = new Class[]{
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class

                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }

            });
            jTableEmpresas.setModel(modelo);
            jTableEmpresas.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableEmpresas.getColumnModel().getColumn(7).setMaxWidth(60);
            jTableEmpresas.setRowHeight(30);
            jTableEmpresas.getTableHeader().setResizingAllowed(true);
            jTableEmpresas.getTableHeader().setReorderingAllowed(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error");
        }
    }

    
    

    public void LlenarTabla() {
        try {
            Object A[] = null;
            List<Empresas> ListaEmpresas;
            ListaEmpresas = cn.findEmpresasEntities();

            String[] datosEmpresas = new String[9];
            for (Empresas p : ListaEmpresas) {
                datosEmpresas[0] = p.getIdEmpresas().toString();
                datosEmpresas[1] = p.getNombre();
                datosEmpresas[2] = p.getDireccion();
                datosEmpresas[3] = p.getCuil();
                datosEmpresas[4] = p.getTelefono();
                datosEmpresas[5] = p.getRubro();
                datosEmpresas[6] = p.getCeo();
                datosEmpresas[7] = p.getActividad();
                datosEmpresas[8] = p.getDescripcion();
                modelo.addRow(datosEmpresas);
                
            }
            jTableEmpresas.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }

    private void editarEmpresa() {
        int fila = jTableEmpresas.getSelectedRow();
        Empresas empresa = new Empresas(Integer.valueOf((String) jTableEmpresas.getValueAt(fila, 0)), jTableEmpresas.getValueAt(fila, 1).toString(),
                jTableEmpresas.getValueAt(fila, 2).toString(), jTableEmpresas.getValueAt(fila, 3).toString(),
                jTableEmpresas.getValueAt(fila, 4).toString(), jTableEmpresas.getValueAt(fila, 5).toString(),
                jTableEmpresas.getValueAt(fila, 6).toString(), jTableEmpresas.getValueAt(fila, 7).toString(),
                jTableEmpresas.getValueAt(fila, 8).toString());
        EditarEmpresa edit = new EditarEmpresa(empresa);
        edit.setVisible(true);
    }

    private void BotonesConfig() {
      btnAgregarEmpresa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
