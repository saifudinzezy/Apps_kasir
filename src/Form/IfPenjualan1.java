package Form;

import Tool.KoneksiDB;
import aksi.AllAksi;
import aksi.AutoIncrement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfPenjualan1 extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    
    String vkdjual, vkategori, vkdbrg, vtgl, vbyr;
    int vjmlbrg, vhrg, vstok, vdiskon;
    
    public IfPenjualan1() {
        initComponents();
                
        showDataTabel();
        tglHariIni();
        
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();  
        listSupp();
        AutoIncrement autoIncrement = new AutoIncrement("tbpenjualan1", txtKdPen);
        autoIncrement.autoNumber("kdjual");
    }
    
    private void tglHariIni(){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String tgl = simpleDateFormat.format(now);
        vtgl = tgl;
        lbTgl.setText(tgl);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtHrg = new javax.swing.JTextField();
        txtKdPen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDiskon = new javax.swing.JTextField();
        txtJmlBrg = new javax.swing.JTextField();
        cmbKdBrg = new javax.swing.JComboBox<>();
        txtKate = new javax.swing.JTextField();
        txtByr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataPen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTgl = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".: Form Penjualan");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        txtHrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga  :"));
        txtHrg.setOpaque(false);
        txtHrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrgActionPerformed(evt);
            }
        });

        txtKdPen.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Penjualan :"));
        txtKdPen.setOpaque(false);

        txtDiskon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Diskon :"));
        txtDiskon.setOpaque(false);
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        txtJmlBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Jumlah Barang  :"));
        txtJmlBrg.setOpaque(false);
        txtJmlBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlBrgActionPerformed(evt);
            }
        });

        cmbKdBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -" }));
        cmbKdBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Brg :"));
        cmbKdBrg.setOpaque(false);
        cmbKdBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbKdBrgMousePressed(evt);
            }
        });
        cmbKdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKdBrgActionPerformed(evt);
            }
        });

        txtKate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Kategori :"));
        txtKate.setOpaque(false);
        txtKate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKateActionPerformed(evt);
            }
        });

        txtByr.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Pembayaran Rp  :"));
        txtByr.setOpaque(false);
        txtByr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtByrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtKdPen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJmlBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtByr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKdPen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJmlBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtByr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Navigasi"));
        jPanel2.setOpaque(false);

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save-black.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trans-hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trans-add.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addGap(59, 59, 59)
                .addComponent(btnSimpan)
                .addGap(35, 35, 35)
                .addComponent(btnHapus)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data Penjualan : Klik 2x untuk mengubah/menghapus"));

        tblDataPen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "KD. Plg", "Nama Member", "No. tlp", "Alamat"
            }
        ));
        tblDataPen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataPenMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataPen);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Transaksi Penjualan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data penjualan");

        lbTgl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTgl.setForeground(new java.awt.Color(0, 153, 255));
        lbTgl.setText("tanggal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addComponent(lbTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbTgl))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtHrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrgActionPerformed

    private void txtJmlBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlBrgActionPerformed
        if (txtJmlBrg.getText() == null) {
            JOptionPane.showMessageDialog(this, "Jumlah barang belum diisi");
        }else{
            bayar();
        }
    }//GEN-LAST:event_txtJmlBrgActionPerformed

    private void cmbKdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKdBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKdBrgActionPerformed

    private void txtKateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKateActionPerformed

    private void txtByrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtByrActionPerformed
        if (txtJmlBrg.getText() == null || txtJmlBrg.getText().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Jumlah barang belum diisi");
        } else if (txtByr.getText() == null) {
            JOptionPane.showMessageDialog(this, "Nominal Pembayaran belum diisi");
        } else{
            try {
                diskon();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error Diskon"+e);
            }
        }
    }//GEN-LAST:event_txtByrActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        cmbKdBrg.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbpenjualan1", txtKdPen);
        autoIncrement.autoNumber("kdjual");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         if (cmbKdBrg.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Nama Brg harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtKdPen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kode Penjualan harus diisi", "informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtHrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harga barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtJmlBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Jumlah penjualan barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else{
            aksiSimpan();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtKdPen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cmbKdBrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMousePressed
        try {                        
            if (evt.getClickCount() == 1) {
            vkdbrg = keySupp[cmbKdBrg.getSelectedIndex()];                                    
           _Cnn = null;
           _Cnn = getCnn.getConnection();          
           Statement stat = _Cnn.createStatement();
           ResultSet res = stat.executeQuery("SELECT * FROM tbbarang1 WHERE kdbrg="+vkdbrg+" ;");
            
            while (res.next()) {                
                
                  vkategori =   res.getString("kategori");                                        
                  vhrg =  Integer.valueOf(res.getString("hrg_jual"));
                  vstok =   Integer.valueOf(res.getString("stok"));                                        
                  vdiskon =   Integer.valueOf(res.getString("diskon"));
            }
            
            txtKate.setText(vkategori);
            txtHrg.setText(String.valueOf(vhrg));
            txtDiskon.setText(String.valueOf(vdiskon));
          }  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error Tampil DataPembeli : "+e);
        }
    }//GEN-LAST:event_cmbKdBrgMousePressed

    private void tblDataPenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataPenMousePressed
        try {
            if (evt.getClickCount() == 2) {
            int brs = tblDataPen.getSelectedRow();
            vkdjual = tblDataPen.getValueAt(brs, 0).toString();
            vkdbrg = tblDataPen.getValueAt(brs, 1).toString();            
//            vkategori = tblDataPen.getValueAt(brs, 2).toString();
            vhrg = Integer.parseInt(tblDataPen.getValueAt(brs, 2).toString());
            vjmlbrg = Integer.parseInt(tblDataPen.getValueAt(brs, 3).toString());
            vdiskon = Integer.parseInt(tblDataPen.getValueAt(brs, 4).toString());
            vkategori = tblDataPen.getValueAt(brs, 5).toString();
            vtgl = tblDataPen.getValueAt(brs, 6).toString();
            
            txtKdPen.setText(vkdjual);
            cmbKdBrg.setSelectedItem(vkdbrg);            
            txtDiskon.setText(String.valueOf(vdiskon));
//            txtKate.setText(vkategori);
            txtByr.setText(String.valueOf(vhrg));
            txtJmlBrg.setText(String.valueOf(vjmlbrg));
            txtKate.setText(vkategori);
//            txtHrg.setText(String.valueOf(vhrg));
            
            enableForm();
            txtKdPen.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");            
    }                         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error KLik dataTabel"+e);
        }
    }//GEN-LAST:event_tblDataPenMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKdBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTgl;
    private javax.swing.JTable tblDataPen;
    private javax.swing.JTextField txtByr;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHrg;
    private javax.swing.JTextField txtJmlBrg;
    private javax.swing.JTextField txtKate;
    private javax.swing.JTextField txtKdPen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {                
        cmbKdBrg.setSelectedIndex(0);
        txtKdPen.setText("");
        txtHrg.setText("");
        txtDiskon.setText("");
        txtJmlBrg.setText("");
        txtKate.setText("");
        txtByr.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {     
        cmbKdBrg.setEnabled(false);
        txtKate.setEnabled(false);
        txtByr.setEnabled(false);
        txtKdPen.setEnabled(false);
        txtHrg.setEnabled(false);
        txtDiskon.setEnabled(false);
        txtJmlBrg.setEnabled(false);        
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        cmbKdBrg.setEnabled(true);
//        txtKdPen.setEnabled(true);
//        txtKate.setEnabled(true);
        txtByr.setEnabled(true);
//        txtHrg.setEnabled(true);
//        txtDiskon.setEnabled(true);
        txtJmlBrg.setEnabled(true);       
        btnSimpan.setEnabled(true);
    }

    @Override
    public void showDataTabel() {
        DefaultTableModel tableModelSup= new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }            
        };
                
        tableModelSup.addColumn("KD. Pen");
        tableModelSup.addColumn("Nama Brg");        
        tableModelSup.addColumn("Pem Bayaran");
        tableModelSup.addColumn("Jml Brg");        
        tableModelSup.addColumn("Diskon");
        tableModelSup.addColumn("Kategori");
        tableModelSup.addColumn("Tanggal");     
        
        tblDataPen.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "SELECT * FROM tbpenjualan1 LEFT JOIN tbbarang1 ON tbpenjualan1.kd_brg = tbbarang1.kdbrg order by tbpenjualan1.kdjual  ASC";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("kdjual"),
                    res.getString("nm_brg"),                    
                    res.getString("byr"),
                    res.getString("jmlpen"),
                    res.getString("diskon"),                    
                    res.getString("kategori"),                    
                    res.getString("tgl")
                });
             tblDataPen.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }
    
    String[] keySupp;
    private void listSupp(){
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            String sql = "select * from tbbarang1 order by nm_brg asc ;";
            Statement stat =_Cnn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            cmbKdBrg.removeAllItems();
            cmbKdBrg.repaint();
            cmbKdBrg.addItem("-- Pilih --");
            int i = 1;
            while (res.next()) {                
                cmbKdBrg.addItem(res.getString(3));
                i++;
            }
            res.first();
            keySupp = new String[i+1];
            for (Integer x = 1; x< i; x++) {
                keySupp[x] = res.getString(1);
                res.next();
            }
        } catch (SQLException e) {
            System.out.println("Error metode listSupplier : "+e);
        }
    }

    @Override
    public void aksiSimpan() {
      vkdbrg = keySupp[cmbKdBrg.getSelectedIndex()];
//      vkategori = txtKate.getText();
//      vkdjual = txtKdPen.getText(); 
      vkdjual = txtKdPen.getText();
      vjmlbrg = Integer.parseInt(txtJmlBrg.getText());
      vbyr = txtByr.getText();
//      vhrg = Integer.parseInt(txtHrg.getText().toString().trim());
      vjmlbrg = Integer.parseInt(txtJmlBrg.getText().toString().trim());
      String sql = null;
      int x;
      
        if (btnSimpan.getText().equals("Simpan")) {
            if (vstok > 0) {
                x = vstok - vjmlbrg;            
                sql = "update tbbarang1 set stok='"+x+"' where kdbrg='"+vkdbrg+"' ";
            }             
            sqlinsert = "insert into tbpenjualan1 values ('"+vkdjual+"', '"+vkdbrg+"', '"+vjmlbrg+"', '"+vbyr+"', '"+vtgl+"')";
        } else {
            sqlinsert = "update tbpenjualan1 set kd_brg='"+vkdbrg+"', jmlpen='"+vjmlbrg+"', "
                    + " byr='"+vbyr+"', tgl='"+vtgl+"' where kdjual='"+vkdjual+"'; ";
        }
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();            
            
             if (sql != null) {            
            Statement stat2 = _Cnn.createStatement();
            stat2.executeUpdate(sql);
            }
             
            Statement stat = _Cnn.createStatement();
            stat.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            showDataTabel();
            clearForm();
            disableForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erroe metod aksiSImpan() : "+e);
        }  
    }

    @Override
    public void aksiHapus() {
       int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Penjualan : "+vkdjual, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbpenjualan1 where kdjual='"+vkdjual+"' ;";
                Statement stat = _Cnn.createStatement();
                stat.executeUpdate(sqldelete);
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                clearForm();
                disableForm();
                showDataTabel();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error metode aksi simpan : "+e);
            }
        }  
    }

    @Override
    public void formTengah() {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension framsize = this.getSize();
        if (framsize.height < screensize.height) {
            framsize.height = screensize.height;
        }
        if (framsize.width > screensize.width) {
            framsize.width = screensize.width;
        }
        this.setLocation((screensize.width - framsize.width)/2, (screensize.height - framsize.height)/2);
    }
    
    private void diskon(){
        //ambil semua nilai
        int hrg = Integer.valueOf(txtHrg.getText().toString().trim());
        int diskon = Integer.valueOf(txtDiskon.getText().toString().trim());
        int jmlBrg = Integer.valueOf(txtJmlBrg.getText().toString().trim());
        Integer pembayaran = Integer.valueOf(txtByr.getText().toString().trim());
        //perhitungan diskon
       int jmlHrg = hrg * jmlBrg;            
       int hitDiskon = (jmlHrg / 100) * diskon;
       int fix = jmlHrg - hitDiskon;
        if (pembayaran < jmlBrg) {
            JOptionPane.showMessageDialog(this, "Uang anda tidak cukup");
            return;
        } else{
       String pem = ubahKursUang(pembayaran);
       String tot = ubahKursUang(fix);
         //perhitungan pembayaran
       int totHrg = pembayaran - fix;       
       String pass = ubahKursUang(totHrg);
       JOptionPane.showMessageDialog(this, "Harga "+pem+" - Diskon "+tot+""
               +"\n Kembalian "+pass);   
        }
    }
    private void bayar(){
        //ambil semua nilai
        int hrg = Integer.valueOf(txtHrg.getText().toString().trim());
        int diskon = Integer.valueOf(txtDiskon.getText().toString().trim());
//        int diskon;
        int jmlBrg = Integer.valueOf(txtJmlBrg.getText().toString().trim());        
        //perhitungan diskon
       int jmlHrg = hrg * jmlBrg;        
       String x = ubahKursUang(hrg);
       int hitDiskon = (jmlHrg / 100) * diskon;
       int fix = jmlHrg - hitDiskon;
       String z = ubahKursUang(fix);
       JOptionPane.showMessageDialog(this, "Harga "+x+"\n Diskon : "+diskon+"%"
               +"\n Total Harga "+z);
    }
    private int rupiah(int x){
        
        return x;
    }
    private String ubahKursUang(double harga){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(harga);
//        System.out.printf("Harga Rupiah: %s %n", kursIndonesia.format(harga));
    }
}