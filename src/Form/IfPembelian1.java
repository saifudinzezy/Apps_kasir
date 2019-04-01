package Form;

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

public class IfPembelian1 extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete , sqlstok;
    String vkdbeli, vkategori, vkdbrg, vtgl;
    int vjmlbrg, vhrg, vstok;
    
    public IfPembelian1() {
        initComponents();
        
        showDataTabel();
        tglHariIni();
        
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();  
        listSupp();
        AutoIncrement autoIncrement = new AutoIncrement("tbpembelian1", txtKdPem);
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
        cmbKdBrg = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtKate = new javax.swing.JTextField();
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

        cmbKdBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "A002", "A003" }));
        cmbKdBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Barang :"));
        cmbKdBrg.setOpaque(false);
        cmbKdBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbKdBrgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbKdBrgMouseReleased(evt);
            }
        });

        txtKate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Kategori :"));
        txtKate.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKdPem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKdPem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtKate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJmlBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJmlBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlBeliActionPerformed
//        try {
//        int x = Integer.parseInt(txtHrg.getText().trim());
//        int y = Integer.parseInt(txtJmlBeli.getText().trim());
//        int hasil = x * y;
//        txtJmlHrg.setText(String.valueOf("  Rp. "+hasil));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(IfPembelian1.this, "error"+e);
//        }
        
    }//GEN-LAST:event_txtJmlBeliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        cmbKdBrg.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbpembelian1", txtKdPem);
        autoIncrement.autoNumber("kdbeli");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         if (cmbKdBrg.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Nama supplier harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtKdPem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kode pembelian harus diisi", "informasi", JOptionPane.INFORMATION_MESSAGE);
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
            vkdbrg = tblDataPem.getValueAt(brs, 1).toString();            
            vkategori = tblDataPem.getValueAt(brs, 2).toString();
            vhrg = Integer.parseInt(tblDataPem.getValueAt(brs, 3).toString());
            vjmlbrg = Integer.parseInt(tblDataPem.getValueAt(brs, 4).toString());
            vtgl = tblDataPem.getValueAt(brs, 5).toString();
            
            txtKdPem.setText(vkdbeli);
            cmbKdBrg.setSelectedItem(vkdbrg);            
            txtKate.setText(vkategori);
            txtHrg.setText(String.valueOf(vhrg));
            txtJmlBeli.setText(String.valueOf(vjmlbrg));
            txtHrg.setText(String.valueOf(vhrg));
            
            enableForm();
            txtKdPem.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");            
    }//GEN-LAST:event_tblDataPemMousePressed
    }
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
                  vhrg =  Integer.valueOf(res.getString("hrg_brg"));
                  vstok =   Integer.valueOf(res.getString("stok"));                                        
            }
            
            txtKate.setText(vkategori);
            txtHrg.setText(String.valueOf(vhrg));
          }  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error Tampil DataPembeli : "+e);
        }
    }//GEN-LAST:event_cmbKdBrgMousePressed

    private void cmbKdBrgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKdBrgMouseReleased
 

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
    private javax.swing.JTable tblDataPem;
    private javax.swing.JTextField txtHrg;
    private javax.swing.JTextField txtJmlBeli;
    private javax.swing.JTextField txtKate;
    private javax.swing.JTextField txtKdPem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {        
        cmbKdBrg.setSelectedIndex(0);
        txtKdPem.setText("");        
        txtHrg.setText("");        
        txtJmlBeli.setText("");
        txtKate.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {        
        cmbKdBrg.setEnabled(false);
        txtHrg.setEnabled(false);        
        txtKdPem.setEnabled(false);
        txtJmlBeli.setEnabled(false);       
        btnSimpan.setEnabled(false);
        txtKate.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {        
        cmbKdBrg.setEnabled(true);
//        txtHrg.setEnabled(true);        
//        txtKdPem.setEnabled(true);
        txtJmlBeli.setEnabled(true);        
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
        tableModelSup.addColumn("Nama Brg");
        tableModelSup.addColumn("Kategori");      
        tableModelSup.addColumn("Hrg");
        tableModelSup.addColumn("Jml Brg");        
        tableModelSup.addColumn("Tanggal");     
        
        tblDataPem.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "SELECT * FROM tbpembelian1 LEFT JOIN tbbarang1 ON tbpembelian1.kd_brg = tbbarang1.kdbrg order by tbpembelian1.kdbeli  ASC;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("kdbeli"),
                    res.getString("nm_brg"),                    
                    res.getString("kategori"),
                    res.getString("hrg_brg"),
                    res.getString("jmlpem"),                    
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
      vkategori = txtKate.getText();
      vkdbeli = txtKdPem.getText();      
      vhrg = Integer.parseInt(txtHrg.getText().toString().trim());
      vjmlbrg = Integer.parseInt(txtJmlBeli.getText().toString().trim());
      String sql = null;
      
        if (btnSimpan.getText().equals("Simpan")) {
            int x = vstok + vjmlbrg;
//            txtTot.setText(String.valueOf(x));
            sql = "update tbbarang1 set stok='"+x+"' where kdbrg='"+vkdbrg+"' ";
            sqlinsert = "insert into tbpembelian1 values ('"+vkdbeli+"', '"+vkdbrg+"', '"+vjmlbrg+"', '"+vtgl+"')";
        } else {
            sqlinsert = "update tbpembelian1 set kd_brg='"+vkdbrg+"', jmlpem='"+vjmlbrg+"', "
                    + "tgl='"+vtgl+"' where kdbeli='"+vkdbeli+"'; ";
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Pembelian : "+vkdbeli, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbpembelian1 where kdbeli='"+vkdbeli+"' ;";
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
