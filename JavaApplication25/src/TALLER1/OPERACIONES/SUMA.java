package TALLER1.OPERACIONES;

import javax.swing.table.DefaultTableModel;

public class SUMA extends javax.swing.JFrame {

     Operaciones operaciones = new Operaciones();
    
    public SUMA() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MATRIZ_A = new javax.swing.JTable();
        AUMENTAFILASA = new javax.swing.JButton();
        REDUCEFILASA = new javax.swing.JButton();
        AUMENTACOLUMNASA = new javax.swing.JButton();
        REDUCECOLUMNASA = new javax.swing.JButton();
        LIMPIARA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MATRIZ_B = new javax.swing.JTable();
        AUMENTAFILASB = new javax.swing.JButton();
        REDUCEFILASB = new javax.swing.JButton();
        AUMENTACOLUMNASB = new javax.swing.JButton();
        REDUCECOLUMNASB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LIMPIARB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTable();
        Calcular = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("# DE FILAS :");

        jLabel3.setText("# DE COLUMNAS :");

        MATRIZ_A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(MATRIZ_A);

        AUMENTAFILASA.setText("+");
        AUMENTAFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTAFILASAActionPerformed(evt);
            }
        });

        REDUCEFILASA.setText("-");
        REDUCEFILASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCEFILASAActionPerformed(evt);
            }
        });

        AUMENTACOLUMNASA.setText("+");
        AUMENTACOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTACOLUMNASAActionPerformed(evt);
            }
        });

        REDUCECOLUMNASA.setText("-");
        REDUCECOLUMNASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCECOLUMNASAActionPerformed(evt);
            }
        });

        LIMPIARA.setText("LIMPIAR");
        LIMPIARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARAActionPerformed(evt);
            }
        });

        jLabel4.setText("MATRIZ A");

        jLabel5.setText("# DE COLUMNAS :");

        jLabel6.setText("MATRIZ B");

        MATRIZ_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane2.setViewportView(MATRIZ_B);

        AUMENTAFILASB.setText("+");
        AUMENTAFILASB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTAFILASBActionPerformed(evt);
            }
        });

        REDUCEFILASB.setText("-");
        REDUCEFILASB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCEFILASBActionPerformed(evt);
            }
        });

        AUMENTACOLUMNASB.setText("+");
        AUMENTACOLUMNASB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUMENTACOLUMNASBActionPerformed(evt);
            }
        });

        REDUCECOLUMNASB.setText("-");
        REDUCECOLUMNASB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDUCECOLUMNASBActionPerformed(evt);
            }
        });

        jLabel7.setText("# DE FILAS :");

        LIMPIARB.setText("LIMPIAR");
        LIMPIARB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARBActionPerformed(evt);
            }
        });

        jLabel8.setText("SUMA DE MATRICES");

        Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(Resultado);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LIMPIARA)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AUMENTAFILASA)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(REDUCEFILASA))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AUMENTACOLUMNASA)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(REDUCECOLUMNASA))))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LIMPIARB)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(AUMENTAFILASB)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(REDUCEFILASB))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(AUMENTACOLUMNASB)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(REDUCECOLUMNASB))))))
                                .addGap(222, 222, 222)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel8)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUMENTAFILASA)
                            .addComponent(REDUCEFILASA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AUMENTACOLUMNASA)
                            .addComponent(REDUCECOLUMNASA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LIMPIARA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AUMENTAFILASB)
                                    .addComponent(REDUCEFILASB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AUMENTACOLUMNASB)
                                    .addComponent(REDUCECOLUMNASB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LIMPIARB))
                            .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AUMENTAFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTAFILASAActionPerformed
String [] Fila= new String[MATRIZ_A.getColumnCount()-1];
        DefaultTableModel matriz = (DefaultTableModel) MATRIZ_A.getModel();
        matriz.addRow(Fila);
        InsertarMatriz();        
    }//GEN-LAST:event_AUMENTAFILASAActionPerformed

    private void REDUCEFILASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCEFILASAActionPerformed
      DefaultTableModel matriz = (DefaultTableModel) MATRIZ_A.getModel();
      if(MATRIZ_A.getRowCount()>1){
            matriz.removeRow(MATRIZ_A.getRowCount()-1);
            InsertarMatriz();
      }
      else{
            
        }
    }//GEN-LAST:event_REDUCEFILASAActionPerformed

    private void AUMENTACOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTACOLUMNASAActionPerformed
        String [] Columnas = new String[MATRIZ_A.getRowCount()];
        DefaultTableModel matriz = (DefaultTableModel) MATRIZ_A.getModel();
        matriz.addColumn(Columnas);
        InsertarMatriz();
    }//GEN-LAST:event_AUMENTACOLUMNASAActionPerformed

    private void REDUCECOLUMNASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCECOLUMNASAActionPerformed

    }//GEN-LAST:event_REDUCECOLUMNASAActionPerformed

    private void AUMENTAFILASBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTAFILASBActionPerformed
       String [] Fila= new String[MATRIZ_B.getColumnCount()-1];
        DefaultTableModel matriz = (DefaultTableModel) MATRIZ_B.getModel();
        matriz.addRow(Fila);
        InsertarMatriz();    
    }//GEN-LAST:event_AUMENTAFILASBActionPerformed

    private void REDUCEFILASBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCEFILASBActionPerformed
    DefaultTableModel matriz = (DefaultTableModel) MATRIZ_B.getModel();
      if(MATRIZ_B.getRowCount()>1){
            matriz.removeRow(MATRIZ_B.getRowCount()-1);
            InsertarMatriz();
      }
      else{
            
        }
    }//GEN-LAST:event_REDUCEFILASBActionPerformed

    private void AUMENTACOLUMNASBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUMENTACOLUMNASBActionPerformed
        String [] Columnas = new String[MATRIZ_B.getRowCount()];
        DefaultTableModel matriz = (DefaultTableModel) MATRIZ_B.getModel();
        matriz.addColumn(Columnas);
        InsertarMatriz();
    }//GEN-LAST:event_AUMENTACOLUMNASBActionPerformed

    private void REDUCECOLUMNASBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDUCECOLUMNASBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REDUCECOLUMNASBActionPerformed

    private void LIMPIARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARAActionPerformed
        for(int i=0;i<(MATRIZ_A.getRowCount());i++)
        {
            for(int j=0;j<(MATRIZ_A.getColumnCount());j++)
            {
                MATRIZ_A.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_LIMPIARAActionPerformed

    private void LIMPIARBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARBActionPerformed
        for(int i=0;i<(MATRIZ_B.getRowCount());i++)
        {
            for(int j=0;j<(MATRIZ_B.getColumnCount());j++)
            {
                MATRIZ_B.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_LIMPIARBActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        int NFILAS_A = MATRIZ_A.getRowCount(),NFILAS_B = MATRIZ_B.getRowCount() , NCOLUMNAS_A = MATRIZ_A.getColumnCount(), NCOLUMNAS_B = MATRIZ_B.getColumnCount();

        if(NFILAS_A == NFILAS_B && NCOLUMNAS_A == NCOLUMNAS_B)
        {
            int [][] matrizA = MatrizA();
            int [][] matrizB = MatrizB();
            OrganizarTabla();
            int [][] resultado = operaciones.sumaMatriz(matrizA, matrizB, NFILAS_B, NCOLUMNAS_B);
            for(int i=0;i<NFILAS_A;i++)
            {
                for(int j=0; j<NCOLUMNAS_A;j++)
                {
                    Resultado.setValueAt(resultado[i][j], i, j);              
                }
            } 
        }
        else
        {

        }
        InsertarMatriz();
    }//GEN-LAST:event_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(SUMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUMA().setVisible(true);
            }
        });
    }
    public void InsertarMatriz()
    {
         for(int i = 0; i < MATRIZ_A.getColumnCount() ; i++)
        {
            MATRIZ_A.getColumnModel().getColumn(i).setPreferredWidth(190/MATRIZ_A.getColumnCount());
        }
         MATRIZ_A.setRowHeight(190/MATRIZ_A.getRowCount());
        for(int i = 0; i < MATRIZ_B.getColumnCount() ; i++)
        {
            MATRIZ_B.getColumnModel().getColumn(i).setPreferredWidth(190/MATRIZ_B.getColumnCount());
        }
        MATRIZ_B.setRowHeight(190/MATRIZ_B.getRowCount());
        for(int i = 0; i < Resultado.getColumnCount() ; i++)
        {
            Resultado.getColumnModel().getColumn(i).setPreferredWidth(190/Resultado.getColumnCount());
        }
         Resultado.setRowHeight(190/Resultado.getRowCount());
        for(int i = 0; i < Resultado.getColumnCount() ; i++)
        {
            Resultado.getColumnModel().getColumn(i).setPreferredWidth(190/Resultado.getColumnCount());
        }
        Resultado.setRowHeight(190/Resultado.getRowCount());    
    }
private int [][] MatrizA ()
    {
        int [][] matrizA = new int[MATRIZ_A.getRowCount()][MATRIZ_A.getColumnCount()];
        for(int i=0;i<MATRIZ_A.getRowCount();i++)
        {
            for(int j=0; j<MATRIZ_A.getColumnCount();j++)
            {
                if(MATRIZ_A.getValueAt(i , j)==null)
                {
                    MATRIZ_A.setValueAt("0", i, j);
                }
                matrizA[i][j] = Integer.parseInt((String) MATRIZ_A.getValueAt(i, j));
            }
        }
        return matrizA;
    }  
private int [][] MatrizB ()
    {
        int [][] matrizB = new int[MATRIZ_B.getRowCount()][MATRIZ_B.getColumnCount()];
        for(int i=0;i<MATRIZ_B.getRowCount();i++)
        {
            for(int j=0; j<MATRIZ_B.getColumnCount();j++)
            {
                if(MATRIZ_B.getValueAt(i , j)==null)
                {
                    MATRIZ_B.setValueAt("0", i, j);
                }
                matrizB[i][j] = Integer.parseInt((String) MATRIZ_B.getValueAt(i, j));
            }
        }
        return matrizB;
    }  
public void OrganizarTabla(){
      
     DefaultTableModel matriz = (DefaultTableModel) Resultado.getModel();
        if(MATRIZ_A.getColumnCount() > Resultado.getColumnCount() )
        {
            do{
            String [] Columnas = new String[MATRIZ_A.getRowCount()-1];
            matriz.addColumn(Columnas);
            }while(MATRIZ_A.getColumnCount() > Resultado.getColumnCount());
        }
        if(Resultado.getColumnCount() > MATRIZ_A.getColumnCount()){
            //Colocar para quitar columnas
        }
        if(MATRIZ_A.getRowCount() > Resultado.getRowCount())
        {
            do{
            String [] fila= new String[MATRIZ_A.getColumnCount()-1];
            matriz.addRow(fila);
            }while(MATRIZ_A.getRowCount() > Resultado.getRowCount());  
        }
        if(Resultado.getRowCount() > MATRIZ_A.getRowCount())
        {
            do{
            matriz.removeRow(Resultado.getRowCount()-1);
            }while(Resultado.getRowCount() > MATRIZ_A.getRowCount()); 
        }
   
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUMENTACOLUMNASA;
    private javax.swing.JButton AUMENTACOLUMNASB;
    private javax.swing.JButton AUMENTAFILASA;
    private javax.swing.JButton AUMENTAFILASB;
    private javax.swing.JButton Calcular;
    private javax.swing.JButton LIMPIARA;
    private javax.swing.JButton LIMPIARB;
    private javax.swing.JTable MATRIZ_A;
    private javax.swing.JTable MATRIZ_B;
    private javax.swing.JButton REDUCECOLUMNASA;
    private javax.swing.JButton REDUCECOLUMNASB;
    private javax.swing.JButton REDUCEFILASA;
    private javax.swing.JButton REDUCEFILASB;
    private javax.swing.JTable Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
