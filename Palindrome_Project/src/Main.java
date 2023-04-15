
import java.util.Scanner;
import java.util.Stack;


public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentence : " );
        String sentence = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < sentence.length()/2 ; i++){
            stack.push(sentence.charAt(i));
        }
        if(IsPalindrome(sentence, stack)){
            System.out.println("This sencente is palindrome..");
        }
        else{
            System.out.println("This sencente is not palindrome..");
            
        }
        
    }
    
    public static boolean IsPalindrome(String name , Stack<Character> stack){
       
      for(int i = (name.length()/2 + 1) ; i < name.length() ; i++ ){
          if(name.charAt(i)!= stack.pop()){
              return false;
          }
      }
      return true;
}
}
