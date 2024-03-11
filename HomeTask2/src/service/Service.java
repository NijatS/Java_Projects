
package service;

public class Service {
    
    public int MinNumber(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        return num2;
    }
    
    public static float ReminderWeight(float weight1,float weight2){
        
        float remainder;
        if(weight1 < weight2){
            remainder = weight2 % weight1;
        }
        else{
           remainder = weight1 % weight2; 
        }
        return remainder;
    }
}
