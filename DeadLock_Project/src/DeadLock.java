

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLock {
    
   private Lock lock1 = new ReentrantLock();
   private Lock lock2 = new ReentrantLock();
   
   private Account account1 = new Account();
   private Account account2 = new Account();
   private Random random = new Random();
           
   public void DeadLock_(Lock a , Lock b){
       
       boolean a_use = false;
       boolean b_use = false;
       
       while(true){
           a_use = a.tryLock();
           b_use = b.tryLock();
           
           if(a_use == true && b_use == true){
               return;
           }
           if(a_use == true){
               a.unlock();
           }
           if(b_use == true){
               b.unlock();
           }
       }
   }
   
   public void Thread1Func(){
   
       DeadLock_(lock1, lock2);
       for(int i = 0 ; i < 500 ; i++){
       Account.Transfer(account1, account2,random.nextInt(100));
       }
       
       lock1.unlock();
       lock2.unlock();
   }
   
   public void Thread2Func(){
       DeadLock_(lock1, lock2);
       for(int i = 0 ; i < 500 ; i++){
           Account.Transfer(account2, account1, random.nextInt(100));
       }
       
       lock2.unlock();
       lock1.unlock();
       
   }
   
    public void ThreadOver(){
        
        System.out.println("Account 1 : " + account1.getCount());
        System.out.println("Account 2 : " + account2.getCount());
        System.out.println("Total Count : " + (account1.getCount()+ account2.getCount()) );
    }
    
}
