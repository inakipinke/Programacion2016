public class Deuce extends javax.swing.JFrame {
    
    static int ventaja_jug1 = 0;
    static int ventaja_jug2 = 0;
    
    static int cant_deuces = 0;
    
    public Deuce() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPunto_Jugador1 = new javax.swing.JRadioButton();
        jPunto_jugador2 = new javax.swing.JRadioButton();
        nombre = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        jDeuce = new javax.swing.JLabel();
        jDueceN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 22, 22));

        buttonGroup1.add(jPunto_Jugador1);
        jPunto_Jugador1.setText("Punto Jugador 1");
        jPunto_Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPunto_Jugador1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jPunto_jugador2);
        jPunto_jugador2.setText("Punto Jugador 2");
        jPunto_jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPunto_jugador2MouseClicked(evt);
            }
        });

        nombre.setText("Miranda");

        nombre2.setText("Eknip");

        jDeuce.setFont(new java.awt.Font("Ubuntu Medium", 0, 24)); // NOI18N
        jDeuce.setText("40                        -                        15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jDueceN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(nombre2)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPunto_Jugador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPunto_jugador2)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDeuce)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(nombre2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDueceN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPunto_Jugador1)
                    .addComponent(jPunto_jugador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jDeuce)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPunto_Jugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPunto_Jugador1MouseClicked
        /*
        if (Deuce.ventaja_jug2 == 0 && ventaja_jug1 == 0){
            Deuce.ventaja_jug1 = 1;
            jDeuce.setText("Ventaja Para Jugador 1");
            jPunto_Jugador1.setSelected(false);
            return;
        }
        if (ventaja_jug1 == 1 && ventaja_jug2 == 0){
            jDeuce.setText("Game Para El Jugador 1");
            System.out.println("GANA EL GAME EL JUGADOR 1");
            Puntos.puntos = 0;
            Puntos.puntos = 0;
            Puntos.games = Puntos.games + 1;
            Marcador.jPuntos1.setText(Puntos.puntos + "");
            Marcador.jPuntos2.setText(Puntos.puntos + "");
            Marcador.jGames1.setText(Puntos.games + "");
            this.setVisible(false);
            
        }else if (Deuce.ventaja_jug2 == 1 && Deuce.ventaja_jug1 == 0){
            Deuce.ventaja_jug2 = 0;
            Deuce.ventaja_jug1 = 0;
            jDeuce.setText("IGUALES");
            cant_deuces = cant_deuces + 1;
            jDueceN.setText(cant_deuces + "");
            jPunto_Jugador1.setSelected(false);
        }
        */
    }//GEN-LAST:event_jPunto_Jugador1MouseClicked

    private void jPunto_jugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPunto_jugador2MouseClicked
        /*
        if (Deuce.ventaja_jug1 == 0 && ventaja_jug2 == 0){
            Deuce.ventaja_jug2 = 1;
            jDeuce.setText("Ventaja Para Jugador 2");
            return;
            
        }else if (Deuce.ventaja_jug1 == 1 && Deuce.ventaja_jug2 == 0){
            Deuce.ventaja_jug2 = 0;
            Deuce.ventaja_jug1 = 0;
            jDeuce.setText("IGUALES");
            cant_deuces = cant_deuces + 1;
            jDueceN.setText(cant_deuces + "");
            return;
        } 
        if (ventaja_jug2 == 1 && ventaja_jug1 == 0){
            jDeuce.setText("Game Para El Jugador 2");
            Puntos.games = Puntos.games + 1;
            Marcador.jPuntos1.setText(Puntos.puntos + "");
            Marcador.jPuntos2.setText(Puntos.puntos + "");
            Marcador.jGames2.setText(Puntos.games + "");
            System.out.println("GANA EL GAME EL JUGADOR 2");
            Puntos.puntos = 0;
            Puntos.puntos = 0;           
            this.setVisible(false);
        }
        */
    }//GEN-LAST:event_jPunto_jugador2MouseClicked
   
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deuce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Deuce().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jDeuce;
    private javax.swing.JLabel jDueceN;
    private javax.swing.JRadioButton jPunto_Jugador1;
    private javax.swing.JRadioButton jPunto_jugador2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    // End of variables declaration//GEN-END:variables
}
