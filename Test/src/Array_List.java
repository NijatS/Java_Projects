
import java.util.ArrayList;


public class Array_List {
     public static void main(String[] args) {
        
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("Nijat");
         arrayList.add("Soltanov");
         arrayList.add("Santafe");
         arrayList.add("Nijat");
        
         
         //arrayList.remove("Santafe");
         //arrayList.remove(2);
         arrayList.set(3, "662");
         for(int i = 0 ; i < arrayList.size() ; i ++){
             System.out.println(arrayList.get(i));
         }
         System.out.println(arrayList.indexOf("Nijat"));
         System.out.println(arrayList.lastIndexOf("Nijat"));
    }
}
