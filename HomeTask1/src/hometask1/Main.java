
package hometask1;

import hometask1.additional.Account;

public class Main {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        //person1.age = 20;
        person1.name = "Nijat";
        
        System.out.println(person1.toString());
        
        Person person2 = new Person("Nihad",19);
        System.out.println(person2.toString());
        
        
        
        Account account1 = new Account("1H3HDK2",1);
        System.out.println(account1.toString());
        
        //Account account2 = new Account();//because of access modifiers
    }
    
}
