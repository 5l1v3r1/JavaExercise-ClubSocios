package ClubSocios;
import static java.lang.Integer.parseInt;
public class Club_social extends javax.swing.JFrame {
        Socio c;
    void limpiar (){
        txt_cliente.setText("");
        txt_edad.setText("");
        limpiar_area();
        txt_precio.setText("");
        cb_categoria.setSelectedIndex(0);  
    }
    void limpiar_area(){
        Info.setText("");
    }
    public Club_social() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Info = new javax.swing.JTextArea();
        cb_categoria = new javax.swing.JComboBox();
        txt_cliente = new javax.swing.JTextField();
        txt_pago = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_vendido = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Club: El bosque - Chosica");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_generar.setText("Generar Resultado");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        Info.setColumns(20);
        Info.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Info.setRows(5);
        jScrollPane1.setViewportView(Info);

        cb_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        cb_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoría"));

        txt_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre de Cliente"));

        txt_pago.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago Mensual"));

        txt_edad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        txt_vendido.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad de Boletos vendidos"));

        txt_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio de Boleto"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_generar)
                        .addGap(211, 211, 211)
                        .addComponent(btn_limpiar)
                        .addGap(11, 11, 11)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txt_vendido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_precio)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_generar)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_salir))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        
        //obteniendo datos
        String cliente = txt_cliente.getText();
        int precio = Integer.parseInt(txt_precio.getText());
        int edad = Integer.parseInt(txt_edad.getText());
        int vendido = Integer.parseInt(txt_vendido.getText());
        String categoria = cb_categoria.getSelectedItem().toString();
        
       c = new Socio (cliente, categoria, vendido, edad, precio);
        // Generar rinformación
       
       limpiar_area();
       Info.append("Club - Sistema de Boletas\n\n");
       Info.append("Hola: "+c.cliente+"\n");
       Info.append("Su edad es                      : "+c.edad+"\n");
       Info.append("Categoría de Socio              : "+c.categoria+"\n");
       Info.append("Cantidad de Boletos a vender    : "+c.cantidad_boletos()+"\n");
       Info.append("Cantidad de Boletos Vendidos    : "+c.vendido+"\n");
       Info.append("Precio de Boletos               : "+c.precio+" Soles \n");
       Info.append("Descuento por edad              : "+c.descuento()+"%\n");
       Info.append("Descuento por vender de más     : "+c.descuento_vendido()+" Soles\n");
       Info.append("Monto Total a Pagar             : "+c.total()+" Soles\n");
       Info.append("Monto con descuento             : "+c.total_descuento()+" Soles\n");
       
       
       
       
        
        
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Club_social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Club_social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Club_social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Club_social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Club_social().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Info;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cb_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_pago;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_vendido;
    // End of variables declaration//GEN-END:variables
}
