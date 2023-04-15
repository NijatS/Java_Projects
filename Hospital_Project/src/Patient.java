
public class Patient implements Comparable<Patient>{
    
    private String ad;
    private String xestelik;
    private int derece;

    public Patient(String ad, String xestelik) {
        this.ad = ad;
        this.xestelik = xestelik;
        
        if(xestelik.equals("Apendisit")){
            this.derece = 3;
        }
        else if(xestelik.equals("Yaniq")){
            this.derece = 2;
            
        }
        else{
            this.derece = 1;
        }
    }

    @Override
    public String toString() {
        
        String info = "Patient : " + this.ad
                +"\nXestelik : " + this.xestelik
                +"\nDerece : " + this.derece;
        return info;
        
    }

    @Override
    public int compareTo(Patient patient) {
        
        if(this.derece > patient.derece){
            return -1;
        }
        else if(this.derece < patient.derece){
            return 1;
        }
        else{
            return 0;
        }
    }
            
}
