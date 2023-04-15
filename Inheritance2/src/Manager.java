
public class Manager extends Worker{
    private int worker_amount;

    public Manager(String name, String surname, int salary, String phone_number , int worker_amount) {
        super(name, surname, salary, phone_number);
        this.worker_amount = worker_amount;
    }
    public void Showing(){
        super.Showing();
        System.out.println("Worker amount : " + worker_amount);
    }
    public void Extra(int extra ){
         System.out.println( getName() + " raise the salary : " + extra + "$");
    }
}
