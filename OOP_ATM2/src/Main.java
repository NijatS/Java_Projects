
public class Main {
    public static void main(String[] args) {
       
    ATM atm = new ATM();
    Account account = new  Account("admin", "admin", 1500);
    atm.work(account);
        System.out.println("Exiting the Program ...");
}
}
