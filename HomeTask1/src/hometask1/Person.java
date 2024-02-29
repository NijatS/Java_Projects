
package hometask1;

public class Person {
    public static String country;
    String name;
    private int age;

    
    
    public Person(){
        this.country = "Azerbaijan";
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
