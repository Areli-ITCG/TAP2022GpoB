/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemconexion;
import java.sql.*;
/**
 *
 * @author areli
 */
public class EjemConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          PreparedStatement stmt = null;
          ResultSet rs = null;
        try {
         String connectionUrl = "jdbc:sqlserver://localhost:1433;database=BDSI;user=sa; "
                 + "password = 1234;encrypt=true;trustServerCertificate=true;";
         Connection conect = DriverManager.getConnection(connectionUrl);
         System.out.println("Conectado.");
         stmt = conect.prepareStatement("SELECT * FROM usuarios");
         rs = stmt.executeQuery();
         
         while(rs.next()) {
            for (int x=1;x<=rs.getMetaData().getColumnCount();x++)
                 System.out.print(rs.getString(x)+ "\t");
            System.out.println("");
}          } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        }  
    }
    
}
