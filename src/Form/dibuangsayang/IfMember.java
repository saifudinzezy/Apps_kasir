package Form.dibuangsayang;

import Tool.KoneksiDB;
import aksi.AllAksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IfMember extends javax.swing.JInternalFrame implements AllAksi{
     KoneksiDB getCnn = new KoneksiDB();
     
    Connection _Cnn;
    String sqlselect, sqlinsert, sqldelete;
    String vkdmbr, vnmmember, valamat, vtlp;
    
    public IfMember() {
        initComponents();
        formTengah();
        clearForm();
        disableForm();        
        showDataTabel();  
        autoNumber();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNoTlp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtKdPlg = new javax.swing.JTextField();
        txtNmMember = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMember = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle(".: Form Member");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Input Data"));
        jPanel1.setOpaque(false);

        txtNoTlp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "No. Telephone  :"));
        txtNoTlp.setOpaque(false);

        txtAlamat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Alamat :"));
        txtAlamat.setOpaque(false);

        txtKdPlg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KD. Pelanggan :"));
        txtKdPlg.setOpaque(false);

        txtNmMember.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama Member :"));
        txtNmMember.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKdPlg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNmMember)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdPlg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNmMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tabel Data Member : Klik 2x untuk mengubah/menghapus"));

        tblDataMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "KD. Plg", "Nama Member", "No. tlp", "Alamat"
            }
        ));
        tblDataMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataMemberMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataMember);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Form Member");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mengolah data member");

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
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        enableForm();
        clearForm();
        txtKdPlg.requestFocus(true);
        autoNumber();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtKdPlg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "KD. Member belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtNmMember.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nama Member belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtAlamat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Alamat belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if(txtNoTlp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No. Telepon belum diisi!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiSimpan();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtKdPlg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data yang akan dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            aksiHapus();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblDataMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMemberMousePressed
        try {
         if (evt.getClickCount() == 2) {
            //membuat variabeluntuk menampung nilai tbDataUser
            int brs = tblDataMember.getSelectedRow();
            //mengambil nilaidari tabel berdasarkan index row dimulai dari nol
            vkdmbr = tblDataMember.getValueAt(brs, 0).toString();
            vnmmember = tblDataMember.getValueAt(brs, 1).toString();
            valamat = tblDataMember.getValueAt(brs, 2).toString();
            vtlp = tblDataMember.getValueAt(brs, 3).toString();
            //mengisi textfield dengan nilai variabel
            txtKdPlg.setText(vkdmbr);
            txtNmMember.setText(vnmmember);
            txtAlamat.setText(valamat);
            txtNoTlp.setText(vtlp);
            enableForm();
            txtKdPlg.setEnabled(false);
            btnHapus.setEnabled(true);
            btnSimpan.setText("Ubah");
        }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Method Mouse Pressed : "+e);
        }       
    }//GEN-LAST:event_tblDataMemberMousePressed


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
    private javax.swing.JTable tblDataMember;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKdPlg;
    private javax.swing.JTextField txtNmMember;
    private javax.swing.JTextField txtNoTlp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearForm() {
        txtAlamat.setText("");
        txtKdPlg.setText("");
        txtNmMember.setText("");
        txtNoTlp.setText("");
        btnSimpan.setText("Simpan");
    }

    @Override
    public void disableForm() {
        txtAlamat.setEnabled(false);
        txtKdPlg.setEnabled(false);
        txtNmMember.setEditable(false);
        txtNoTlp.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    @Override
    public void enableForm() {
        txtAlamat.setEnabled(true);
        //txtKdPlg.setEnabled(true);
        txtNmMember.setEditable(true);
        txtNoTlp.setEnabled(true);
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
        
        tableModelSup.addColumn("KD. Plg");
        tableModelSup.addColumn("Nama Plg");
        tableModelSup.addColumn("Alamat");
        tableModelSup.addColumn("No. Tlp");
        
        tblDataMember.setModel(tableModelSup);
        
        try {
           _Cnn = null;
           _Cnn = getCnn.getConnection();
           sqlselect = "select * from tbmember order by kdplg asc;";
            Statement stat = _Cnn.createStatement();
            ResultSet res = stat.executeQuery(sqlselect);
            while (res.next()) {                
                tableModelSup.addRow(new Object[]{
                    res.getString("kdplg"),
                    res.getString("nm_plg"),
                    res.getString("alamat"),
                    res.getString("tlp")
                });
             tblDataMember.setModel(tableModelSup);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error methode showDataTabel()"+e);
        }
    }

    @Override
    public void aksiSimpan() {
       vkdmbr = txtKdPlg.getText();
       vnmmember = txtNmMember.getText();
       valamat = txtAlamat.getText();
       vtlp = txtNoTlp.getText();
        if (btnSimpan.getText().equals("Simpan")) {
            sqlinsert = "insert into tbmember values('"+vkdmbr+"', '"+vnmmember+"', '"+valamat+"', '"+vtlp+"');";
        }else{
            sqlinsert = "UPDATE tbmember SET nm_plg='"+vnmmember+"', alamat='"+valamat+"', tlp='"+vtlp+"' where kdplg='"+vkdmbr+"';;";            
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
        int jawab = JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ini? KD. Supplier : "+vkdmbr, "Informasi",
        JOptionPane.YES_NO_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            try {
                _Cnn = null;
                _Cnn = getCnn.getConnection();
                sqldelete = "delete from tbmember where kdplg='"+vkdmbr+"' ;";
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
    
    private void autoNumber(){
          
        try{            
           _Cnn = null;
           _Cnn = getCnn.getConnection();    
           String sql = "select max(kdplg) from tbmember";
           Statement stat = _Cnn.createStatement();
           ResultSet res = stat.executeQuery(sql);                                       
            while (res.next()){
                int a = res.getInt(1);
                txtKdPlg.setText(""+ Integer.toString(a+1));
            }
        }catch (SQLException e){
            System.out.println(""+ e.getMessage());
        }
    }
}
