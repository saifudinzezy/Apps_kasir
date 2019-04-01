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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfBarang extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    String vkdbrg, vcmbkdbrg, vstokbrg, vhrgbeli, vhrgjual, vdiskon, vtgl;
    
    public IfBarang() {
        initComponents();
        
        showDataTabel();
        listpembelian();
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();   
        
        AutoIncrement autoIncrement = new AutoIncrement("tbbarang", txtKdBrg);
        autoIncrement.autoNumber("idbrg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbKdBrg = new javax.swing.JComboBox<>();
        txtKdBrg = new javax.swing.JTextField();
        txtStokBarang = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtHrgJual = new javax.swing.JTextField();
        txtHrgBeli = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataBrg = new javax.swing.JTable();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        cmbKdBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --" }));
        cmbKdBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Barang :"));
        cmbKdBrg.setOpaque(false);
        cmbKdBrg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKdBrgItemStateChanged(evt);
            }
        });
        cmbKdBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbKdBrgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbKdBrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbKdBrgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbKdBrgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbKdBrgMouseReleased(evt);
            }
        });
        cmbKdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKdBrgActionPerformed(evt);
            }
        });

        txtKdBrg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Barang :"));
        txtKdBrg.setOpaque(false);

        txtStokBarang.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Stok Barang :"));
        txtStokBarang.setOpaque(false);
        txtStokBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokBarangActionPerformed(evt);
            }
        });

        txtHrgJual.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga Jual :"));
        txtHrgJual.setOpaque(false);

        txtHrgBeli.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Harga Beli :"));
        txtHrgBeli.setOpaque(false);
        txtHrgBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrgBeliActionPerformed(evt);
            }
        });

        txtDiskon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Diskon :"));
        txtDiskon.setOpaque(false);
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
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
                .addGap(36, 36, 36)
                .addComponent(btnTambah)
                .addGap(44, 44, 44)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addContainerGap())
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

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKdBrgActionPerformed
        //null
    }//GEN-LAST:event_cmbKdBrgActionPerformed

    private void txtStokBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokBarangActionPerformed
        //null
    }//GEN-LAST:event_txtStokBarangActionPerformed

    private void txtHrgBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrgBeliActionPerformed
        //null
    }//GEN-LAST:event_txtHrgBeliActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        //null
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void cmbKdBrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMousePressed
       //alternatif aksi
    }//GEN-LAST:event_cmbKdBrgMousePressed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        txtStokBarang.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbbarang", txtKdBrg);
        autoIncrement.autoNumber("idbrg");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {                                   
        double diskon;
        if (cmbKdBrg.getSelectedIndex() <= 0) { //nomer index combo box dimulai dr nol
            JOptionPane.showMessageDialog(this, "Nama barang harus dipilih", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtStokBarang.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Stok Barang harus diisi", "informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtHrgBeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harga beli harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtHrgJual.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Harga Jual harus diisi", "Informasi", JOptionPane.INFORMATION_MESSAGE);
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

    private void cmbKdBrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMouseClicked
        //gagal
    }//GEN-LAST:event_cmbKdBrgMouseClicked

    private void cmbKdBrgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKdBrgItemStateChanged
        //gagal
    }//GEN-LAST:event_cmbKdBrgItemStateChanged

    private void cmbKdBrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMouseExited
        //gagal
    }//GEN-LAST:event_cmbKdBrgMouseExited

    private void cmbKdBrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMouseEntered
        //gagal
    }//GEN-LAST:event_cmbKdBrgMouseEntered

    private void cmbKdBrgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbKdBrgMouseReleased
         try {                        
            if (evt.getClickCount() == 1) {
            vcmbkdbrg = keyPembelian[cmbKdBrg.getSelectedIndex()];                                    
           _Cnn = null;
           _Cnn = getCnn.getConnection();          
           Statement stat = _Cnn.createStatement();
           ResultSet res = stat.executeQuery("SELECT * FROM tbpembelian WHERE kdbeli="+vcmbkdbrg+" ;");
            
            while (res.next()) {                
                
                  vstokbrg =   res.getString("qty");                                        
                  vhrgbeli =  res.getString("hrg_brg");
            }
            
            txtStokBarang.setText(vstokbrg);
            txtHrgBeli.setText(vhrgbeli);
          }  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error Tampil DataPembeli : "+e);
        }
    }//GEN-LAST:event_cmbKdBrgMouseReleased

    private void tblDataBrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataBrgMousePressed
        if (evt.getClickCount() == 2) {
            int brs = tblDataBrg.getSelectedRow();
            vkdbrg = tblDataBrg.getValueAt(brs, 0).toString();
            vcmbkdbrg = tblDataBrg.getValueAt(brs, 1).toString();
            vhrgbeli = tblDataBrg.getValueAt(brs, 2).toString();
            vhrgjual = tblDataBrg.getValueAt(brs, 3).toString();
            vstokbrg = tblDataBrg.getValueAt(brs, 4).toString();
            vdiskon = tblDataBrg.getValueAt(brs, 5).toString();
            //vtgl = tblDataBrg.getValueAt(brs, 6).toString();
            
            cmbKdBrg.setSelectedItem(vcmbkdbrg);            
            txtKdBrg.setText(vkdbrg);
            txtHrgBeli.setText(vhrgbeli);            
            txtHrgJual.setText(vhrgjual);
            txtStokBarang.setText(vstokbrg);
            txtDiskon.setText(vdiskon);                      
            
            enableForm();
            txtKdBrg.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");     
    }//GEN-LAST:event_tblDataBrgMousePressed
  }

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDataBrg;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHrgBeli;
    private javax.swing.JTextField txtHrgJual;
    private javax.swing.JTextField txtKdBrg;
    private javax.swing.JTextField txtStokBarang;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        cmbKdBrg.setSelectedIndex(0);        
        txtDiskon.setText("");
        txtHrgBeli.setText("");
        txtHrgJual.setText("");
        txtStokBarang.setText("");
        //txtKdBrg.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        cmbKdBrg.setEnabled(false);        
        txtDiskon.setEnabled(false);
        txtHrgBeli.setEnabled(false);
        txtHrgJual.setEnabled(false);
        txtStokBarang.setEnabled(false);
        txtKdBrg.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        cmbKdBrg.setEnabled(true);        
        txtDiskon.setEnabled(true);
        //txtHrgBeli.setEnabled(true);
        txtHrgJual.setEnabled(true);
        //txtStokBarang.setEnabled(true);
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
        tableModelSup.addColumn("Nama Brg");        
        tableModelSup.addColumn("Harga Beli");
        tableModelSup.addColumn("Harga Jual");                
        tableModelSup.addColumn("Stok Barang");        
        tableModelSup.addColumn("Diskon");
        tableModelSup.addColumn("Tanggal Pembelian");     
        
        tblDataBrg.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "  SELECT * FROM tbbarang LEFT JOIN tbpembelian ON tbbarang.kd_beli = tbpembelian.kdbeli order by tbbarang.idbrg ASC;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{                    
                    res.getString("idbrg"),                    
                    res.getString("nm_brg"),                    
                    res.getString("hrg_brg"),
                    res.getString("hrg_jual"),
                    res.getString("qty"),                    
                    res.getString("diskon"),
                    res.getString("tgl")
                });
             tblDataBrg.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }
    
    String[] keyPembelian;
    private void listpembelian(){
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            String sql = "select * from tbpembelian order by nm_brg asc ;";
            Statement stat =_Cnn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            cmbKdBrg.removeAllItems();
            cmbKdBrg.repaint();
            cmbKdBrg.addItem("-- Pilih --");
            int i = 1;
            while (res.next()) {                
                cmbKdBrg.addItem(res.getString(3)); //pilih column nomer 3 untuk mengambil value nama brg
                i++;
            }
            res.first();
            keyPembelian = new String[i+1];
            for (Integer x = 1; x< i; x++) {
                keyPembelian[x] = res.getString(1);
                res.next();
            }
        } catch (SQLException e) {
            System.out.println("Error metode listPembelian : "+e);
        }
    }

    @Override
    public void aksiSimpan() {
      vcmbkdbrg = keyPembelian[cmbKdBrg.getSelectedIndex()];      
      vkdbrg = txtKdBrg.getText();
      vstokbrg = txtStokBarang.getText();
      vhrgbeli = txtHrgBeli.getText().trim();
      vhrgjual = txtHrgJual.getText().trim();
      vdiskon = txtDiskon.getText().trim();
      
      
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbbarang values ('"+vkdbrg+"', '"+vcmbkdbrg+"', '"+vhrgjual+"','"+vdiskon+"')";
        } else {
            sqlinsert = "update tbbarang set kd_beli='"+vcmbkdbrg+"', hrg_jual='"+vhrgjual+"', diskon='"+vdiskon+"' where idbrg='"+vkdbrg+"'; ";
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Barang : "+vkdbrg, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbbarang where idbrg='"+vkdbrg+"' ;";
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
