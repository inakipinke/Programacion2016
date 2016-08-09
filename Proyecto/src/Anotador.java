
import javax.swing.JOptionPane;
/**
 *
 * @author franco
 */
public class Anotador extends javax.swing.JFrame {
       

    public Anotador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        namePlayer1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jAnotar = new javax.swing.JRadioButton();
        jErrores = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namePlayer1.setText("Pinke");

        jLabel6.setText("Miranda");

        buttonGroup1.add(jAnotar);
        jAnotar.setText("Anotar");
        jAnotar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAnotarMouseClicked(evt);
            }
        });
        jAnotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(namePlayer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jAnotar)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePlayer1)
                    .addComponent(jLabel6))
                .addGap(92, 92, 92)
                .addComponent(jAnotar)
                .addGap(120, 120, 120)
                .addComponent(jErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAnotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnotarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnotarActionPerformed

    private void jAnotarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAnotarMouseClicked
        int cantidad = 0;
        Jugador jugador = new Jugador();
        if (jAnotar.isSelected() == true) {
            
            Actualizar_marcador actualizar = new Actualizar_marcador();
            //Puntos.aumentar_puntos();
            //Puntos.puntos_jugados_ganados();
            actualizar.setVisible(true);
            
            this.setVisible(false);    
            
        }
    }//GEN-LAST:event_jAnotarMouseClicked

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
            java.util.logging.Logger.getLogger(Anotador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Anotador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jAnotar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jErrores;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JLabel namePlayer1;
    // End of variables declaration//GEN-END:variables

}
