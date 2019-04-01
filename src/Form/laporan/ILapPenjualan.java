package Form.laporan;

import Tool.Cetak;
import Tool.KoneksiDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ILapPenjualan extends javax.swing.JInternalFrame {
    KoneksiDB getCnn = new KoneksiDB();     
    Connection _Cnn;

    public ILapPenjualan() {
        initComponents();
        
        formTengah();
    }
    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbBulan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(".::Form Laporan Penjualan");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings-1.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bag.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Laporan Penjualan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Form ini digunkan untuk mencetak data penjualan");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cetak Laporan"));

        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "OKteober", "November", "Desember" }));
        cmbBulan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Bulan :"));
        cmbBulan.setOpaque(false);
        cmbBulan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbBulanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbBulanMouseReleased(evt);
            }
        });
        cmbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBulanActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/print_preview.png"))); // NOI18N
        jButton1.setText("Cetak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int bulan = 0;
       bulan  = (int) cmbBulan.getSelectedIndex();
       switch (bulan){
           case 1 :
                try {
                new Cetak("./laporan/bulanpen/LapPenjualanJan.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 2 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanFeb.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 3 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanMart.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 4 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanApr.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 5 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanMei.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 6 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanJuni.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 7 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanJuli.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 8 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanAgust.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 9 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanSept.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 10 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanOkt.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 11 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanNov.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          case 12 :
              try {
                new Cetak("./laporan/bulanpen/LapPenjualanDes.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
          break; //end
          default:
             try {
                new Cetak("./laporan/LapPenjualan.jasper");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }       
            
              break;
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbBulanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbBulanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBulanMousePressed

    private void cmbBulanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbBulanMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBulanMouseReleased
    
    private void cmbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBulanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
