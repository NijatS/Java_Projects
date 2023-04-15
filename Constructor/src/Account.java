

public class Account {
    
    private int account_number;
    private String name_surname ;
    private double hesab;
    private int phone_number;
    private String email;

    public void Adding(double adding) {
     hesab +=adding;
        System.out.println("Your count : " + hesab);
}
    public void Withdraw (double number){
     if(number > 1500){   
         System.out.println("1500 is not possible ...");
         
    }
     if(hesab - number < 0){
         System.out.println("There is not enough money in your account ...");
         System.out.println("Your account : " + hesab);
     }
     else{
         hesab-=number;
         System.out.println("Your account : " + hesab);
     }
     
    /**
     * @return the account_number
     */
    }
    public void display(){
        System.out.println("Account Number : " + account_number);
        System.out.println("Name and Surname : " + name_surname);
        System.out.println("Hesab : "+ hesab);
        System.out.println("Phone Number : " + phone_number);
        System.out.println("Email : " + email);
    }
    public Account(int account_number ,String name_surname , double hesab , int phone_number , String email ){
        this.account_number = account_number;
        this.email = email;
        this.hesab = hesab;
        this.name_surname = name_surname;
        this.phone_number = phone_number;
        
    }
    public Account(){
        this(237283723,"Nijat Soltanov", 1500,706139013,"nijatsoltanli03@mail.ru");
    }
    public Account(String name_surname , double hesab , int phone_number){
        this(0, name_surname, hesab, phone_number,"No Information");
    }
    public int getAccount_number() {
        return account_number;
    }

    /**
     * @param account_number the account_number to set
     */
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    /**
     * @return the name_surname
     */
    public String getName_surname() {
        return name_surname;
    }

    /**
     * @param name_surname the name_surname to set
     */
    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    /**
     * @return the 
     */
    public double getHesab() {
        return hesab;
    }

    /**
     * @param hesab the hesab to set
     */
    public void setHesab(double hesab) {
        this.hesab = hesab;
    }

    /**
     * @return the phone_number
     */
    public int getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
