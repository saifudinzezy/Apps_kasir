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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfSupp extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    String vkdsup, vnmsup, vtlp, valamat;
    
    public IfSupp() {
        initComponents();
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();   
        
        AutoIncrement autoIncrement = new AutoIncrement("tbsupp", txtKdSup);
        autoIncrement.autoNumber("idsup");
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTlp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtKdSup = new javax.swing.JTextField();
        txtNmSup = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataSup = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".: Form Supplier");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        txtTlp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "No. Telephone  :"));
        txtTlp.setOpaque(false);

        txtAlamat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Alamat :"));
        txtAlamat.setOpaque(false);

        txtKdSup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Supplier :"));
        txtKdSup.setOpaque(false);

        txtNmSup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Perusahaan :"));
        txtNmSup.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKdSup, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmSup)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNmSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(36, 36, 36)
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data Supplier : Klik 2x untuk mengubah/menghapus"));

        tblDataSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "KD. Supp", "Perusahaan", "Alamat", "No. Tlp"
            }
        ));
        tblDataSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataSupMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataSup);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Form Supplier");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data suppleir");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        txtKdSup.requestFocus(true);
        AutoIncrement autoIncrement = new AutoIncrement("tbsupp", txtKdSup);
        autoIncrement.autoNumber("idsup");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtKdSup.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "KD. Supplier belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtNmSup.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nama Suplier belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtAlamat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Alamat belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtTlp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No. Telepon belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiSimpan();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtKdSup.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSupMousePressed
        try {
         if (evt.getClickCount() == 2) {
            //membuat variabeluntuk menampung nilai tbDataUser
            int brs = tblDataSup.getSelectedRow();
            //mengambil nilaidari tabel berdasarkan index row dimulai dari nol
            vkdsup = tblDataSup.getValueAt(brs, 0).toString();
            vnmsup = tblDataSup.getValueAt(brs, 1).toString();
            valamat = tblDataSup.getValueAt(brs, 2).toString();
            vtlp = tblDataSup.getValueAt(brs, 3).toString();
            //mengisi textfield dengan nilai variabel
            txtKdSup.setText(vkdsup);
            txtNmSup.setText(vnmsup);
            txtAlamat.setText(valamat);
            txtTlp.setText(vtlp);
            enableForm();
            txtKdSup.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");
        }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Method Mouse Pressed : "+e);
        }                        
    }//GEN-LAST:event_tblDataSupMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataSup;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKdSup;
    private javax.swing.JTextField txtNmSup;
    private javax.swing.JTextField txtTlp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        txtAlamat.setText("");
        //txtKdSup.setText("");
        txtNmSup.setText("");
        txtTlp.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        txtAlamat.setEnabled(false);
        txtKdSup.setEnabled(false);
        txtNmSup.setEnabled(false);
        txtTlp.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        txtAlamat.setEnabled(true);
        //txtKdSup.setEnabled(true);
        txtNmSup.setEnabled(true);
        txtTlp.setEnabled(true);
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
        
        tableModelSup.addColumn("KD. Supp");
        tableModelSup.addColumn("Nama Supp");
        tableModelSup.addColumn("Alamat");
        tableModelSup.addColumn("No. Tlp");
        
        tblDataSup.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "select * from tbsupp order by idsup asc;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{
                    res.getString("idsup"),
                    res.getString("perusahaan"),
                    res.getString("alamat"),
                    res.getString("tlp")
                });
             tblDataSup.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }

    @Override
    public void aksiSimpan() {        
       vkdsup = txtKdSup.getText();
       vnmsup = txtNmSup.getText();
       valamat = txtAlamat.getText();
       vtlp = txtTlp.getText();
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbsupp values('"+vkdsup+"', '"+vnmsup+"', '"+valamat+"', '"+vtlp+"');";
        }else{
            sqlinsert = "UPDATE tbsupp SET perusahaan='"+vnmsup+"', alamat='"+valamat+"', tlp='"+vtlp+"' where idsup='"+vkdsup+"';;";            
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
            JOptionPane.showMessageDialog(this, "Error metode aksiSimpan() : "+e);
        }
    }

    @Override
    public void aksiHapus() {
         int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Supplier : "+vkdsup, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbsupp where idsup='"+vkdsup+"' ;";
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
