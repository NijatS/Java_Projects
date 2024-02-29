
package hometask1.additional;

public class Account {
    private static final int accountPort = 166;
    public String accountNumber;
    int bankId ; 
   Account(){
       
   }
   public Account(String accountNumber,int bankId){
       this.accountNumber = accountNumber;
       this.bankId = bankId;
   }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", bankId=" + bankId + '}';
    }
   
}
