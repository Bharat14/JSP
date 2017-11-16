
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhaunda
 */
public class Connectiondb {
    public static Connection getConnect(){
        Connection c = null;
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/HelloWorld";
            c=DriverManager.getConnection(url, "postgres", "admin");
        }catch(Exception e){
            System.out.println(e+"\n");
        }
            
        return c;
    }
    
    public static void main(String[] args) throws SQLException{
        Connection cDB = getConnect();
        if(cDB!=null){
            System.out.println("Hogaya connect \n");
            Statement st = null;
            String sql="Select * from public.\"User\"";    
            try{
                st=cDB.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    String Name = rs.getString("name");
                    String Roll = rs.getString("roll");
                    System.out.println(Name+"  "+Roll+"\n");
                }
            }catch(Exception e){
                System.out.println(e+"\n");
            }
        }
        cDB.close();
    }
    
}
