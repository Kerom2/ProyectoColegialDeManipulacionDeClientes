package cot2_23_2;

import javax.swing.JOptionPane;
//importamos la clase control objetos clientes que está dentro del paquete control de objetos.
import ControlDeObjetos.ControlObjetos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Modificar_Clientes extends javax.swing.JFrame {
    //instanciamos la clase de fecha sistema

    Fecha_Sistema fe = new Fecha_Sistema();
    //instanciamos modelo datos 
    ModeloDatos md = new ModeloDatos();
    //instanciamos la clase control objetos clientes.
    ControlObjetos co = new ControlObjetos();
    //variable para guardar la fecha de nacimiento en una sola variable
        static String cum = "";

    public Modificar_Clientes() {
        initComponents();
        co.Bloquear_objetos_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo, modificar, buscar);
        desplegar_fecha();
        co.CargarComboDireccion(Combo_direccion);
    }

    //procedimiento que permite desplegar la fecha del sistema, llamando a la clase fecha sistema
    public void desplegar_fecha() {
        //imprime la fecha del sistema en el campo texto.
        regis.setText("" + fe.fecha());
    }
    
    

    //proceso que modifica los datos de un cliente
    public void modifica(java.awt.event.ActionEvent e) {
        //Aqui asigna a la variable direccion del elemento que 
            //seleccione el usuario en el combo
            cum = dia.getText() + "/" + mes.getText() + "/" + anio.getText();
            String cump = "", vdia="", vmes="", vanio="";
        if (id.getText().equals("")
                || nombre.getText().equals("")
                || dir.getText().equals("")
                || regis.getText().equals("")
                || dia.getText().equals("")
                || mes.getText().equals("") 
                || anio.getText().equals("") 
                || categoria.getText().equals("") 
                || tel_fijo.getText().equals("") 
                || tel_movil.getText().equals("") 
                || correo.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (md.modificar_clientes(id.getText(), nombre.getText(),
                    dir.getText(), regis.getText(),cum,
                    categoria.getText(), tel_fijo.getText(), tel_movil.getText(), 
                    correo.getText())){
                cum = md.getFechaCum(id.getText());
                
                int sec=0;
        
                for (int i=0; i<cum.length(); i++) {
                    if (sec == 0) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vdia += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 1) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vmes += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 2) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vanio += "" + cum.charAt(i);
                        }
                    }
                    dia.setText(vdia); mes.setText(vmes); anio.setText(vanio);
                    //System.out.println(cum.charAt(i)); //
                }
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente", "informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                JOptionPane.showMessageDialog(null, "Cliente no ha sido modificado", "advertencia", JOptionPane.WARNING_MESSAGE);
                co.Limpiar_Componentes_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo);
                co.Bloquear_objetos_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo, modificar, buscar);
            }
        }
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
        dir = new javax.swing.JTextField();
        regis = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        tel_fijo = new javax.swing.JTextField();
        tel_movil = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Combo_direccion = new javax.swing.JComboBox<>();
        modificar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Contactos");

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/Usuario.png"))); // NOI18N
        jLabel1.setText("Modificar Contactos");

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

        dir.setBackground(new java.awt.Color(204, 153, 255));
        dir.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

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
        jLabel14.setText("nueva dirección:");

        Combo_direccion.setBackground(new java.awt.Color(204, 51, 255));
        Combo_direccion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Combo_direccion.setForeground(new java.awt.Color(0, 0, 0));

        modificar.setBackground(new java.awt.Color(204, 51, 255));
        modificar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 0, 0));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IMAGENES/ajustes.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("identificación:");

        id.setBackground(new java.awt.Color(204, 153, 255));
        id.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addComponent(dir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regis))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Combo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(modificar))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(limpiar)
                                        .addGap(46, 46, 46)
                                        .addComponent(regresar)
                                        .addGap(33, 33, 33)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
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
                    .addComponent(jLabel14)
                    .addComponent(Combo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(modificar)
                    .addComponent(regresar))
                .addContainerGap(16, Short.MAX_VALUE))
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
        co.Limpiar_Componentes_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo);
        co.Bloquear_objetos_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo, modificar, buscar);
        desplegar_fecha();
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
        String cum = "", vdia="", vmes="", vanio="";
        //Aqui asigna a la variable direccion del elemento que 
        //seleccione el usuario en el combo
        cum = dia.getText() + "/" + mes.getText() + "/" + anio.getText();

        if (id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan datos", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            //aqui llama a la funcionbuscarid para buscarlo en la base de datos
            if (md.buscar_id(id.getText()) == 1) {
                JOptionPane.showMessageDialog(null, "cliente encontrado", "informacion", JOptionPane.INFORMATION_MESSAGE);
                //aqui llama al procedimiento mostrar datos especificando los campops txtos correspondientes de acuerdo al tipo de dato.
                md.mostrardatos(id.getText(), nombre, dir, regis, cum, categoria, tel_fijo, tel_movil, correo);
                
                cum = md.getFechaCum(id.getText());
                
                int sec=0;
        
                for (int i=0; i<cum.length(); i++) {
                    if (sec == 0) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vdia += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 1) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vmes += "" + cum.charAt(i);
                        }
                    }
                    if (sec == 2) {
                        if (cum.charAt(i) == '/') {
                            sec++;
                            i++;
                        }
                        else {
                            vanio += "" + cum.charAt(i);
                        }
                    }
                    dia.setText(vdia); mes.setText(vmes); anio.setText(vanio);
                    
                }
                
                co.Desbloquear_objetos_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo, modificar, buscar);
            } else {
                JOptionPane.showMessageDialog(null, "cliente no encontrado", "error", JOptionPane.WARNING_MESSAGE);
                co.Limpiar_Componentes_Modificar(id, nombre, dir, regis, dia, mes, anio, categoria, tel_fijo, tel_movil, correo);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed
//boton modificar
    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        modifica(evt);
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_direccion;
    private javax.swing.JTextField anio;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField correo;
    public javax.swing.JTextField dia;
    private javax.swing.JTextField dir;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField regis;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField tel_fijo;
    private javax.swing.JTextField tel_movil;
    // End of variables declaration//GEN-END:variables
}
