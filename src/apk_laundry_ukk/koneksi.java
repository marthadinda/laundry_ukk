package apk_laundry_ukk;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url = "jdbc:mysql://localhost/laundry_ukk";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username, password);
                    System.out.println( "koneksi okes berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon() {
        Connection con = null;
        try{
            //Lakukan inisialisasi dan pengambilan koneksi ke database di sini
            con = DriverManager.getConnection("jdbc:mysql://localhost/laundry_ukk", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}