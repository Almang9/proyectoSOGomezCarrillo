/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosogomez.carrillo;

/**
 *
 * @author Alman
 */
public class Window extends javax.swing.JFrame {
static Simulacion s;
public static volatile String x = "Test";
    /**
     * Creates new form Window
     */
    public Window(Simulacion s) {        
        initComponents();
        this.s = s;
        
    }
    public void setJoysticks(String qjoysticks){
    joysticks.setText(qjoysticks);
    }
    public void setTarjetasSD(String SD){
    tarjetasSD.setText(SD);
    }
    public void setBotones(String numBotones){
    botones.setText(numBotones);
    }
    public void setPantallasN(String pantallas){
    pantallasN.setText(pantallas);
    }
    public void setPantallasT(String pantallas){
    pantallasT.setText(pantallas);
    }
    public void setJefe(String estado){
    jefe.setText(estado);
    }
    public void setGerente(String estado){
    gerente.setText(estado);
    }
    public void setProductorB(String productores){
    productorBotones.setText(productores);
    }
    public void setProductorSD(String productores){
    productorSD.setText(productores);
    }
    public void setProductorPantallas(String productores){
    productorPantallas.setText(productores);
    }
    public void setProductorJoystick(String productores){
    productorJoystick.setText(productores);
    }
    public void setEnsambladores(String cantEnsambladores){
    ensambladores.setText(cantEnsambladores);
    }
    public void setDays(String cantDias){
    dias.setText(cantDias);
    }
    public void setConsolas(String cant){
        consolas.setText(cant);
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
        botones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joysticks = new javax.swing.JLabel();
        tarjetasSD = new javax.swing.JLabel();
        pantallasN = new javax.swing.JLabel();
        pantallasT = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dias = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jefe = new javax.swing.JLabel();
        jefe2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gerente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Start1 = new javax.swing.JButton();
        ensambladores = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ContratarB = new javax.swing.JButton();
        productorBotones = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        productorPantallas = new javax.swing.JLabel();
        contrararPpantallas = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        productorSD = new javax.swing.JLabel();
        contratarPSD = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        productorJoystick = new javax.swing.JLabel();
        contratarPJoystick = new javax.swing.JButton();
        DespedirB = new javax.swing.JButton();
        DespedirPPantalla = new javax.swing.JButton();
        DespedirPSD = new javax.swing.JButton();
        despedirJoystick = new javax.swing.JButton();
        Start10 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        consolas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botones.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel2.setText("Botones: ");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel3.setText("Almacen: ");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setText("JoySticks:");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setText("TarjetasSD:");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel6.setText("PantallasN:");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setText("PantallasT:");

        joysticks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        joysticks.setText("0");

        tarjetasSD.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tarjetasSD.setText("0");

        pantallasN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pantallasN.setText("0");

        pantallasT.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        pantallasT.setText("0");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setText("Estado del Jefe: ");

        dias.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        dias.setText("13");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel9.setText("DIAS PARA EL DESPLIEGUE: ");

        jefe.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jefe.setText("Durmiendo");

        jefe2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jefe2.setText("Días");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel10.setText("Estado del Gerente: ");

        gerente.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        gerente.setText("Durmiendo");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel11.setText("Nro de Ensambladores:");

        Start1.setText("Contratar");
        Start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start1ActionPerformed(evt);
            }
        });

        ensambladores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ensambladores.setText("0");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel12.setText("Nro de Productores de::");

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel13.setText("Botones:");

        ContratarB.setText("Contratar");
        ContratarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratarBActionPerformed(evt);
            }
        });

        productorBotones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        productorBotones.setText("0");

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel14.setText("Pantallas:");

        productorPantallas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        productorPantallas.setText("0");

        contrararPpantallas.setText("Contratar");
        contrararPpantallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrararPpantallasActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel15.setText("TarjetasSD:");

        productorSD.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        productorSD.setText("0");

        contratarPSD.setText("Contratar");
        contratarPSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarPSDActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel16.setText("Joysticks");

        productorJoystick.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        productorJoystick.setText("0");

        contratarPJoystick.setText("Contratar");
        contratarPJoystick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarPJoystickActionPerformed(evt);
            }
        });

        DespedirB.setText("Despedir");
        DespedirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirBActionPerformed(evt);
            }
        });

        DespedirPPantalla.setText("Despedir");
        DespedirPPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirPPantallaActionPerformed(evt);
            }
        });

        DespedirPSD.setText("Despedir");
        DespedirPSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirPSDActionPerformed(evt);
            }
        });

        despedirJoystick.setText("Despedir");
        despedirJoystick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despedirJoystickActionPerformed(evt);
            }
        });

        Start10.setText("Despedir");
        Start10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start10ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel17.setText("CONSOLAS PRODUCIDAS:");

        consolas.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        consolas.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 690, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pantallasT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pantallasN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tarjetasSD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(629, 629, 629)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(productorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(productorPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(productorSD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(productorJoystick, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(726, 726, 726)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(contratarPSD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DespedirPSD))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(contratarPJoystick)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(despedirJoystick))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(contrararPpantallas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DespedirPPantalla))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ContratarB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DespedirB))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jefe2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(joysticks, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(289, 289, 289)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ensambladores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Start1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Start10)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jefe)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gerente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(24, 24, 24)
                                        .addComponent(consolas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(gerente)
                    .addComponent(jLabel8)
                    .addComponent(jefe))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(ensambladores)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(botones))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(joysticks))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tarjetasSD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pantallasN)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Start1)
                            .addComponent(Start10))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(productorBotones)
                            .addComponent(ContratarB)
                            .addComponent(DespedirB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(productorPantallas)
                            .addComponent(contrararPpantallas)
                            .addComponent(DespedirPPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(productorSD)
                            .addComponent(contratarPSD)
                            .addComponent(DespedirPSD))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pantallasT)
                            .addComponent(jLabel16)
                            .addComponent(productorJoystick)
                            .addComponent(contratarPJoystick)
                            .addComponent(despedirJoystick))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(consolas))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dias)
                    .addComponent(jefe2))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void Start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start1ActionPerformed
        // TODO add your handling code here:
        s.contratarEnsamblador();
    }//GEN-LAST:event_Start1ActionPerformed

    private void ContratarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratarBActionPerformed
        s.contratarPBotones();
    }//GEN-LAST:event_ContratarBActionPerformed
       
    private void contrararPpantallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrararPpantallasActionPerformed
        s.contratarPPantalla();
    }//GEN-LAST:event_contrararPpantallasActionPerformed

    private void contratarPSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarPSDActionPerformed
        // TODO add your handling code here:
        s.contratarPSD();
    }//GEN-LAST:event_contratarPSDActionPerformed

    private void contratarPJoystickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarPJoystickActionPerformed
        // TODO add your handling code here:
        s.contratarPJoystick();
    }//GEN-LAST:event_contratarPJoystickActionPerformed

    private void DespedirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirBActionPerformed
        // TODO add your handling code here:
        s.despedirB();
    }//GEN-LAST:event_DespedirBActionPerformed

    private void DespedirPPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirPPantallaActionPerformed
        // TODO add your handling code here:
        s.despedirPantalla();
    }//GEN-LAST:event_DespedirPPantallaActionPerformed

    private void DespedirPSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirPSDActionPerformed
        // TODO add your handling code here:
        s.despedirSD();
    }//GEN-LAST:event_DespedirPSDActionPerformed

    private void despedirJoystickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despedirJoystickActionPerformed
        // TODO add your handling code here:
        s.despedirJoystick();
    }//GEN-LAST:event_despedirJoystickActionPerformed

    private void Start10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start10ActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContratarB;
    private javax.swing.JButton DespedirB;
    private javax.swing.JButton DespedirPPantalla;
    private javax.swing.JButton DespedirPSD;
    private javax.swing.JButton Start1;
    private javax.swing.JButton Start10;
    private javax.swing.JLabel botones;
    private javax.swing.JLabel consolas;
    private javax.swing.JButton contrararPpantallas;
    private javax.swing.JButton contratarPJoystick;
    private javax.swing.JButton contratarPSD;
    private javax.swing.JButton despedirJoystick;
    private javax.swing.JLabel dias;
    private javax.swing.JLabel ensambladores;
    private javax.swing.JLabel gerente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jefe;
    private javax.swing.JLabel jefe2;
    private javax.swing.JLabel joysticks;
    private javax.swing.JLabel pantallasN;
    private javax.swing.JLabel pantallasT;
    private javax.swing.JLabel productorBotones;
    private javax.swing.JLabel productorJoystick;
    private javax.swing.JLabel productorPantallas;
    private javax.swing.JLabel productorSD;
    private javax.swing.JLabel tarjetasSD;
    // End of variables declaration//GEN-END:variables
}
