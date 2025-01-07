/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;


import java.sql.*; 
import DB.Credenciales;
/**
 *
 * @author x4mv
 */
public class ConnectDB {  
    
    static Credenciales credenciales_db = new Credenciales();
    
    static String bd = credenciales_db.getDB();
    
    public static void main(String args[]){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3308/" + bd ,"root","root");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }  
}  