import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conection extends javax.swing.JFrame {
    public static final String URL = "jdbc:mysql://localhost:3306/rauf";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mysql";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
           
        } catch (Exception e) {
             e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage());
        }
        return con;
    }

    public java.sql.Connection getSistema() {
        
      
            return getConection(); 
        
      
    }
}
