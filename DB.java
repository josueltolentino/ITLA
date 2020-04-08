
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DB {

  private static String db ="contactos";  
  private static String user ="root";
  private static String pass ="";
  private static String url ="jdbc:mysql://localhost/"+db;
  private static Connection conn;
  
  public static Connection getConnect(){
      
      try{
          
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(url, user, pass);
          
          
      }catch(Exception e){
          
          JOptionPane.showMessageDialog(null, "Error: "+ e.getMessage());
          
      }
      
      return conn;
  }
  
  
}
