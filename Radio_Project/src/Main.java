
public class Main {
    
    public static void main(String[] args) {
        
        String[] channels = {"106 FM","Burc FM","Sabah FM","105 FM","106.3 FM"};
        
        Radio radio = new Radio(channels);
        
        for(String s : channels){
            System.out.println(s);
        }
    }
}
