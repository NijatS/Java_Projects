
package entity;


public class Programmer extends Person {


    private String progLan;
    private int exp;
    
    public String getProgLan() {
        return progLan;
    }

    public void setProgLan(String progLan) {
        this.progLan = progLan;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString()+ ", progLan=" + progLan + ", exp=" + exp + '}';
    }
    public Programmer(int id){
        super(id);
    }
    
    @Override
    public void greeting() {
        System.out.println("Hello,I am Programmer");
    }
    
}
