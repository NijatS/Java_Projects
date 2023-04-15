
public class Account {
    private int count = 20000;
    
    public void AddingMoney(int amount){
        
        count += amount;
    }
    public void WithdrawMoney(int amount){
        
        count -= amount;
    }
     
    public static void Transfer(Account account1 , Account account2, int amount){
        
        account1.WithdrawMoney(amount);
        account2.AddingMoney(amount);
        
    }
   

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
