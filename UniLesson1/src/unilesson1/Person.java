
package unilesson1;

public class Person {
    static int groupNumber ;
    int age ;
    String name;
    
    public Person(){
    }
    public Person(int age)
    {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }

}
