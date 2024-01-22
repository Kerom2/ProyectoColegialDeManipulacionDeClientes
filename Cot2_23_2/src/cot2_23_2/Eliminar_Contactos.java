package cot2_23_2;

//importamos la clase control objetos clientes que está dentro del paquete control de objetos.
import ControlDeObjetos.ControlObjetos;
import javax.swing.JOptionPane;

public class Eliminar_Contactos extends javax.swing.JFrame {

    Fecha_Sistema fe = new Fecha_Sistema();
    //instanciamos modelo datos 
    ModeloDatos md = new ModeloDatos();
    //instanciamos la clase control objetos clientes.
    ControlObjetos co = new ControlObjetos();
    //variable para guardar la fecha de nacimiento en una sola variable
    static String cum = "";

    public Eliminar_Contactos() {
        initComponents();
        co.Bloquear_objetos_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                categoria, tel_fijo, tel_movil, correo, eliminar, buscar);
    }

    //procedimiento que permite desplegar la fecha del sistema, llamando a la clase fecha sistema
    public void desplegar_fecha() {
        //imprime la fecha del sistema en el campo texto.
        regis.setText("" + fe.fecha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        regis = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        tel_fijo = new javax.swing.JTextField();
        tel_movil = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        dir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar contactos");

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/Usuario.png"))); // NOI18N
        jLabel1.setText("Eliminar Contactos");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("nombre:");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("dirección:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("fecha de registro:");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("cumpleaños");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("categoría de trabajo:");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("telefono fijo:");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("telefono movil:");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("correo:");

        nombre.setBackground(new java.awt.Color(204, 153, 255));
        nombre.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        regis.setBackground(new java.awt.Color(204, 153, 255));
        regis.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        dia.setBackground(new java.awt.Color(204, 153, 255));
        dia.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        categoria.setBackground(new java.awt.Color(204, 153, 255));
        categoria.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        tel_fijo.setBackground(new java.awt.Color(204, 153, 255));
        tel_fijo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        tel_movil.setBackground(new java.awt.Color(204, 153, 255));
        tel_movil.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        correo.setBackground(new java.awt.Color(204, 153, 255));
        correo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        buscar.setBackground(new java.awt.Color(204, 51, 255));
        buscar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/encontrar (1).png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(204, 51, 255));
        eliminar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 0));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/quitar-usuario.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(204, 51, 255));
        limpiar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/borrar.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(204, 51, 255));
        regresar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        regresar.setForeground(new java.awt.Color(0, 0, 0));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/login 2.png"))); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("día:");

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("mes:");

        mes.setBackground(new java.awt.Color(204, 153, 255));
        mes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("año:");

        anio.setBackground(new java.awt.Color(204, 153, 255));
        anio.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("identificación:");

        id.setBackground(new java.awt.Color(204, 153, 255));
        id.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        dir.setBackground(new java.awt.Color(204, 153, 255));
        dir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiar)
                                .addGap(59, 59, 59)
                                .addComponent(regresar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regis))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(correo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tel_fijo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tel_movil))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buscar))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tel_fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tel_movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(limpiar)
                    .addComponent(regresar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//BOTON LIMPIAR
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        //llamamos a limpiar componentes eliminar
        co.Limpiar_Componentes_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                categoria, tel_fijo, tel_movil, correo);
        co.Bloquear_objetos_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                categoria, tel_fijo, tel_movil, correo, eliminar, buscar);
        id.requestFocus();
    }//GEN-LAST:event_limpiarActionPerformed

    //BOTON REGRESAR
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // Boton Regresar
        Menu m = new Menu();
        this.hide();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed
//BOTON BUSCAR
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //variable para guardar la fecha de nacimiento en una sola variable
        String cum = "", vdia = "", vmes = "", vanio = "";

        if (id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            //aqui llama a la funcionbuscarid para buscarlo en la base de datos
            if (md.buscar_id(id.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "cliente encontrado", "informacion", JOptionPane.INFORMATION_MESSAGE);
                //aqui llama al procedimiento mostrar datos especificando los campops txtos correspondientes de acuerdo al tipo de dato.
                md.mostrardatos(id.getText(), nombre, dir, regis, cum, categoria, tel_fijo, tel_movil, correo);
                cum = md.getFechaCum(id.getText());

                int sec = 0;

                for (int i = 0; i < cum.length(); i++) {
                    if (sec == 0) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        } else {
                            vdia += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 1) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        } else {
                            vmes += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 2) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        } else {
                            vanio += "" + cum.charAt(i);
                        }
                    }
                    dia.setText(vdia);
                    mes.setText(vmes);
                    anio.setText(vanio);

                }

                co.Desbloquear_objetos_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                        categoria, tel_fijo, tel_movil, correo, eliminar, buscar);
            } else {

                JOptionPane.showMessageDialog(null, "cliente no encontrado", "error", JOptionPane.WARNING_MESSAGE);
                co.Limpiar_Componentes_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                        categoria, tel_fijo, tel_movil, correo);
            }
        }

    }//GEN-LAST:event_buscarActionPerformed
//BOTON ELIMINAR
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        elimina(evt);
    }//GEN-LAST:event_eliminarActionPerformed
//------------------------------------------------------------------------------

    public void elimina(java.awt.event.ActionEvent e) {
        if (JOptionPane.showConfirmDialog(null, "está segurx de eliminar cliente?") == JOptionPane.OK_OPTION) {
            if (md.Eliminarcliente(id.getText()) == true) {
                JOptionPane.showMessageDialog(null, "cliente eliminado correctamente", "advertencia", JOptionPane.WARNING_MESSAGE);
                co.Limpiar_Componentes_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                        categoria, tel_fijo, tel_movil, correo);
                co.Bloquear_objetos_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                        categoria, tel_fijo, tel_movil, correo, eliminar, buscar);
            }
        } else {
            JOptionPane.showInternalMessageDialog(null, "cliente no ha sido eliminado", "advertencia", JOptionPane.WARNING_MESSAGE);
            co.Limpiar_Componentes_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                    categoria, tel_fijo, tel_movil, correo);
            co.Bloquear_objetos_Eliminar(id, nombre, dir, regis, dia, mes, anio,
                    categoria, tel_fijo, tel_movil, correo, eliminar, buscar);
        }

    }
//------------------------------------------------------------------------------ 

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
            java.util.logging.Logger.getLogger(Eliminar_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField dir;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField regis;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tel_fijo;
    private javax.swing.JTextField tel_movil;
    // End of variables declaration//GEN-END:variables
}
