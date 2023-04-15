
import java.io.Serializable;


public class Student implements Serializable{
    private String name;
    private int id;
    private String profession;

    public Student(String name, int id, String profession) {
        this.name = name;
        this.id = id;
        this.profession = profession;
    }

    @Override
    public String toString() {
       String student_inf = "Student Name : " + name+"\n"+
               "ID : " + id + "\n"+
               "Profession : " + profession;
       
       return student_inf;
    }
    
    
}
