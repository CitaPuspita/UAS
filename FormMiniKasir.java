/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minikasir;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FormMiniKasir extends javax.swing.JFrame {

    /**
     * Creates new form FormMiniKasir
     */
    public FormMiniKasir() {
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
        rbBarang1 = new javax.swing.JRadioButton();
        rbBarang2 = new javax.swing.JRadioButton();
        rbBarang3 = new javax.swing.JRadioButton();
        txtBarang1 = new javax.swing.JTextField();
        txtBarang2 = new javax.swing.JTextField();
        txtBarang3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJmlBarang1 = new javax.swing.JTextField();
        txtJmlBarang2 = new javax.swing.JTextField();
        txtJmlBarang3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHargaBarangD1 = new javax.swing.JTextField();
        txtHargaBarangD2 = new javax.swing.JTextField();
        txtHargaBarangD3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotHarga1 = new javax.swing.JTextField();
        txtTotHarga2 = new javax.swing.JTextField();
        txtTotHarga3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotPembayaran = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUangAkhir = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiskon5Persen1 = new javax.swing.JTextField();
        btnUangAkhir = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setText("Mini Kasir");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Harga Barang");

        rbBarang1.setText("Barang 1");
        rbBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBarang1ActionPerformed(evt);
            }
        });

        rbBarang2.setText("Barang 2");
        rbBarang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBarang2ActionPerformed(evt);
            }
        });

        rbBarang3.setText("Barang 3");
        rbBarang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBarang3ActionPerformed(evt);
            }
        });

        txtBarang1.setEditable(false);
        txtBarang1.setBackground(new java.awt.Color(204, 204, 255));

        txtBarang2.setEditable(false);
        txtBarang2.setBackground(new java.awt.Color(204, 204, 255));

        txtBarang3.setEditable(false);
        txtBarang3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Jumlah Barang");

        txtJmlBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlBarang1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Harga Barang Diskon");

        txtHargaBarangD1.setEditable(false);
        txtHargaBarangD1.setBackground(new java.awt.Color(204, 204, 255));

        txtHargaBarangD2.setEditable(false);
        txtHargaBarangD2.setBackground(new java.awt.Color(204, 204, 255));

        txtHargaBarangD3.setEditable(false);
        txtHargaBarangD3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Harga");

        txtTotHarga1.setEditable(false);
        txtTotHarga1.setBackground(new java.awt.Color(204, 204, 255));

        txtTotHarga2.setEditable(false);
        txtTotHarga2.setBackground(new java.awt.Color(204, 204, 255));

        txtTotHarga3.setEditable(false);
        txtTotHarga3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Pembayaran");

        txtTotPembayaran.setEditable(false);
        txtTotPembayaran.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Diskon 5% Jika Pembelian Diatas 1.000.000");

        txtUangAkhir.setEditable(false);
        txtUangAkhir.setBackground(new java.awt.Color(204, 204, 255));

        btnTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Bayar");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Uang Akhir");

        txtDiskon5Persen1.setEditable(false);
        txtDiskon5Persen1.setBackground(new java.awt.Color(204, 204, 255));

        btnUangAkhir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUangAkhir.setText("Uang Akhir");
        btnUangAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUangAkhirActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapus.setText("Hapus Semua");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rbBarang1)
                                                    .addComponent(rbBarang3)
                                                    .addComponent(rbBarang2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtJmlBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtJmlBarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJmlBarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtHargaBarangD1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtHargaBarangD2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtHargaBarangD3, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel7)))))
                            .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTotPembayaran)
                                .addComponent(jLabel6)
                                .addComponent(txtTotHarga1)
                                .addComponent(txtTotHarga2)
                                .addComponent(txtTotHarga3)
                                .addComponent(txtUangAkhir)
                                .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUangAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDiskon5Persen1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(272, 272, 272)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbBarang1)
                            .addComponent(txtBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJmlBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbBarang2)
                            .addComponent(txtBarang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJmlBarang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbBarang3)
                            .addComponent(txtBarang3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJmlBarang3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHargaBarangD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHargaBarangD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotHarga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHargaBarangD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotHarga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTotHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTotPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDiskon5Persen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUangAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUangAkhir)
                    .addComponent(btnKeluar))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void aturTextFields(){
        txtBarang1.setEnabled(false);
    }
    
    private void rbBarang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBarang2ActionPerformed
       if(rbBarang2.isSelected()==true){
            rbBarang1.setSelected(false);
            rbBarang3.setSelected(false);
            txtBarang1.setText("0");
            txtBarang2.setText("50000");
            txtBarang3.setText("0");
            txtJmlBarang1.setText("0");
            txtJmlBarang3.setText("0");
        }       
    }//GEN-LAST:event_rbBarang2ActionPerformed

    public int harga_barang, jml_brg,hrga_brg_diskon, total, bayar,diskon ;
    
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add yourt handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
            String X = txtJmlBarang1.getText();
            String Y = txtJmlBarang2.getText();
            String Z = txtJmlBarang3.getText();
            double x = Integer.parseInt(X);
            double y = Integer.parseInt(Y);  
            double z = Integer.parseInt(Z);   
            String a = txtBarang1.getText();
            String b = txtBarang2.getText();
            String c = txtBarang3.getText();
            double A = Integer.parseInt(a);
            double B = Integer.parseInt(b);  
            double C = Integer.parseInt(c); 
          try {
            if (x == 0 || y == 0 || z == 0) {
                JOptionPane.showMessageDialog(null, "Tidak boleh diisi dengan 0");
                
          if (x >= 50 || y >= 50 || z >= 50){
          JOptionPane.showMessageDialog(null, "Selamat Anda Dapat Diskon 1%");
          diskon1 = A*0.01;
          diskon2 = B*0.01;
          diskon3 = C*0.01;
          txtHargaBarangD1.setText(Double.toString(diskon1));
          txtHargaBarangD2.setText(Double.toString(diskon2));
          txtHargaBarangD3.setText(Double.toString(diskon3));
          
          txtTotHarga1.setText(Double.toString((x*A)-diskon1));
          txtTotHarga2.setText(Double.toString((y*B)-diskon2));
          txtTotHarga3.setText(Double.toString((z*C)-diskon3));
          txtTotPembayaran.setText(Double.toString(((x*A)-diskon1)+((y*B)-diskon2)+(z*C)-diskon3));
              
          }
          else{
               
          txtTotHarga1.setText(Double.toString((x*A)));
          txtTotHarga2.setText(Double.toString((y*B)));
          txtTotHarga3.setText(Double.toString((z*C)));
          txtTotPembayaran.setText(Double.toString(((x*A)+(y*B)+(z*C))));
          }  
            
                    
            
        
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "TextField Belum Terisi, Silahkan Isi Terlebih Dahulu!!");
            txtJmlBarang1.requestFocus();
            
          
            
            
            
    
        }
       
       
        
    
        
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    txtBarang1.setText("");
    txtBarang2.setText("");
    txtBarang3.setText("");
    txtJmlBarang1.setText("");
    txtJmlBarang2.setText("");
    txtJmlBarang3.setText("");
    txtHargaBarangD1.setText("");
    txtHargaBarangD2.setText("");
    txtHargaBarangD3.setText("");
    txtTotHarga1.setText("");
    txtTotHarga2.setText("");
    txtTotHarga3.setText("");
    txtDiskon5Persen1.setText("");
    txtTotPembayaran.setText("");
    txtUangAkhir.setText("");
    txtBayar.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUangAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUangAkhirActionPerformed
         try {
            String X = txtJmlBarang1.getText();
            String Y = txtJmlBarang2.getText();
            String Z = txtJmlBarang3.getText();
            double x = Integer.parseInt(X);
            double y = Integer.parseInt(Y);  
            double z = Integer.parseInt(Z);
            if (x == 0 || y == 0 || z == 0) {
                JOptionPane.showMessageDialog(null, "Tidak boleh diisi dengan 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "TextField Belum Terisi, Silahkan Isi Terlebih Dahulu!!");
            txtJmlBarang1.requestFocus();
        }
    }//GEN-LAST:event_btnUangAkhirActionPerformed

    private void rbBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBarang1ActionPerformed
    if(rbBarang1.isSelected()==true){
            rbBarang2.setSelected(false);
            rbBarang3.setSelected(false);
            txtBarang1.setText("25000");
            txtBarang2.setText("0");
            txtBarang3.setText("0");
            txtJmlBarang2.setText("0");
            txtJmlBarang3.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rbBarang1ActionPerformed

    private void rbBarang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBarang3ActionPerformed
        if(rbBarang3.isSelected()==true){
            rbBarang1.setSelected(false);
            rbBarang2.setSelected(false);
            txtBarang1.setText("0");
            txtBarang2.setText("0");
            txtBarang3.setText("75000");
            txtJmlBarang1.setText("0");
            txtJmlBarang2.setText("0");
        }       
    }//GEN-LAST:event_rbBarang3ActionPerformed

    private void txtJmlBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlBarang1ActionPerformed
         String X = txtJmlBarang1.getText();
            String Y = txtJmlBarang2.getText();
            String Z = txtJmlBarang3.getText();
            double x = Integer.parseInt(X);
            double y = Integer.parseInt(Y);  
            double z = Integer.parseInt(Z);   
            String a = txtBarang1.getText();
            String b = txtBarang2.getText();
            String c = txtBarang3.getText();
            double A = Integer.parseInt(a);
            double B = Integer.parseInt(b);  
            double C = Integer.parseInt(c); 
        try {
            if (x == 0 || y == 0 || z == 0) {
                JOptionPane.showMessageDialog(null, "Tidak boleh diisi dengan 0");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "TextField Belum Terisi, Silahkan Isi Terlebih Dahulu!!");
            txtJmlBarang1.requestFocus();
        }
       
                  
      
    }//GEN-LAST:event_txtJmlBarang1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMiniKasir().setVisible(true);
            
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnUangAkhir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbBarang1;
    private javax.swing.JRadioButton rbBarang2;
    private javax.swing.JRadioButton rbBarang3;
    private javax.swing.JTextField txtBarang1;
    private javax.swing.JTextField txtBarang2;
    private javax.swing.JTextField txtBarang3;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtDiskon5Persen1;
    private javax.swing.JTextField txtHargaBarangD1;
    private javax.swing.JTextField txtHargaBarangD2;
    private javax.swing.JTextField txtHargaBarangD3;
    private javax.swing.JTextField txtJmlBarang1;
    private javax.swing.JTextField txtJmlBarang2;
    private javax.swing.JTextField txtJmlBarang3;
    private javax.swing.JTextField txtTotHarga1;
    private javax.swing.JTextField txtTotHarga2;
    private javax.swing.JTextField txtTotHarga3;
    private javax.swing.JTextField txtTotPembayaran;
    private javax.swing.JTextField txtUangAkhir;
    // End of variables declaration//GEN-END:variables
}
