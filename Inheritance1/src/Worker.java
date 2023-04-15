public class Worker {
    private  String name ;
    private int salary;
    private String Department;

    public Worker(String name, int salary, String Department) {
        this.name = name;
        this.salary = salary;
        this.Department = Department;
    }
    public void showing(){
        System.out.println("Name of Worker : "  + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + Department);
    }
}
