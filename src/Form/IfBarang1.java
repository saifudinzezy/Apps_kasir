package Form;

import Tool.CekIn;
import Tool.KoneksiDB;
import aksi.AllAksi;
import aksi.AutoIncrement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfBarang1 extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    
    String vKdBrg, vcmbKdSup, vcmbKategori, vNmBrg, vHrgBrg, vStokAw, vStokAk, vdiskon, vhrgjual;
    public IfBarang1() {
        initComponents();
        
//        showDataTabel();
        listSup();
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();  
        cekIn();
        
        AutoIncrement autoIncrement = new AutoIncrement("tbbarang1", txtKdBrg);
        autoIncrement.autoNumber("kdbrg");
    }
    
    private void cekIn(){
        String lvuser = CekIn.getLvuser();
        if (lvuser.equalsIgnoreCase("Kasir")) {
            panelBrg.setVisible(false);
            panelBtn.setVisible(false);
            showDataTabelForKasir();
        }else{
            showDataTabel();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelBrg = new javax.swing.JPanel();
        cmbKdSup = new javax.swing.JComboBox<>();
        txtKdBrg = new javax.swing.JTextField();
        txtNmBrg = new javax.swing.JTextField();
        txtHrgBrg = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbKategori = new javax.swing.JComboBox<>();
        txtStokAw = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        txtHrgJual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataBrg = new javax.swing.JTable();
        panelBtn = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(".: Form Barang");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Form Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data barang");

        panelBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        panelBrg.setOpaque(false);

        cmbKdSup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Admin", "Kasir" }));
        cmbKdSup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Supplier :"));
        cmbKdSup.setOpaque(false);
        cmbKdSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKdSupActionPerformed(evt);
            }
        });

        txtKdBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Barang :"));
        txtKdBrg.setOpaque(false);

        txtNmBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Barang :"));
        txtNmBrg.setOpaque(false);

        txtHrgBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga  Beli :"));
        txtHrgBrg.setOpaque(false);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Sembako", "Curah", "Bumbu Dapur", "Sabun", "Kopi dan Teh", "Mie Instans", "Minuman Kemasan", "Makanan Ringan" }));
        cmbKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Kategori :"));
        cmbKategori.setOpaque(false);
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        txtStokAw.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Stok :"));
        txtStokAw.setOpaque(false);
        txtStokAw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokAwActionPerformed(evt);
            }
        });

        txtDiskon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Diskon :"));
        txtDiskon.setOpaque(false);
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        txtHrgJual.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga  Jual :"));
        txtHrgJual.setOpaque(false);

        javax.swing.GroupLayout panelBrgLayout = new javax.swing.GroupLayout(panelBrg);
        panelBrg.setLayout(panelBrgLayout);
        panelBrgLayout.setHorizontalGroup(
            panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelBrgLayout.createSequentialGroup()
                .addGroup(panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBrgLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStokAw, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(panelBrgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHrgBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtHrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBrgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmbKdSup, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        panelBrgLayout.setVerticalGroup(
            panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKdSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHrgBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokAw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data Barang : Klik 2x untuk mengubah/menghapus"));

        tblDataBrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Level User", "ID. User", "Nama User"
            }
        ));
        tblDataBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataBrgMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataBrg);

        panelBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Navigasi"));
        panelBtn.setOpaque(false);

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

        javax.swing.GroupLayout panelBtnLayout = new javax.swing.GroupLayout(panelBtn);
        panelBtn.setLayout(panelBtnLayout);
        panelBtnLayout.setHorizontalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnTambah)
                .addGap(48, 48, 48)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnLayout.setVerticalGroup(
            panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addComponent(panelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKdSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKdSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKdSupActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void txtStokAwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokAwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokAwActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        cmbKdSup.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbbarang1", txtKdBrg);
        autoIncrement.autoNumber("kdbrg");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {                                   
        double diskon;
        if (cmbKdSup.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Nama Sup harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (cmbKategori.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Kategori harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtNmBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama barang harus diisi", "informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtHrgBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harga barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtKdBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Kode barang harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtStokAw.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Stok Akhir harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtDiskon.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Diskon harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if ((diskon = Double.valueOf(txtDiskon.getText().trim())) > 100) {
            JOptionPane.showMessageDialog(this, "Diskon tidak boleh lebh dari 100", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else{
            aksiSimpan();
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error cek simpan : "+e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         if (txtKdBrg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataBrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataBrgMousePressed
        if (evt.getClickCount() == 2) {
            int brs = tblDataBrg.getSelectedRow();
            vKdBrg = tblDataBrg.getValueAt(brs, 0).toString();
            vcmbKdSup = tblDataBrg.getValueAt(brs, 1).toString();
            vNmBrg = tblDataBrg.getValueAt(brs, 2).toString();
            vcmbKategori = tblDataBrg.getValueAt(brs, 3).toString();
            vHrgBrg = tblDataBrg.getValueAt(brs, 4).toString();
            vhrgjual = tblDataBrg.getValueAt(brs, 5).toString();
            vdiskon = tblDataBrg.getValueAt(brs, 6).toString();
            vStokAw = tblDataBrg.getValueAt(brs, 7).toString();
//            vStokAk = tblDataBrg.getValueAt(brs, 7).toString();
            
            cmbKdSup.setSelectedItem(vcmbKdSup);            
            cmbKategori.setSelectedItem(vcmbKategori);            
            txtKdBrg.setText(vKdBrg);
            txtNmBrg.setText(vNmBrg);            
            txtDiskon.setText(vdiskon);
            txtStokAw.setText(vStokAw);
//            txtStokAk.setText(vStokAk);
            txtHrgBrg.setText(vHrgBrg);           
            txtHrgJual.setText(vhrgjual);           
            
            enableForm();
            txtKdBrg.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");    
        }
    }//GEN-LAST:event_tblDataBrgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbKdSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBrg;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JTable tblDataBrg;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHrgBrg;
    private javax.swing.JTextField txtHrgJual;
    private javax.swing.JTextField txtKdBrg;
    private javax.swing.JTextField txtNmBrg;
    private javax.swing.JTextField txtStokAw;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        cmbKdSup.setSelectedIndex(0);        
        cmbKategori.setSelectedIndex(0);
        txtDiskon.setText("");
        txtHrgBrg.setText("");
        txtHrgJual.setText("");
        txtNmBrg.setText("");
//        txtStokAk.setText("");
        txtStokAw.setText("");
        txtKdBrg.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        cmbKdSup.setEnabled(false);        
        cmbKategori.setEnabled(false);   
        txtDiskon.setEnabled(false);
        txtHrgBrg.setEnabled(false);
        txtHrgJual.setEnabled(false);
        txtNmBrg.setEnabled(false);
        txtStokAw.setEnabled(false);
//        txtStokAk.setEnabled(false);
        txtKdBrg.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        cmbKdSup.setEnabled(true);        
        cmbKategori.setEnabled(true);   
        txtDiskon.setEnabled(true);
        txtHrgBrg.setEnabled(true);
        txtHrgJual.setEnabled(true);
        txtNmBrg.setEnabled(true);
        txtStokAw.setEnabled(true);
//        txtStokAk.setEnabled(true);
        //txtKdBrg.setEnabled(true);
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
                
        tableModelSup.addColumn("KD. Brg");
        tableModelSup.addColumn("Nama Sup");        
        tableModelSup.addColumn("Nama Brg");
        tableModelSup.addColumn("Kategori");                
        tableModelSup.addColumn("Harga Beli");        
        tableModelSup.addColumn("Harga Jual");        
        tableModelSup.addColumn("Diskon");
        tableModelSup.addColumn("Stok Aw");     
//        tableModelSup.addColumn("Stok Ak");     
        
        tblDataBrg.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "SELECT * FROM tbbarang1 LEFT JOIN tbsupp ON tbbarang1.kdsup = tbsupp.idsup order by tbbarang1.kdbrg ASC;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("kdbrg"),                    
                    res.getString("perusahaan"),                    
                    res.getString("nm_brg"),
                    res.getString("kategori"),
                    res.getString("hrg_brg"),                    
                    res.getString("hrg_jual"),                    
                    res.getString("diskon"),
                    res.getString("stok")
//                    res.getString("stok_akh")
                });
             tblDataBrg.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }
    private void showDataTabelForKasir(){
        DefaultTableModel tableModelSup= new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }            
        };
                
        tableModelSup.addColumn("KD. Brg");
        tableModelSup.addColumn("Nama Sup");        
        tableModelSup.addColumn("Nama Brg");
        tableModelSup.addColumn("Kategori");                
//        tableModelSup.addColumn("Harga Beli");        
        tableModelSup.addColumn("Harga Jual");        
        tableModelSup.addColumn("Diskon");
        tableModelSup.addColumn("Stok Aw");     
//        tableModelSup.addColumn("Stok Ak");     
        
        tblDataBrg.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "SELECT * FROM tbbarang1 LEFT JOIN tbsupp ON tbbarang1.kdsup = tbsupp.idsup order by tbbarang1.kdbrg ASC;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("kdbrg"),                    
                    res.getString("perusahaan"),                    
                    res.getString("nm_brg"),
                    res.getString("kategori"),
//                    res.getString("hrg_brg"),                    
                    res.getString("hrg_jual"),                    
                    res.getString("diskon"),
                    res.getString("stok")
//                    res.getString("stok_akh")
                });
             tblDataBrg.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }

    String[] keySup;
    private void listSup(){
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            String sql = "select * from tbsupp order by idsup asc;";
            Statement stat =_Cnn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            cmbKdSup.removeAllItems();
            cmbKdSup.repaint();
            cmbKdSup.addItem("-- Pilih --");
            int i = 1;
            while (res.next()) {                
                cmbKdSup.addItem(res.getString(2)); //pilih column nomer 3 untuk mengambil value nama brg
                i++;
            }
            res.first();
            keySup = new String[i+1];
            for (Integer x = 1; x< i; x++) {
                keySup[x] = res.getString(1);
                res.next();
            }
        } catch (SQLException e) {
            System.out.println("Error metode listPembelian : "+e);
        }
    }
    
    @Override
    public void aksiSimpan() {
      vcmbKdSup = keySup[cmbKdSup.getSelectedIndex()];      
      vcmbKategori = (String) cmbKategori.getSelectedItem();
      vKdBrg = txtKdBrg.getText();
      vNmBrg = txtNmBrg.getText();
      vHrgBrg = txtHrgBrg.getText().trim();
      vhrgjual = txtHrgJual.getText().trim();
      vStokAw = txtStokAw.getText().trim();
//      vStokAk = txtStokAk.getText().trim();
      vdiskon = txtDiskon.getText().trim();
      
      
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbbarang1 values ('"+vKdBrg+"', '"+vcmbKdSup+"', '"+vNmBrg+"', '"+vcmbKategori+"', "
                    + "'"+vHrgBrg+"', '"+vhrgjual+"', '"+vdiskon+"', '"+vStokAw+"' )";
        } else {
            sqlinsert = "update tbbarang set kdbrg='"+vKdBrg+"', kdsup='"+vcmbKdSup+"', nm_brg='"+vNmBrg+"',"
                    + " kategori='"+vcmbKategori+"', hrg_brg='"+vHrgBrg+"', hrg_jual='"+vhrgjual+"', diskon='"+vdiskon+"', "
                    + "stok='"+vStokAw+"', where kdbrg='"+vKdBrg+"'; ";
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Barang : "+vKdBrg, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbbarang1 where kdbrg='"+vKdBrg+"' ;";
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
