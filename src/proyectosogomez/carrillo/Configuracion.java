/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectosogomez.carrillo;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author Alman
 */
public class Configuracion extends javax.swing.JFrame {
 Inicio inicio;
 Archivo archivo = new Archivo();
    /**
     * Creates new form Configuración
     */
    public Configuracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        duracionDia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JTextField();
        almacenBotones = new javax.swing.JTextField();
        almacenSD = new javax.swing.JTextField();
        almacenJoystick = new javax.swing.JTextField();
        almacenPantallas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        productorBotonesI = new javax.swing.JTextField();
        productorSDI = new javax.swing.JTextField();
        productorJoystickI = new javax.swing.JTextField();
        productorPantallasI = new javax.swing.JTextField();
        ensambladoresI = new javax.swing.JTextField();
        productorBotonesF = new javax.swing.JTextField();
        productorJoystickF = new javax.swing.JTextField();
        productorPantallasF = new javax.swing.JTextField();
        ensambladoresF = new javax.swing.JTextField();
        productorSDF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        duracionDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionDiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel1.setText("Duracion de los días:");

        contador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contadorActionPerformed(evt);
            }
        });

        almacenBotones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenBotonesActionPerformed(evt);
            }
        });

        almacenSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenSDActionPerformed(evt);
            }
        });

        almacenJoystick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenJoystickActionPerformed(evt);
            }
        });

        almacenPantallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenPantallasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel8.setText("PERSONAL INCIAL:");

        productorBotonesI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorBotonesIActionPerformed(evt);
            }
        });

        productorSDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorSDIActionPerformed(evt);
            }
        });

        productorJoystickI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorJoystickIActionPerformed(evt);
            }
        });

        productorPantallasI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorPantallasIActionPerformed(evt);
            }
        });

        ensambladoresI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladoresIActionPerformed(evt);
            }
        });

        productorBotonesF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorBotonesFActionPerformed(evt);
            }
        });

        productorJoystickF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorJoystickFActionPerformed(evt);
            }
        });

        productorPantallasF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorPantallasFActionPerformed(evt);
            }
        });

        ensambladoresF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladoresFActionPerformed(evt);
            }
        });

        productorSDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorSDFActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 3, 18)); // NOI18N
        jButton1.setText("Guardar Configuración");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel20.setText("CAPACIDAD MÁXIMA DE PERSONAL:");

        jLabel21.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel21.setText("CAPACIDAD MÁXIMA DEL ALMACÉN:");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel3.setText("segundos");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel9.setText("Productor de  Pantallas:");

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel22.setText("Botones:");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel23.setText("Tarjetas SD:");

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel24.setText("Joysticks:");

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel25.setText("Pantallas:");

        jLabel26.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel26.setText("Productor de Botones:");

        jLabel27.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel27.setText("Productor de Tarjetas SD:");

        jLabel28.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel28.setText("Productor de  Joysticks:");

        jLabel29.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel29.setText("Días para el despacho:");

        jLabel30.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel30.setText("Ensambladores:");

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel31.setText("Ensambladores:");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel10.setText("Productor de  Pantallas:");

        jLabel32.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel32.setText("Productor de  Joysticks:");

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel33.setText("Productor de Tarjetas SD:");

        jLabel34.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel34.setText("Productor de Botones:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        jLabel4.setText("días");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(18, 18, 18)
                                        .addComponent(almacenBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(almacenSD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(almacenJoystick, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(almacenPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addGap(18, 18, 18)
                                            .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(27, 27, 27)
                                            .addComponent(duracionDia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27))))
                            .addComponent(jLabel28)
                            .addComponent(jLabel9)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productorSDI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productorSDF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productorPantallasI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productorPantallasF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productorJoystickI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productorJoystickF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(productorBotonesI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productorBotonesF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ensambladoresI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ensambladoresF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel20)
                                .addGap(9, 9, 9)))))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel20))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duracionDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(productorBotonesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productorBotonesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel26)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productorSDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productorSDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel33)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productorJoystickI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productorJoystickF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(productorPantallasI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productorPantallasF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ensambladoresI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ensambladoresF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(2, 2, 2)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacenBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacenSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacenJoystick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almacenPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cont = Integer.parseInt(contador.getText());
            int duracion = Integer.parseInt(duracionDia.getText());
            int capPantalla =Integer.parseInt(almacenPantallas.getText());
            int capJoystick=Integer.parseInt(almacenJoystick.getText());
            int capBotones=Integer.parseInt(almacenBotones.getText());
            int capSD=Integer.parseInt(almacenSD.getText());
            int prodBotonesI =Integer.parseInt(productorBotonesI.getText());
            int prodPantallaI = Integer.parseInt(productorPantallasI.getText());
            int prodSDI=Integer.parseInt(productorSDI.getText());
            int prodJoystickI = Integer.parseInt(productorJoystickI.getText());
            int prodBotonesF = Integer.parseInt(productorBotonesF.getText());
            int prodPantallaF= Integer.parseInt(productorPantallasF.getText());
            int prodSDF=Integer.parseInt(productorSDF.getText());
            int prodJoystickF= Integer.parseInt(productorJoystickF.getText());
            int ensambI = Integer.parseInt(ensambladoresI.getText());
            int ensambF = Integer.parseInt(ensambladoresF.getText());
            boolean acceptable = true;
            if(prodSDI> prodSDF || prodSDF<1 || prodSDF < 0 || prodSDI < 0 ){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Los limites de los productores de tarjetas SD no son aceptables");
            }
            if(prodJoystickI > prodJoystickF || prodJoystickF <0 || prodJoystickI <0){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Los limites de los productores de joysticks no son aceptables");
            }
            if(prodBotonesI > prodBotonesF || prodBotonesF <0 || prodBotonesI <0){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Los limites de los productores de botones no son aceptables");
            }
            if(prodPantallaI > prodPantallaF || prodPantallaF <0 || prodPantallaI <0){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Los limites de los productores de pantallas no son aceptables");
            }
            if(capJoystick < 2 || capBotones < 6 || capSD < 1 || capPantalla < 2){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Capacidad de almacenamiento inválida, se debe poder almacernar lo suficiente como para poder ensamblar una consola");
            }
            if(duracion <= 0){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Duración del día niválida, no puede ser negativo o nulo");
            }
            if(cont <= 0){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Cantidad de días inválida, no puede ser negativo o nulo");
            }
            if(ensambF < ensambI){
                acceptable = false;
                JOptionPane.showMessageDialog(null, "Los limites de los ensambladores no son aceptables");
            }
            if (acceptable){
                String contadortext = contador.getText();
                String duracionDiatext = duracionDia.getText();
                String almacenBotonestext = almacenBotones.getText();
                String almacenPantallastext = almacenPantallas.getText();
                String almacenJoysticktext = almacenJoystick.getText();
                String almacenSDtext = almacenSD.getText();
                String productorBotonesItext =productorBotonesI.getText();
                String productorBotonesFtext = productorBotonesF.getText();
                String productorPantallasItext = productorPantallasI.getText();
                String productorPantallasFtext = productorPantallasF.getText();
                String productorJoystickItext = productorJoystickI.getText();
                String productorJoystickFtext = productorJoystickF.getText();
                String productorSDItext = productorSDI.getText();
                String productorSDFtext = productorSDF.getText();
                String ensambladoresItext = ensambladoresI.getText();
                String ensambladoresFtext = ensambladoresF.getText();
                archivo.saveDatafile(duracionDiatext,
                    contadortext,
                    almacenBotonestext,
                    almacenPantallastext,
                    almacenJoysticktext,
                    almacenSDtext,
                    productorBotonesItext,
                    productorBotonesFtext,
                    productorPantallasItext,
                    productorPantallasFtext,
                    productorJoystickItext,
                    productorJoystickFtext,
                    productorSDItext,
                    productorSDFtext,
                    ensambladoresItext,
                    ensambladoresFtext
                );
            }

        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor, solo introducir números enteros en cada uno de los campos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productorSDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorSDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorSDFActionPerformed

    private void ensambladoresFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladoresFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ensambladoresFActionPerformed

    private void productorPantallasFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorPantallasFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorPantallasFActionPerformed

    private void productorJoystickFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorJoystickFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorJoystickFActionPerformed

    private void productorBotonesFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorBotonesFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorBotonesFActionPerformed

    private void ensambladoresIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladoresIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ensambladoresIActionPerformed

    private void productorPantallasIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorPantallasIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorPantallasIActionPerformed

    private void productorJoystickIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorJoystickIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorJoystickIActionPerformed

    private void productorSDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorSDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorSDIActionPerformed

    private void productorBotonesIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorBotonesIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productorBotonesIActionPerformed

    private void almacenPantallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenPantallasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenPantallasActionPerformed

    private void almacenJoystickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenJoystickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenJoystickActionPerformed

    private void almacenSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenSDActionPerformed

    private void almacenBotonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenBotonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenBotonesActionPerformed

    private void contadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contadorActionPerformed

    private void duracionDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionDiaActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacenBotones;
    private javax.swing.JTextField almacenJoystick;
    private javax.swing.JTextField almacenPantallas;
    private javax.swing.JTextField almacenSD;
    private javax.swing.JTextField contador;
    private javax.swing.JTextField duracionDia;
    private javax.swing.JTextField ensambladoresF;
    private javax.swing.JTextField ensambladoresI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField productorBotonesF;
    private javax.swing.JTextField productorBotonesI;
    private javax.swing.JTextField productorJoystickF;
    private javax.swing.JTextField productorJoystickI;
    private javax.swing.JTextField productorPantallasF;
    private javax.swing.JTextField productorPantallasI;
    private javax.swing.JTextField productorSDF;
    private javax.swing.JTextField productorSDI;
    // End of variables declaration//GEN-END:variables
}
