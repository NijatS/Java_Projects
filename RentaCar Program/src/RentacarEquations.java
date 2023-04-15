import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RentacarEquations {
     private Connection con = null;
     private PreparedStatement preparedstatement = null;
     private Statement statement = null;
     public RentacarEquations(){
          Database data = new Database();
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           // "jdbc:mysql://localhost:3306/carms"
            con = DriverManager.getConnection("jdbc:mysql://" + data.host + ":" + data.port + "/" + data.db_name,data.username,data.password);
            
           // System.out.println("Connection Successfully\n");
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     }
     public ArrayList<Car> insertCars(){
         ArrayList<Car> result = new ArrayList<Car>();
         
         try {
             
             statement = con.createStatement();
             
             ResultSet rs = statement.executeQuery("Select * from cars");
             
             while(rs.next()){
                 int id = rs.getInt("id");
                 String make = rs.getString("make");
                 String brand = rs.getString("brand");
                 String model = rs.getString("model");
                 String plate = rs.getString("plate");
                 int year = rs.getInt("carYear");
                 String type = rs.getString("carType");
                 int price = rs.getInt("dailyPrice");
                 boolean atCustomer = rs.getBoolean("atCustomer");
                 
                 result.add(new Car(id,make,brand,model,plate,year,type,price,atCustomer));
                 
                 
             }
             
              return result;
         } catch (SQLException ex) {
             Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         return (result = null);
         
     }
     
     public void addCar(String make,String brand,String model,String plate,int year,String type,int price,boolean atCustomer){
         
         try {
             preparedstatement = con.prepareStatement("insert into cars(make,brand,model,plate,carYear,carType,dailyPrice,atCustomer) values (?,?,?,?,?,?,?,?)");
             
             preparedstatement.setString(1,make);
             preparedstatement.setString(2,brand);
             preparedstatement.setString(3,model);
             preparedstatement.setString(4,plate);
             preparedstatement.setInt(5, year);
             preparedstatement.setString(6,type);
             preparedstatement.setInt(7, price);
             preparedstatement.setBoolean(8, atCustomer);
             
             preparedstatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
         }
          
     }
     public void deleteCar(int id){
         try {
             preparedstatement = con.prepareStatement("Delete from cars where id = ?");
             
             preparedstatement.setInt(1, id);
             
             preparedstatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     
     public void updateCar(int id ,String brand , String make, String model,String plate,int year,String type,int price,boolean atCustomer){
         
         try {
             preparedstatement = con.prepareStatement("Update cars set make = ? ,brand = ? , model = ? , plate = ? , carYear = ? , carType = ? ,dailyPrice = ?,atCustomer = ? where id = ?");
            
             preparedstatement.setString(2, brand);
             preparedstatement.setString(1, make);
             preparedstatement.setString(3, model);
             preparedstatement.setString(4, plate);
             preparedstatement.setInt(5, year);
             preparedstatement.setString(6, type);
             preparedstatement.setInt(7, price);
             preparedstatement.setInt(9, id);
             preparedstatement.setBoolean(8, atCustomer);
             
             preparedstatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
       
     }
     public boolean userCheck(String username , String password){
         
         try {
             preparedstatement = con.prepareStatement("Select * from users where username = ? and password  = ?");
             
             //preparedstatement.setString(1, table_name);
             preparedstatement.setString(1, username);
             preparedstatement.setString(2, password);
            
             
             ResultSet rs = preparedstatement.executeQuery();
             
             return rs.next();
         } catch (SQLException ex) {
             Logger.getLogger(RentacarEquations.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return false;
         
         
     }
     public static void main(String[] args) {
        
         RentacarEquations rq = new RentacarEquations();
    }
}
