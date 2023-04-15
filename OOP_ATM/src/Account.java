
public class Account {
    private String username ;
    private String parol ;
    private double count ;

    public Account(String username, String parol, double count) {
        this.username = username;
        this.parol = parol;
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
     * @return the parol
     */
    public String getParol() {
        return parol;
    }

    /**
     * @param parol the parol to set
     */
    public void setParol(String parol) {
        this.parol = parol;
    }

    /**
     * @return the account
     */
    public double getCount() {
        return count;
    }

    /**
     * @param count the account to set
     */
    public void setCount(double count) {
        this.count = count;
    }
    
    public void Adding (double amount){
        count += amount;
        System.out.println("New count : " + count);
    }
    public void Withdraw(double amount){
        if(count - amount < 0){
            System.out.println("There is not enough money in your count ");
            System.out.println("Your count : " + count);
        }
        else{
            count -= amount;
            System.out.println("Remaining count : " + count);
        }
    }
    
}
