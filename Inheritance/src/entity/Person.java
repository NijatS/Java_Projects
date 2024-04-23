
package entity;

public class Person extends Human {

    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", age=" + age ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Person(int id){
        this.id = id;
    }
    
    public void greeting(){
        System.out.println("Hello,I am Person");
    }

    @Override
    public void PerformTask() {
        System.out.println("Task done by person");
    }
}
