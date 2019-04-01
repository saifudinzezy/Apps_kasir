package Form.dibuangsayang;

import Tool.KoneksiDB;
import aksi.AllAksi;
import aksi.AutoIncrement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfPembelian extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    String vkdbeli, vkdsup, vkategori, vnmbrg, vtgl;
    int vjmlbrg, vhrg;
    
    public IfPembelian() {
        initComponents();
        
        showDataTabel();
        tglHariIni();
        
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();  
        listSupp();
        AutoIncrement autoIncrement = new AutoIncrement("tbpembelian", txtKdPem);
        autoIncrement.autoNumber("kdbeli");
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
        txtJmlBeli = new javax.swing.JTextField();
        txtKdPem = new javax.swing.JTextField();
        txtNmBrg = new javax.swing.JTextField();
        cmbNmSup = new javax.swing.JComboBox<>();
        cmbKategori = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtJmlHrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataPem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTgl = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".: Form Pembelian");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        txtHrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga  :"));
        txtHrg.setOpaque(false);

        txtJmlBeli.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Jumlah Pembelian :"));
        txtJmlBeli.setOpaque(false);
        txtJmlBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlBeliActionPerformed(evt);
            }
        });

        txtKdPem.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Pembelian :"));
        txtKdPem.setOpaque(false);

        txtNmBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Barang :"));
        txtNmBrg.setOpaque(false);

        cmbNmSup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "A002", "A003" }));
        cmbNmSup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Supplier :"));
        cmbNmSup.setOpaque(false);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Makan Pokok", "Curah" }));
        cmbKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Kategori"));
        cmbKategori.setOpaque(false);

        txtJmlHrg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtJmlHrg.setText("  Rp. ");
        txtJmlHrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Jumlah Harga :"));
        txtJmlHrg.setOpaque(false);
        txtJmlHrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlHrgActionPerformed(evt);
            }
        });

        jLabel4.setText("Tekan Enter untuk");

        jLabel5.setText("melihat jumlah harga");

        jLabel6.setText("<=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKdPem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbNmSup, 0, 179, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHrg))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtJmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJmlHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdPem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNmSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtJmlHrg))
                .addContainerGap())
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnTambah)
                .addGap(59, 59, 59)
                .addComponent(btnSimpan)
                .addGap(35, 35, 35)
                .addComponent(btnHapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data Pembelian : Klik 2x untuk mengubah/menghapus"));

        tblDataPem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "KD. Beli", "KD. Barang", "Nama Brg", "Hrg Brg", "Satuan", "Kategori"
            }
        ));
        tblDataPem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataPemMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataPem);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Transaksi Pembelian");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data pembelian");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJmlBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlBeliActionPerformed
        try {
        int x = Integer.parseInt(txtHrg.getText().trim());
        int y = Integer.parseInt(txtJmlBeli.getText().trim());
        int hasil = x * y;
        txtJmlHrg.setText(String.valueOf("  Rp. "+hasil));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(IfPembelian.this, "error"+e);
        }
        
    }//GEN-LAST:event_txtJmlBeliActionPerformed

    private void txtJmlHrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlHrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmlHrgActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        cmbNmSup.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbpembelian", txtKdPem);
        autoIncrement.autoNumber("kdbeli");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         if (cmbNmSup.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Nama supplier harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (cmbKategori.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Kategori harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtKdPem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kode pembelian harus diisi", "informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtNmBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtHrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harga barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtJmlBeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Jumlah pembelian barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else{
            aksiSimpan();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtKdPem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataPemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataPemMousePressed
        if (evt.getClickCount() == 2) {
            int brs = tblDataPem.getSelectedRow();
            vkdbeli = tblDataPem.getValueAt(brs, 0).toString();
            vkdsup = tblDataPem.getValueAt(brs, 1).toString();
            vnmbrg = tblDataPem.getValueAt(brs, 2).toString();
            vkategori = tblDataPem.getValueAt(brs, 3).toString();
            vhrg = Integer.parseInt(tblDataPem.getValueAt(brs, 4).toString());
            vjmlbrg = Integer.parseInt(tblDataPem.getValueAt(brs, 5).toString());
            vtgl = tblDataPem.getValueAt(brs, 6).toString();
            
            cmbNmSup.setSelectedItem(vkdsup);
            cmbKategori.setSelectedItem(vkategori);
            txtKdPem.setText(vkdbeli);
            txtNmBrg.setText(vnmbrg);
            txtJmlBeli.setText(String.valueOf(vjmlbrg));
            txtHrg.setText(String.valueOf(vhrg));
            
            enableForm();
            txtKdPem.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");            
    }//GEN-LAST:event_tblDataPemMousePressed
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbNmSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTgl;
    private javax.swing.JTable tblDataPem;
    private javax.swing.JTextField txtHrg;
    private javax.swing.JTextField txtJmlBeli;
    private javax.swing.JTextField txtJmlHrg;
    private javax.swing.JTextField txtKdPem;
    private javax.swing.JTextField txtNmBrg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        cmbKategori.setSelectedIndex(0);
        cmbNmSup.setSelectedIndex(0);
        //txtKdPem.setText("");
        txtNmBrg.setText("");
        txtHrg.setText("");
        txtJmlHrg.setText("");
        txtJmlBeli.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        cmbKategori.setEnabled(false);
        cmbNmSup.setEnabled(false);
        txtHrg.setEnabled(false);
        txtJmlHrg.setEnabled(false);
        txtKdPem.setEnabled(false);
        txtJmlBeli.setEnabled(false);
        txtNmBrg.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        cmbKategori.setEnabled(true);
        cmbNmSup.setEnabled(true);
        txtHrg.setEnabled(true);
        //txtJmlHrg.setEnabled(true);
        //txtKdPem.setEnabled(true);
        txtJmlBeli.setEnabled(true);
        txtNmBrg.setEnabled(true);
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
                
        tableModelSup.addColumn("KD. Beli");
        tableModelSup.addColumn("Nama Supp");
        tableModelSup.addColumn("Nama Brg");
        tableModelSup.addColumn("Kategori");
        tableModelSup.addColumn("Harga Brg");
        tableModelSup.addColumn("Quality");        
        tableModelSup.addColumn("Tanggal");     
        
        tblDataPem.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = " SELECT * FROM tbpembelian LEFT JOIN tbsupp ON tbpembelian.kdsup = tbsupp.idsup order by tbpembelian.kdbeli ASC;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("kdbeli"),
                    res.getString("perusahaan"),
                    res.getString("nm_brg"),
                    res.getString("kategori"),
                    res.getString("hrg_brg"),
                    res.getString("qty"),                    
                    res.getString("tgl")
                });
             tblDataPem.setModel(tableModelSup);
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
            String sql = "select * from tbsupp order by perusahaan asc ;";
            Statement stat =_Cnn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            cmbNmSup.removeAllItems();
            cmbNmSup.repaint();
            cmbNmSup.addItem("-- Pilih --");
            int i = 1;
            while (res.next()) {                
                cmbNmSup.addItem(res.getString(2));
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
      vkdsup = keySupp[cmbNmSup.getSelectedIndex()];
      vkategori = (String) cmbKategori.getSelectedItem();
      vkdbeli = txtKdPem.getText();
      vnmbrg = txtNmBrg.getText();
      vhrg = Integer.parseInt(txtHrg.getText().toString().trim());
      vjmlbrg = Integer.parseInt(txtJmlBeli.getText().toString().trim());
      
      
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbpembelian values ('"+vkdbeli+"', '"+vkdsup+"', '"+vnmbrg+"', "
                    + "'"+vhrg+"', '"+vjmlbrg+"', '"+vkategori+"', '"+vtgl+"')";
        } else {
            sqlinsert = "update tbpembelian set nm_brg='"+vnmbrg+"', hrg_brg='"+vhrg+"', qty='"+vjmlbrg+"', "
                    + "kategori='"+vkategori+"', kdsup='"+vkdsup+"' where kdbeli='"+vkdbeli+"'; ";
        }
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Pembelian : "+vkdbeli, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbpembelian where kdbeli='"+vkdbeli+"' ;";
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
}
