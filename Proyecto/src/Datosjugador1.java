/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franco
 */
public class Datosjugador1 extends javax.swing.JFrame {

    /**
     * Creates new form Datosjugador1
     */
    public Datosjugador1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboAño = new javax.swing.JComboBox<>();
        jComboMes = new javax.swing.JComboBox<>();
        jComboDía = new javax.swing.JComboBox<>();
        jTextPaís = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 30, 61, 17);

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 82, 60, 17);

        jLabel3.setText("País de Origen:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 238, 120, 17);

        jLabel4.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 290, 147, 17);

        jComboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));
        getContentPane().add(jComboAño);
        jComboAño.setBounds(171, 285, 69, 27);

        jComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboMes);
        jComboMes.setBounds(246, 285, 66, 27);

        jComboDía.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboDía.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDíaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboDía);
        jComboDía.setBounds(318, 285, 59, 27);
        getContentPane().add(jTextPaís);
        jTextPaís.setBounds(171, 233, 69, 27);
        getContentPane().add(jTextApellido);
        jTextApellido.setBounds(171, 77, 69, 27);
        getContentPane().add(jTextNombre);
        jTextNombre.setBounds(171, 25, 69, 27);

        jLabel5.setText("Altura:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 134, 46, 17);
        getContentPane().add(jTextAltura);
        jTextAltura.setBounds(171, 129, 69, 27);

        jLabel6.setText("Peso:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 186, 38, 17);
        getContentPane().add(jTextPeso);
        jTextPeso.setBounds(171, 181, 69, 27);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tenis.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-570, -500, 1400, 1040);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboDíaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDíaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDíaActionPerformed

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
            java.util.logging.Logger.getLogger(Datosjugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datosjugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datosjugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datosjugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datosjugador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboAño;
    private javax.swing.JComboBox<String> jComboDía;
    private javax.swing.JComboBox<String> jComboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPaís;
    private javax.swing.JTextField jTextPeso;
    // End of variables declaration//GEN-END:variables
}
