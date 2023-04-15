
import java.util.ArrayList;


public class functions {
     
    private ArrayList<String> arrayList = new ArrayList<>();
    
    public void showing_musician(){
        System.out.println("Musician list consists of " + arrayList.size() + " members:");
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println((i+1) + " : " + arrayList.get(i));
        }
    }
    public void adding_musician(String name){
        arrayList.add(name);
        System.out.println("New member : " + name + " is added...");
    }
    public void upload_musician(String name , int index){
        arrayList.set(index, name);
        System.out.println("List of musician is uploaded...");
                
    }    
    public void remove_musician(int index){
        String name = arrayList.get(index);
        arrayList.remove(name);
        System.out.println("Musician " + name + " is removed...");
    }
    public void finding_musician(String name){
        int index  = arrayList.indexOf(name);
        if( index >= 0){
            System.out.println("Musician " + name + " index is " + (1 + index) ); 
        }
        else{
            System.out.println("This musician is not finded...");
        }
    }
}
