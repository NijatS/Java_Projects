
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CommitRollBack {
    
    private Connection con = null;
    private Statement statement = null;
    
    
    public CommitRollBack(){
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carms", "root", "nicat1966");
            
            System.out.println("Connection Successfully\n");
                    
                    
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void  CommitUse(){
        Scanner scanner = new Scanner(System.in);
        try {
            con.setAutoCommit(false);
            System.out.println("Before Updating :");
        
        showData();
        
        System.out.println("******************");
        
        
       
            statement = con.createStatement();
            
            statement.executeUpdate("Update cars Set model = 'E39'  where id = 2 ");
            
            String brand = "Lada";
            String model = "2107";
            int year = 1994;
            int officeID = 2;
            String carType = "sedan";
            int quantityDoor = 4;
            
            statement.executeUpdate("insert into cars(brand,model,carYear,officeID,carType,quantityDoor) values(" + "'" + 
                    brand + "'," + "'" + model + "',"  + year + "," + "" + officeID + "," + "'" + carType + "'," + "" + quantityDoor + ")" );
            
            System.out.print("Do you want to update the table(yes or no) : ");
            String answer = scanner.nextLine();
            
            
            if(answer.equals("yes")){
                con.commit();
                System.out.println("After Updating : ");
                showData();
                
            }
            else{
                con.rollback();
                
                System.out.println("No Updating : ");
                showData();
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommitRollBack.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
       
        
        
        
        
        
    
    
    public static void main(String[] args) {
        
        CommitRollBack cr = new CommitRollBack();
        
        cr.CommitUse();
    }
    
    
}
