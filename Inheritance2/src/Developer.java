
public class Developer extends Worker{
    
    private String language;

    public Developer(String name, String surname, int salary, String phone_number , String language) {
        super(name, surname, salary, phone_number);
        this.language = language;
    }
    public void Showing(){
    super.Showing();
        System.out.println("Languages : " + language);
}
     public void OS(String os){
         System.out.println(getName() + " develop in this Operating System : " + os);
     }
}
