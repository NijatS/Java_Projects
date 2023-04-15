
public class Supervisior  extends Worker{
    private  String city;
    public Supervisior(String name , int salary , String Department , String city) {
        super(name,salary,Department );
        this.city = city;
        
    }
    public void showing(){
        super.showing();
        System.out.println("City : " + city);
    }
}
