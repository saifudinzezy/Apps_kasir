package aksi;

import Tool.KoneksiDB;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

public class AutoIncrement {
    KoneksiDB getCnn = new KoneksiDB();
    Connection _Cnn;
    private String namaTabel;
    private JTextField txtField;

    public AutoIncrement(String namaTabel, JTextField textField) {
        this.namaTabel = namaTabel;
        this.txtField = textField;
    }
             
     public void autoNumber(String kdrow){
          
        try{            
           _Cnn = null;
           _Cnn = getCnn.getConnection();    
           String sql = "select max("+kdrow+") from "+namaTabel+" ";
           Statement stat = _Cnn.createStatement();
           ResultSet res = stat.executeQuery(sql);                                       
            while (res.next()){
                int a = res.getInt(1);
                txtField.setText(""+ Integer.toString(a+1));
            }
        }catch (SQLException e){
            System.out.println(""+ e.getMessage());
        }
     }
}
