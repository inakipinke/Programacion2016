public class Datosjugador2 extends javax.swing.JFrame {

    private Object partido;
    
    int num_jug;
    
    
        
    public Datosjugador2() {
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
        jComboDia = new javax.swing.JComboBox<>();
        jNacionalidad = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPeso = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 1, 1));
        jLabel1.setText("Nombre:");

        jLabel2.setBackground(new java.awt.Color(1, 1, 1));
        jLabel2.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Apellido:");

        jLabel3.setBackground(new java.awt.Color(1, 1, 1));
        jLabel3.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Nacionalidad:");

        jLabel4.setBackground(new java.awt.Color(1, 1, 1));
        jLabel4.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("Fecha de nacimiento:");

        jComboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));

        jComboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDiaActionPerformed(evt);
            }
        });

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(1, 1, 1));
        jLabel5.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Altura:");

        jLabel6.setBackground(new java.awt.Color(1, 1, 1));
        jLabel6.setFont(new java.awt.Font("Ubuntu Medium", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("Peso:");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });

        jbtnContinuar.setText("jButton1");
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbtnContinuar)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel1)
                                                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jLabel2))
                                                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel5))
                                            .addComponent(jAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel6))
                                    .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3))
                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jbtnContinuar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDiaActionPerformed

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        String errores = "";
        int puntos = 0;
        int sets = 0;
        int games = 0;
        int año_de_nacimiento = 0;
        int mes_de_nacimiento = 0;
        int día_de_nacimiento = 0;
        float altura = 0;
        float peso = 0;
        String nombre;
        String apellido;
        String nacionalidad;
                  
        //AÑO DE NACIMIENTO
        
        if (jComboAño.getSelectedIndex() == 0){
            System.out.println("Esta no es una opción válida");
            
        }
        
        if (jComboAño.getSelectedIndex() == 1){
             año_de_nacimiento = año_de_nacimiento + 2016;
            
        }
        
        if (jComboAño.getSelectedIndex() == 2){
             año_de_nacimiento = 2015;
            
        }
        
        if (jComboAño.getSelectedIndex() == 3){
             año_de_nacimiento = 2014;
            
        }
        
        if (jComboAño.getSelectedIndex() == 4){
             año_de_nacimiento = 2013;
            
        }
        
        if (jComboAño.getSelectedIndex() == 5){
             año_de_nacimiento = 2012;
            
        }
        
        if (jComboAño.getSelectedIndex() == 6){
             año_de_nacimiento = 2011;
            
        }
        
        if (jComboAño.getSelectedIndex() == 7){
             año_de_nacimiento = 2010;
            
        }
        
        if (jComboAño.getSelectedIndex() == 8){
             año_de_nacimiento = 2009;
            
        }
        
        if (jComboAño.getSelectedIndex() == 9){
             año_de_nacimiento = 2008;
            
        }
        
        if (jComboAño.getSelectedIndex() == 10){
             año_de_nacimiento = 2007;
            
        }
        
        if (jComboAño.getSelectedIndex() == 11){
             año_de_nacimiento = 2006;
            
        }
        
        if (jComboAño.getSelectedIndex() == 12){
             año_de_nacimiento = 2005;
            
        }
        
        if (jComboAño.getSelectedIndex() == 13){
             año_de_nacimiento = 2004;
            
        }
        
        if (jComboAño.getSelectedIndex() == 14){
             año_de_nacimiento = 2003;
            
        }
        
        if (jComboAño.getSelectedIndex() == 15){
             año_de_nacimiento = 2002;
            
        }
        
        if (jComboAño.getSelectedIndex() == 16){
             año_de_nacimiento = 2001;
            
        }
        
        if (jComboAño.getSelectedIndex() == 17){
             año_de_nacimiento = 2000;
            
        }
        
        if (jComboAño.getSelectedIndex() == 18){
             año_de_nacimiento = 1999;
            
        }
        
        if (jComboAño.getSelectedIndex() == 19){
             año_de_nacimiento = 1998;
            
        }
        
        if (jComboAño.getSelectedIndex() == 20){
             año_de_nacimiento = 1997;
            
        }
        if (jComboAño.getSelectedIndex() == 21){
             año_de_nacimiento = 1996;
            
        }
        if (jComboAño.getSelectedIndex() == 22){
             año_de_nacimiento = 1995;
            
        }
        if (jComboAño.getSelectedIndex() == 23){
             año_de_nacimiento = 1994;
            
        }
        if (jComboAño.getSelectedIndex() == 24){
             año_de_nacimiento = 1993;
            
        }
        if (jComboAño.getSelectedIndex() == 25){
             año_de_nacimiento = 1992;
            
        }
        if (jComboAño.getSelectedIndex() == 26){
             año_de_nacimiento = 1991;
            
        }
        if (jComboAño.getSelectedIndex() == 27){
             año_de_nacimiento = 1990;
            
        }
        if (jComboAño.getSelectedIndex() == 28){
             año_de_nacimiento = 1989;
            
        }
        if (jComboAño.getSelectedIndex() == 29){
            año_de_nacimiento = 1988; 
        }
        if (jComboAño.getSelectedIndex() == 30){
             año_de_nacimiento = 1987;
        }
        if (jComboAño.getSelectedIndex() == 31){
             año_de_nacimiento = 1986;
        }
        if (jComboAño.getSelectedIndex() == 32){
             año_de_nacimiento = 1985;
        }
        if (jComboAño.getSelectedIndex() == 33){
             año_de_nacimiento = 1984;
        }
        if (jComboAño.getSelectedIndex() == 34){
             año_de_nacimiento = 1983;
        }
        if (jComboAño.getSelectedIndex() == 35){
             año_de_nacimiento = 1982;
        }if (jComboAño.getSelectedIndex() == 36){
             año_de_nacimiento = 1981;
        }if (jComboAño.getSelectedIndex() == 37){
             año_de_nacimiento = 1980;
        }
        if (jComboAño.getSelectedIndex() == 38){
             año_de_nacimiento = 1979;
        }
        if (jComboAño.getSelectedIndex() == 39){
             año_de_nacimiento = 1978;
        }
        if (jComboAño.getSelectedIndex() == 40){
             año_de_nacimiento = 1977;
        }
        if (jComboAño.getSelectedIndex() == 41){
             año_de_nacimiento = 1976;
        }
        if (jComboAño.getSelectedIndex() == 42){
             año_de_nacimiento = 1975;
        }
        if (jComboAño.getSelectedIndex() == 43){
             año_de_nacimiento = 1974;
        }
        if (jComboAño.getSelectedIndex() == 44){
             año_de_nacimiento = 1973;
        }
        if (jComboAño.getSelectedIndex() == 45){
             año_de_nacimiento = 1972;
        }
        if (jComboAño.getSelectedIndex() == 46){
            año_de_nacimiento = 1971;
        }
        if (jComboAño.getSelectedIndex() == 47){
             año_de_nacimiento = 1970;
        }
        if (jComboAño.getSelectedIndex() == 48){
             año_de_nacimiento = 1969;
        }
        if (jComboAño.getSelectedIndex() == 49){
             año_de_nacimiento = 1968;
        }
        if (jComboAño.getSelectedIndex() == 50){
             año_de_nacimiento = 1967; 
        }
        if (jComboAño.getSelectedIndex() == 51){
             año_de_nacimiento = 1966;
        }
        if (jComboAño.getSelectedIndex() == 52){
             año_de_nacimiento = 1965;
        }
        if (jComboAño.getSelectedIndex() == 53){
             año_de_nacimiento = 1964;
        }
        if (jComboAño.getSelectedIndex() == 54){
             año_de_nacimiento = 1963;
        }
        if (jComboAño.getSelectedIndex() == 55){
             año_de_nacimiento = 1962;
        }
        if (jComboAño.getSelectedIndex() == 56){
            año_de_nacimiento = 1961;
        }if (jComboAño.getSelectedIndex() == 57){
             año_de_nacimiento = 1960;
        }
        if (jComboAño.getSelectedIndex() == 58){
             año_de_nacimiento = 1959;
        }
        if (jComboAño.getSelectedIndex() == 59){
             año_de_nacimiento = 1958;
        }
        if (jComboAño.getSelectedIndex() == 60){
             año_de_nacimiento = 1957;
        }
        if (jComboAño.getSelectedIndex() == 61){
             año_de_nacimiento = 1956;
            
        }
        if (jComboAño.getSelectedIndex() == 62){
             año_de_nacimiento = 1955;
        }
        if (jComboAño.getSelectedIndex() == 63){
             año_de_nacimiento = 1954;
        }
        if (jComboAño.getSelectedIndex() == 64){
             año_de_nacimiento = 1953;
            
        }
        if (jComboAño.getSelectedIndex() == 65){
             año_de_nacimiento = 1952;
        }
        if (jComboAño.getSelectedIndex() == 66){
             año_de_nacimiento = 1951;
        }
        if (jComboAño.getSelectedIndex() == 67){
             año_de_nacimiento = 1950;
            
        }
        
        // MES DE NACIMIENTO
        
        
        
        if (jComboMes.getSelectedIndex() == 0){
            System.out.println("OPCION NO VALIDA");
        }
        if (jComboMes.getSelectedIndex() == 1){
            mes_de_nacimiento = 1;
        }
        if (jComboMes.getSelectedIndex() == 2){
            mes_de_nacimiento = 2;
        }
        if (jComboMes.getSelectedIndex() == 3){
            mes_de_nacimiento = 3;
        }
        if (jComboMes.getSelectedIndex() == 4){
            mes_de_nacimiento = 4;
        }
        if (jComboMes.getSelectedIndex() == 5){
            mes_de_nacimiento = 5;
        }
        if (jComboMes.getSelectedIndex() == 6){
            mes_de_nacimiento = 6;
        }
        if (jComboMes.getSelectedIndex() == 7){
            mes_de_nacimiento = 7;
        }
        if (jComboMes.getSelectedIndex() == 8){
            mes_de_nacimiento = 8;
        }
        if (jComboMes.getSelectedIndex() == 9){
            mes_de_nacimiento = 9;
        }
        if (jComboMes.getSelectedIndex() == 10){
            mes_de_nacimiento = 10;
        }
        if (jComboMes.getSelectedIndex() == 11){
            mes_de_nacimiento = 11;
        }
        if (jComboMes.getSelectedIndex() == 12){
            mes_de_nacimiento = 12;
        }
        
        //DÍA DE NACIMINETO
        
        
        
        if (jComboDia.getSelectedIndex() == 0){
            System.out.println("Esta no es una opción válida");
            
        }
        
        if (jComboDia.getSelectedIndex() == 1){
             día_de_nacimiento = 1;
            
        }
        
        if (jComboDia.getSelectedIndex() == 2){
             día_de_nacimiento = 2;
            
        }
        
        if (jComboDia.getSelectedIndex() == 3){
             día_de_nacimiento = 3;
            
        }
        
        if (jComboDia.getSelectedIndex() == 4){
             día_de_nacimiento = 4;
            
        }
        
        if (jComboDia.getSelectedIndex() == 5){
             día_de_nacimiento = 5;
            
        }
        
        if (jComboDia.getSelectedIndex() == 6){
             día_de_nacimiento = 6;
            
        }
        
        if (jComboDia.getSelectedIndex() == 7){
             día_de_nacimiento = 7;
            
        }
        
        if (jComboDia.getSelectedIndex() == 8){
             día_de_nacimiento = 8;
            
        }
        
        if (jComboDia.getSelectedIndex() == 9){
             día_de_nacimiento = 9;
            
        }
        
        if (jComboDia.getSelectedIndex() == 10){
             día_de_nacimiento = 10;
            
        }
        
        if (jComboDia.getSelectedIndex() == 11){
             día_de_nacimiento = 11;
            
        }
        
        if (jComboDia.getSelectedIndex() == 12){
             día_de_nacimiento = 12;
            
        }
        
        if (jComboDia.getSelectedIndex() == 13){
             día_de_nacimiento = 13;
            
        }
        
        if (jComboDia.getSelectedIndex() == 14){
             día_de_nacimiento = 14;
            
        }
        
        if (jComboDia.getSelectedIndex() == 15){
             día_de_nacimiento = 15;
            
        }
        
        if (jComboDia.getSelectedIndex() == 16){
             día_de_nacimiento = 16;
            
        }
        
        if (jComboDia.getSelectedIndex() == 17){
             día_de_nacimiento = 17;
            
        }
        
        if (jComboDia.getSelectedIndex() == 18){
             día_de_nacimiento = 18;            
        }
        
        if (jComboDia.getSelectedIndex() == 19){
             día_de_nacimiento = 19;
            
        }
        
        if (jComboDia.getSelectedIndex() == 20){
             día_de_nacimiento = 20;
            
        }
        if (jComboDia.getSelectedIndex() == 21){
             día_de_nacimiento = 21;
            
        }
        if (jComboDia.getSelectedIndex() == 22){
             día_de_nacimiento = 22;
            
        }
        if (jComboDia.getSelectedIndex() == 23){
             día_de_nacimiento = 23;
            
        }
        if (jComboDia.getSelectedIndex() == 24){
             día_de_nacimiento = 24;
            
        }
        if (jComboDia.getSelectedIndex() == 25){
             día_de_nacimiento = 25;
            
        }
        if (jComboDia.getSelectedIndex() == 26){
             día_de_nacimiento = 26;
            
        }
        if (jComboDia.getSelectedIndex() == 27){
             día_de_nacimiento = 27;
            
        }
        if (jComboDia.getSelectedIndex() == 28){
             día_de_nacimiento = 28;
            
        }
        if (jComboDia.getSelectedIndex() == 29){
            día_de_nacimiento = 29; 
        }
        if (jComboDia.getSelectedIndex() == 30){
             día_de_nacimiento = 30;
        }
        if (jComboDia.getSelectedIndex() == 31){
             día_de_nacimiento = 31;
        }
        
        Partido partido = new Partido();
        
        
        
        try {
            altura = Integer.parseInt(Datosjugador2.jAltura.getText());
        } catch (Exception ex) {
            errores += "Altura debe ser un número.\n";
        }
        
        try {
            peso = Integer.parseInt(Datosjugador2.jPeso.getText());
        } catch (Exception ex) {
            errores += "Peso debe ser un número\n";
        }
        
        nombre = Datosjugador2.jNombre.getText();
        if (nombre.length()==0){
            errores += "Debe ingresar un nombre\n";
        }
        apellido = Datosjugador2.jApellido.getText();
        if (apellido.length()==0){
            errores += "Debe ingresar un apellido\n";
        }
        nacionalidad = Datosjugador2.jNacionalidad.getText();
        if (nacionalidad.length()==0){
            errores += "Debe ingresar un apellido\n";
        }
                   System.out.println("ERROR !!!");

        
        Jugador jugador = new Jugador();
        
        jugador.setNombre(nombre);
        jugador.setApellido(apellido);
        jugador.setAltura(altura);
        jugador.setPeso(peso);
        jugador.setDía_de_nacimiento(día_de_nacimiento);
        jugador.setMes_de_nacimiento(mes_de_nacimiento);
        jugador.setAño_de_nacimiento(año_de_nacimiento);
        
        

        System.out.println("ERROR !!!");
        
               
        if (errores.length()>0){
            System.out.println("ERROR !!!!");
        }else{
            if (partido.addPersona(jugador)){
                        System.out.println("Persona cargada con éxito");
                }else{
                        System.out.println("Ya no se pueden cargar mas personas");
                    }     
        
    
        jNombre.setText("");
        jApellido.setText("");
        jNacionalidad.setText("");
        jAltura.setText("");
        jPeso.setText("");

        
        /*
        this.setVisible(false);
        Caracteristica_partido caracteristicas = new Caracteristica_partido();
        caracteristicas.setVisible(true);
        */
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    }
    private void jbtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinuarActionPerformed
        /*
        Partido partido = new Partido();
        String nombre = "asdf";
        Jugador jugador = new Jugador();
        jugador = partido.findByNombre(nombre);
        if (jugador != null){
            System.out.println("La persona " + nombre +" existe ");
        }else{
             System.out.println("Ese numero no se encuentra en el sistema");
        }
        */
        this.setVisible(false);
        Caracteristica_partido caracteristicas = new Caracteristica_partido();
        caracteristicas.setVisible(true);
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Datosjugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datosjugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datosjugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datosjugador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datosjugador2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField jAltura;
    public static javax.swing.JTextField jApellido;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboAño;
    private javax.swing.JComboBox<String> jComboDia;
    private javax.swing.JComboBox<String> jComboMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField jNacionalidad;
    public static javax.swing.JTextField jNombre;
    public static javax.swing.JTextField jPeso;
    private javax.swing.JButton jbtnContinuar;
    // End of variables declaration//GEN-END:variables

}