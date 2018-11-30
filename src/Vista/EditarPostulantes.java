package Vista;

import Controlador.EmpresasJpaController;
import Controlador.PostulantesJpaController;
import Modelo.Postulantes;
import static Vista.EditarEmpresa.txtCEOEdit;
import static Vista.EditarEmpresa.txtCuilEdit;
import static Vista.EditarEmpresa.txtDescripcionEdit;
import static Vista.EditarEmpresa.txtDireccionEdit;
import static Vista.EditarEmpresa.txtIDEdit;
import static Vista.EditarEmpresa.txtNombreEdit;
import static Vista.EditarEmpresa.txtRubroEdit;
import static Vista.EditarEmpresa.txtTelefonoEdit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class EditarPostulantes extends javax.swing.JFrame {

    private Postulantes postulante;

    /**
     * Creates new form AgregarPostulante
     */
    public EditarPostulantes(Postulantes postulante) {
        this.postulante = postulante;
        initComponents();
        cargarDatosPostulante(this.postulante);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEditNombre = new javax.swing.JTextField();
        txtEditApellido = new javax.swing.JTextField();
        txtEditEdad = new javax.swing.JTextField();
        txtEditDNI = new javax.swing.JTextField();
        txtEditMovilidad = new javax.swing.JTextField();
        txtEditNivelEducativo = new javax.swing.JTextField();
        txtEditPerfil = new javax.swing.JTextField();
        boxEditSexo = new javax.swing.JComboBox<>();
        txtEditCuil = new javax.swing.JTextField();
        txtEditDomicilio = new javax.swing.JTextField();
        txtEditTelfPrincipal = new javax.swing.JTextField();
        txtEditTelfAlternativo = new javax.swing.JTextField();
        txtEditEmail = new javax.swing.JTextField();
        txtEditDispHoraria = new javax.swing.JTextField();
        txtNotas = new javax.swing.JScrollPane();
        jTextEditArea1 = new javax.swing.JTextArea();
        btnGuardarPostulante = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtIDEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 164, 59));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Movilidad");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nivel Educativo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Perfil");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Sexo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CUIL/CUIT");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Domicilio");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Telefono Principal");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Telefono Alternativo");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Email");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Disponibilidad Horaria");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Notas");

        txtEditNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditMovilidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditNivelEducativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        boxEditSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxEditSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro", " " }));

        txtEditCuil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditDomicilio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditTelfPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEditTelfPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditTelfPrincipalActionPerformed(evt);
            }
        });

        txtEditTelfAlternativo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEditDispHoraria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextEditArea1.setColumns(20);
        jTextEditArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextEditArea1.setRows(5);
        jTextEditArea1.setLineWrap(true);
        txtNotas.setViewportView(jTextEditArea1);

        btnGuardarPostulante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPostulante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-guardar-como-64.png"))); // NOI18N
        btnGuardarPostulante.setText("Guardar Cambios");
        btnGuardarPostulante.setBorderPainted(false);
        btnGuardarPostulante.setContentAreaFilled(false);
        btnGuardarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPostulanteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-64_1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtIDEdit.setEditable(false);
        txtIDEdit.setText("jTextField1");
        txtIDEdit.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEditNombre)
                                .addComponent(txtEditApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtEditEdad))
                            .addComponent(txtEditDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(222, Short.MAX_VALUE)
                                .addComponent(btnGuardarPostulante)
                                .addGap(56, 56, 56)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxEditSexo, 0, 200, Short.MAX_VALUE)
                                    .addComponent(txtEditPerfil)
                                    .addComponent(txtEditNivelEducativo)
                                    .addComponent(txtEditMovilidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditDomicilio)
                            .addComponent(txtEditTelfPrincipal)
                            .addComponent(txtEditTelfAlternativo)
                            .addComponent(txtEditEmail)
                            .addComponent(txtEditDispHoraria)
                            .addComponent(txtNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEditCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEditNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEditCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtEditApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(txtEditDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtEditTelfPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEditEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel13)
                        .addComponent(txtEditTelfAlternativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEditDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditMovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtEditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEditDispHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtEditPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxEditSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPostulante)
                    .addComponent(btnCancelar)
                    .addComponent(txtIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        new ListaPostulantes().setVisible(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPostulanteActionPerformed
        editarPostulante();
    }//GEN-LAST:event_btnGuardarPostulanteActionPerformed

    private void txtEditTelfPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditTelfPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditTelfPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPostulantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> boxEditSexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarPostulante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextArea jTextEditArea1;
    public static javax.swing.JTextField txtEditApellido;
    public static javax.swing.JTextField txtEditCuil;
    public static javax.swing.JTextField txtEditDNI;
    public static javax.swing.JTextField txtEditDispHoraria;
    public static javax.swing.JTextField txtEditDomicilio;
    public static javax.swing.JTextField txtEditEdad;
    public static javax.swing.JTextField txtEditEmail;
    public static javax.swing.JTextField txtEditMovilidad;
    public static javax.swing.JTextField txtEditNivelEducativo;
    public static javax.swing.JTextField txtEditNombre;
    public static javax.swing.JTextField txtEditPerfil;
    public static javax.swing.JTextField txtEditTelfAlternativo;
    public static javax.swing.JTextField txtEditTelfPrincipal;
    public static javax.swing.JTextField txtIDEdit;
    private javax.swing.JScrollPane txtNotas;
    // End of variables declaration//GEN-END:variables

    private void editarPostulante() {
        PostulantesJpaController control = new PostulantesJpaController();

        this.postulante.setNombre(txtNombreEdit.getText());
        this.postulante.setApellido(txtEditApellido.getText());
        this.postulante.setEdad(txtEditEdad.getText());
        this.postulante.setDni(txtEditDNI.getText());
        this.postulante.setMovilidad(txtEditMovilidad.getText());
        this.postulante.setNivelEducativo(txtEditNivelEducativo.getText());
        this.postulante.setSexo(boxEditSexo.getSelectedItem().toString());
        this.postulante.setPerfil(txtEditPerfil.getText());
        this.postulante.setCuil(txtEditCuil.getText());
        this.postulante.setDomicilio(txtEditDomicilio.getText());
        this.postulante.setTelfPrincipal(txtEditTelfPrincipal.getText());
        this.postulante.setTelfAlternativo(txtEditTelfAlternativo.getText());
        this.postulante.setEmail(txtEditEmail.getText());
        this.postulante.setDispHoraria(txtEditDispHoraria.getText());
        this.postulante.setOtraInfo(jTextEditArea1.getText());

        try {

            control.edit(this.postulante);

            JOptionPane.showMessageDialog(null, "Cambios Guardados");
        } catch (Exception ex) {
            Logger.getLogger(EditarPostulantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarDatosPostulante(Postulantes postulante) {
        txtIDEdit.setText(postulante.getIdPostulantes().toString());
        txtEditNombre.setText(postulante.getNombre());
        txtEditApellido.setText(postulante.getApellido());
        txtEditEdad.setText(postulante.getEdad());
        txtEditDNI.setText(postulante.getDni());
        txtEditMovilidad.setText(postulante.getMovilidad());
        txtEditNivelEducativo.setText(postulante.getNivelEducativo());
        boxEditSexo.setSelectedItem(postulante.getSexo());
        txtEditPerfil.setText(postulante.getPerfil());
        txtEditCuil.setText(postulante.getCuil());
        txtEditDomicilio.setText(postulante.getDomicilio());
        txtEditTelfPrincipal.setText(postulante.getTelfPrincipal());
        txtEditTelfAlternativo.setText(postulante.getTelfAlternativo());
        txtEditEmail.setText(postulante.getEmail());
        txtEditDispHoraria.setText(postulante.getDispHoraria());
        jTextEditArea1.setText(postulante.getOtraInfo());
    }
}
