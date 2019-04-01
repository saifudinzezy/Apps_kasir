package Tool;

import Form.laporan.ILapPenjualan;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

public class Cetak {
    KoneksiDB getCnn = new KoneksiDB();   
    Connection _Cnn;
    
    public Cetak(String namaReport){
        try {
            //koneksi ke db
            _Cnn = getCnn.getConnection();
            
            File report_file = new File(namaReport);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, _Cnn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Cetak(String rootReport, String paramBulan, String paramTahun){
        try
               {
//                    _Cnn = null;
//                    _Cnn = getCnn.getConnection();
//                   String NamaFile = "laporan/LapPenjualanParam.jasper"; //Lokasi File jasper   
                    //koneksi ke db
                  _Cnn = getCnn.getConnection();
                  HashMap hash = new HashMap();
                   //Mengambil parameter dari ireport
                  hash.put("bulan",paramBulan);                  
                  hash.put("tahun",paramTahun);                  
                  
                  File file = new File(rootReport);
                  JasperReport jReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
                  JasperPrint jasperPrint = JasperFillManager.fillReport(jReport, hash,_Cnn);
                  JasperViewer.viewReport(jasperPrint, false);
               }catch (SQLException ex) {
            Logger.getLogger(ILapPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(ILapPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public Cetak(String rootReport, String paramTahun){
        try
               {
                    //koneksi ke db
                  _Cnn = getCnn.getConnection();
                  HashMap hash = new HashMap();
                   //Mengambil parameter dari ireport
//                  hash.put("bulan",paramBulan);                  
                  hash.put("tahun",paramTahun);                  
                  
                  File file = new File(rootReport);
                  JasperReport jReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
                  JasperPrint jasperPrint = JasperFillManager.fillReport(jReport, hash,_Cnn);
                  JasperViewer.viewReport(jasperPrint, false);
               }catch (SQLException ex) {
            Logger.getLogger(ILapPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(ILapPenjualan.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
