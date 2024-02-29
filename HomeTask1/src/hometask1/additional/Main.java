
package hometask1.additional;

import hometask1.Person;

public class Main {
    
    public static void Main(String[] args){
        Person person = new Person();
        Person person2 = new Person("Nijat",20);
        System.out.println(person.toString());
        System.out.println(person2.toString());
 
        
        
        Account account = new Account();
        account.bankId = 1;
        account.accountNumber = "H3KDSA3";
        
        Account account1 = new Account("1H3HDK2",1);
        System.out.println(account.toString());
        System.out.println(account1.toString());
    }
}
