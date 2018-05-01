package ProyectoU4MetNumPapus;

import MetTrapecioMetNum.jfMetTrapecioMetNum;
import MetSimpsonTercioMetNum.jfMetSimpsonTercioMetNum;
public class jfMenuOpcionesMetodosIntegracionNum extends javax.swing.JFrame {

    public jfMenuOpcionesMetodosIntegracionNum() {
        initComponents();
        //Definimos que (siempre) inicie esta ventana en el centro de la pantalla...
        setLocationRelativeTo(this);
        //Definimos propiedades para el estilo de la ventana...
        jbMRTrapecio.setOpaque(true);
        jbMRTrapecio.setBorderPainted(false);
        jbMSimpson.setOpaque(true);
        jbMSimpson.setBorderPainted(false);
        jButton2.setOpaque(true);
        jButton2.setBorderPainted(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMRTrapecio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbMSimpson = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMRTrapecio.setBackground(new java.awt.Color(153, 153, 153));
        jbMRTrapecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbMRTrapecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metgaussseidel.png"))); // NOI18N
        jbMRTrapecio.setText("MÉTODO DEL TRAPECIO");
        jbMRTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMRTrapecioActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("ABANDONAR LA APLICACIÓN");

        jbMSimpson.setBackground(new java.awt.Color(153, 153, 153));
        jbMSimpson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbMSimpson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metjacobi.png"))); // NOI18N
        jbMSimpson.setText("MÉTODO DE SIMPSON 1/3");
        jbMSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMSimpsonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIFERENCIACIÓN E INTEGRACIÓN NUMÉRICA");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 42)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("METNUM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMRTrapecio, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jbMSimpson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMRTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMSimpson, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMRTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMRTrapecioActionPerformed
        jfMetTrapecioMetNum open = new jfMetTrapecioMetNum();
        open.setVisible(true);
        open.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbMRTrapecioActionPerformed

    private void jbMSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMSimpsonActionPerformed
        jfMetSimpsonTercioMetNum open=new jfMetSimpsonTercioMetNum();
        open.setVisible(true);
        open.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbMSimpsonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbMRTrapecio;
    private javax.swing.JButton jbMSimpson;
    // End of variables declaration//GEN-END:variables
}
