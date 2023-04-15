
public class Account {
     private String username;
     private String password;
     private double count;

    public Account(String username, String password, double count) {
        this.username = username;
        this.password = password;
        this.count = count;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the count
     */
    public double getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(double count) {
        this.count = count;
    }
    public void Adding(double amount){
        count += amount;
        System.out.println("Your count : " + count);
    }
    public void Withdraw(double amount){
        if(count - amount < 0){
            System.out.println("There is not enough money in your count "
                    + "Your count : 0" + count);
        }
        else{
            count -= amount;
            System.out.println("Remaining count : " + count);
        }
    }
}
