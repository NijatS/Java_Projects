
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter sentence : ");
        String sentence = scanner.nextLine();
        
        Map<Character,Integer> map1 = new TreeMap<Character,Integer>();
        
        for(int i = 0 ; i < sentence.length() ; i++){
           char c = sentence.charAt(i);
           if(map1.containsKey(c)){
               map1.replace(c, map1.get(c)+1);
    }
           else{
               map1.put(c, 1);
           }
}
        
        for(Map.Entry<Character,Integer> m : map1.entrySet()){
            System.out.println("Character : "+ m.getKey() + "    Amount : " + m.getValue());
        }
    }
}
