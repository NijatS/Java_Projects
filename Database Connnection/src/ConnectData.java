

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectData {

    private Connection con = null;
    
    private PreparedStatement preparedStatement = null;
    
    public void showDataPrepared(int id){
        
        try {
            preparedStatement = con.prepareStatement("Select * From cars where id > ? and officeID = 3");
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                int year = rs.getInt("carYear");
                
                System.out.println("Brand : " +brand + ", Model : " + model + ", Year : " + year);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    public void showData(){
        
        try {
            Statement statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery("Select * From cars");
            
            while(rs.next()){
                
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                int year = rs.getInt("carYear");
                
                System.out.println("Brand : " +brand + ", Model : " + model + ", Year : " + year);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void addData(){
        try {
            Statement statement = con.createStatement();
            
            String brand = "Hyundai";
            String model = "Santafe";
            int year = 2008;
            int officeID = 3;
            String carType = "suv";
            int quantityDoor = 4;
            
            statement.executeUpdate("insert into cars(brand,model,carYear,officeID,carType,quantityDoor) values(" + "'" + 
                    brand + "'," + "'" + model + "',"  + year + "," + "" + officeID + "," + "'" + carType + "'," + "" + quantityDoor + ")" );
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void updateData(){
        
        
        try {
            Statement statement = con.createStatement();
            
            
            statement.executeUpdate("Update cars Set model = 'Defender' where id = 3");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ConnectData() {
        
        try {
                   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carms", "root", "nicat1966");
            System.out.println("Connection Successfully\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
           //ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("Everything is okay..");
    }
    
    public static void main(String[] args) {

        ConnectData cd = new ConnectData();
       /* cd.showData();
       // cd.addData();
       cd.updateData();
        System.out.println("**********************************");
        cd.showData();*/
       
       cd.showDataPrepared(2);
        
        
    }
      
}
