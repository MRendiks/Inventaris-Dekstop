/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import java.awt.event.ActionListener;
import java.io.File;
import java.math.BigInteger;
import javax.swing.JFileChooser;

/**
 *
 * @author RAVEN
 */
public class Data_Dekripsi extends javax.swing.JPanel {
    
    EncDec obj=new EncDec();
    String nama_file = "";
    String alamat_file = "";
    String alamat_folder_enkripsi = "C:\\Users\\Rendi\\Documents\\KERJA\\JOKI\\MAHINDA\\notaris\\src\\enkripsi\\";
    String kunci = "";
    int mode = 0;
    /**
     * Creates new form Login
     */
    public Data_Dekripsi() {
        initComponents();
        
    }

    public void register() {
//        txtUser.grabFocus();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TData = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BtnTampil = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LIHAT DATA DEKRIPSI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data");

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setText("Pilih");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        BtnTampil.setBackground(new java.awt.Color(51, 204, 255));
        BtnTampil.setText("Tampilkan");
        BtnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTampilMouseClicked(evt);
            }
        });
        BtnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(TData, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(BtnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BtnTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Enkripsi Data");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(Data_Dekripsi.this);
        File f = jf.getSelectedFile();
        
        nama_file = f.getName();
        alamat_file = f.getAbsolutePath();
        TData.setText(nama_file);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void BtnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTampilMouseClicked
        FunctionSet.openfile(alamat_file);	
    }//GEN-LAST:event_BtnTampilMouseClicked

    private void BtnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTampilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTampil;
    private javax.swing.JTextField TData;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
