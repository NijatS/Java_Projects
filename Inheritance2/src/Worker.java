
public class Worker {
    
    private String name;
    private String surname;
    private int salary ;
    private String phone_number;

    public Worker(String name, String surname, int salary, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.phone_number = phone_number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
           public void Showing(){
               System.out.println("Name : " + name);
               System.out.println("Surname : " + surname);
               System.out.println("Salary : " + salary + "$");
               System.out.println("Phone Number : " + phone_number);
           }
}
