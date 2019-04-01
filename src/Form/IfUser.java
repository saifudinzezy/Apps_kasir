package Form;

import aksi.AllAksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Tool.KoneksiDB;
import aksi.AutoIncrement;
import java.awt.Dimension;
import java.awt.Toolkit;

public class IfUser extends javax.swing.JInternalFrame implements AllAksi{
    KoneksiDB getCnn = new KoneksiDB();
    Connection _Cnn;
    
    String sqlselect, sqlinsert, sqldelete;
    String vid_user, vnama_user, vpass, vlev_user;
    
    public IfUser() {
        initComponents();
       formTengah();
        clearForm();
        disableForm();        
        showDataTabel();
       AutoIncrement autoIncrement = new AutoIncrement("tbuser", txtIdUSer);
        autoIncrement.autoNumber("iduser");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbLvUser = new javax.swing.JComboBox<>();
        txtIdUSer = new javax.swing.JTextField();
        txtNmUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".: Form User");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        cmbLvUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Administrator", "Kasir" }));
        cmbLvUser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Level User :"));
        cmbLvUser.setOpaque(false);

        txtIdUSer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "ID. User :"));
        txtIdUSer.setOpaque(false);

        txtNmUser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama User :"));
        txtNmUser.setOpaque(false);

        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Password :"));
        txtPass.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbLvUser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLvUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUSer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNmUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(85, 85, 85)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data User : Klik 2x untuk mengubah/menghapus"));

        tblDataUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Level User", "ID. User", "Nama User"
            }
        ));
        tblDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataUserMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataUser);
        if (tblDataUser.getColumnModel().getColumnCount() > 0) {
            tblDataUser.getColumnModel().getColumn(0).setHeaderValue("Level User");
            tblDataUser.getColumnModel().getColumn(1).setHeaderValue("ID. User");
            tblDataUser.getColumnModel().getColumn(2).setHeaderValue("Nama User");
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Form User");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data user");

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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        AutoIncrement autoIncrement = new AutoIncrement("tbuser", txtIdUSer);
        autoIncrement.autoNumber("iduser");
        cmbLvUser.requestFocus(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtIdUSer.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ID. User belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtNmUser.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nama User belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Password belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(cmbLvUser.getSelectedIndex() <= 0){
            JOptionPane.showMessageDialog(this, "Level. User belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiSimpan();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         if (txtIdUSer.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataUserMousePressed
        try {
         if (evt.getClickCount() == 2) {
            //membuat variabeluntuk menampung nilai tbDataUser
            int brs = tblDataUser.getSelectedRow();
            //mengambil nilaidari tabel berdasarkan index row dimulai dari nol
            vid_user = tblDataUser.getValueAt(brs, 0).toString();
            vnama_user = tblDataUser.getValueAt(brs, 1).toString();
            vpass = tblDataUser.getValueAt(brs, 2).toString();
            vlev_user = tblDataUser.getValueAt(brs, 3).toString();
            //mengisi textfield dengan nilai variabel
            txtIdUSer.setText(vid_user);
            txtNmUser.setText(vnama_user);
            txtPass.setText(vpass);
            cmbLvUser.setSelectedItem(vlev_user);
            enableForm();
            txtIdUSer.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");
        }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Method Mouse Pressed : "+e);
        }                        
    }//GEN-LAST:event_tblDataUserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbLvUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDataUser;
    private javax.swing.JTextField txtIdUSer;
    private javax.swing.JTextField txtNmUser;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        cmbLvUser.setSelectedIndex(0);
        txtIdUSer.setText("");
        txtNmUser.setText("");
        txtPass.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        cmbLvUser.setEnabled(false);
        txtPass.setEnabled(false);
        txtIdUSer.setEnabled(false);
        txtNmUser.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        cmbLvUser.setEnabled(true);
        txtPass.setEnabled(true);
//        txtIdUSer.setEnabled(true);
        txtNmUser.setEnabled(true);
        btnSimpan.setEnabled(true);        
    }
    
    @Override
    public void showDataTabel() {
         DefaultTableModel tableModelUser = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }            
        };
        tableModelUser.addColumn("ID. User");
        tableModelUser.addColumn("User Name");
        tableModelUser.addColumn("Password");        
        tableModelUser.addColumn("Lv. ser");
        
        //set judul Header
        tblDataUser.setModel(tableModelUser);
        
        try {
            _Cnn = null;
            _Cnn = getCnn.getConnection();
            sqlselect = "select * from tbuser order by iduser asc ;";            
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelUser.addRow(new Object[]{
                    res.getString("iduser"),
                    res.getString("user"),
                    res.getString("pass"),
                    res.getString("lvuser")                    
                });
                tblDataUser.setModel(tableModelUser);
//                tblDataUser.getColumnModel().getColumn(3).setPreferredWidth(100);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error metod showDataTabel() : "+e);
      }  
    }

    @Override
    public void aksiSimpan() {
        vid_user = txtIdUSer.getText();
        vnama_user = txtNmUser.getText();
        vpass = txtPass.getText();
        vlev_user = cmbLvUser.getSelectedItem().toString();
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbuser values ('"+vid_user+"', '"+vnama_user+"', '"+vpass+"', '"+vlev_user+"');";
        } else {
            sqlinsert = "update tbuser set user='"+vnama_user+"', pass='"+vpass+"',levuser='"+vlev_user+"'  where iduser='"+vid_user+"';";
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? ID. User : "+vid_user, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbuser where iduser='"+vid_user+"' ;";
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
