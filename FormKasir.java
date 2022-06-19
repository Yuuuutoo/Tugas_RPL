/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seto
 */
public class FormKasir extends javax.swing.JFrame {

    /**
     * Creates new form FormKasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in","ID"));
            public FormKasir() {
                initComponents();
                KodeBarang();
                Total();
            
            }
            private void Total(){
                txtQty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent arg0) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        try {
                            int hasil = 0;
                            if(txtQty.getText().equals("")){
                                hasil = Integer.parseInt(txtHarga.getText().replace(".", ""))*0;
                        }else{
                                hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * Integer.parseInt(txtQty.getText());
                                }
                            txtTotalHarga.setText(nf.format(hasil));
                        }catch (Exception e){
                            
                        }
                    }

                    @Override
                    public void removeUpdate(DocumentEvent arg0) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        try {
                            int hasil = 0;
                            if(txtQty.getText().equals("")){
                                hasil = Integer.parseInt(txtHarga.getText().replace(".", ""))*0;
                        }else{
                                hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * Integer.parseInt(txtQty.getText());
                                }
                            txtTotalHarga.setText(nf.format(hasil));
                        }catch (Exception e){
                            
                        }
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                });
            }
            private void KodeBarang(){
                txtKodeBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        String KodeBarang;
                        KodeBarang = (String) txtKodeBarang.getText();
                        
                        switch(KodeBarang){
                            case "B001" :
                                txtNamaBarang.setText("Gula Pasir");
                                txtHarga.setText(nf.format(12000));
                                txtQty.grabFocus();
                                break;
                            case "B002" :
                                txtNamaBarang.setText("Telur");
                                txtHarga.setText(nf.format(27000));
                                txtQty.grabFocus();
                                break;
                            case "B003" :
                                txtNamaBarang.setText("Gula Jawa");
                                txtHarga.setText(nf.format(10000));
                                txtQty.grabFocus();
                                break;
                            case "B004" :
                                txtNamaBarang.setText("Garam");
                                txtHarga.setText(nf.format(2000));
                                txtQty.grabFocus();
                                break;
                            default:
                                txtNamaBarang.setText("");
                                txtHarga.setText("");
                        }
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        String KodeBarang;
                        KodeBarang = (String) txtKodeBarang.getText();
                        
                        switch(KodeBarang){
                            case "B001" :
                                txtNamaBarang.setText("Gula Pasir");
                                txtHarga.setText(nf.format(12000));
                                txtQty.grabFocus();
                                break;
                            case "B002" :
                                txtNamaBarang.setText("Telur");
                                txtHarga.setText(nf.format(27000));
                                txtQty.grabFocus();
                                break;
                            case "B003" :
                                txtNamaBarang.setText("Gula Jawa");
                                txtHarga.setText(nf.format(10000));
                                txtQty.grabFocus();
                                break;
                            case "B004" :
                                txtNamaBarang.setText("Garam");
                                txtHarga.setText(nf.format(2000));
                                txtQty.grabFocus();
                                break;
                            default:
                                txtNamaBarang.setText("");
                                txtHarga.setText("");
                        }
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                        
                    }
                });
            }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJumlahHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtJumlahHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblJmlQty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJumlahHarga.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblJumlahHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJumlahHarga.setText("Rp.");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Kode Barang");

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        txtHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKodeBarang)
                    .addComponent(txtNamaBarang)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Kode Barang", "Nama Barang", "Harga", "Qty", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jLabel3.setText("Jumlah Harga");

        txtJumlahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahHargaActionPerformed(evt);
            }
        });

        jLabel6.setText("Item yang Dibeli :");

        lblJmlQty.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJmlQty, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJumlahHarga)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblJmlQty))
                    .addComponent(jLabel3)
                    .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        setBounds(0, 0, 625, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void txtJumlahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahHargaActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
        if (txtQty.getText().equals("")){
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object [6];
            obj [1] = txtKodeBarang.getText();
            obj [2] = txtNamaBarang.getText();
            obj [3] = txtHarga.getText();
            obj [4] = txtQty.getText();
            obj [5] = txtTotalHarga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + "", a, 0);
                
            }
            
            tblList.setRowHeight(30);
            
            lblJmlQty.setText(String.valueOf(baris));
            
            jmlTotalHarga();
            bersih();
        }
    }//GEN-LAST:event_txtQtyActionPerformed

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
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJmlQty;
    private javax.swing.JLabel lblJumlahHarga;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlahHarga;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int sub_total = 0;
        for(int a = 0; a < tblList.getRowCount(); a++){
            sub_total += Integer.parseInt((String) tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        txtJumlahHarga.setText(nf.format(sub_total));
        
        //total Bersih
        int sub_totalBersih = 0;
        for(int a = 0; a < tblList.getRowCount(); a++){
            sub_totalBersih += Integer.parseInt((String) tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        lblJumlahHarga.setText("Rp. " + nf.format(sub_total));
    }

    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        txtKodeBarang.setText("");
        txtKodeBarang.grabFocus();
        txtQty.setText("");
        txtTotalHarga.setText("");
    }
}
