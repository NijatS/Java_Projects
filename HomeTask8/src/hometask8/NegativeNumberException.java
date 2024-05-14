
package hometask8;

public class NegativeNumberException extends Exception {

    @Override
    public String getMessage() {
        return "Number cannot be negative"; 
    }
    
}
