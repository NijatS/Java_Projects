
import java.util.Scanner;


public class Main {
        private static Card[][] card = new Card[4][4]; 
        
        
    public static void main(String[] args) {
       // Card[][] card = new Card[4][4];
        card[0][0] = new Card('A');
        card[0][1] = new Card('H');
        card[0][2] = new Card('D');
        card[0][3] = new Card('C');
        card[1][0] = new Card('J');
        card[1][1] = new Card('F');
        card[1][2] = new Card('H');
        card[1][3] = new Card('B');
        card[2][0] = new Card('A');
        card[2][1] = new Card('B');
        card[2][2] = new Card('F');
        card[2][3] = new Card('D');
        card[3][0] = new Card('E');
        card[3][1] = new Card('J');
        card[3][2] = new Card('C');
        card[3][3] = new Card('E');
        //game_table();
         while(finising() == false){
             game_table();
             do_predection();
         }
        
        
    }
    
    public static boolean finising(){
       for(int i = 0 ; i<4 ; i++) {
           for(int j = 0 ; j < 4 ; j++){
               if(card[i][j].isPrediction() == false){
                   return false;
               }
               }
           }
       return true;
       }
    public static void do_predection(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first prediction (i and j) : " );
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        card[i1][j1].setPrediction(true);
        game_table();
                System.out.print("Enter second prediction (i and j) : " );
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if(card[i1][j1].getValue() == card[i2][j2].getValue()){
            card[i2][j2].setPrediction(true);
        }
        else{
            card[i1][j1].setPrediction(false);
        }
        
    }

        public static void game_table(){
            for(int i = 0; i < 4 ; i ++){
                for (int j = 0 ; j < 4 ; j++){
                    if(card[i][j].isPrediction()){
                        System.out.print("|"+ card[i][j].getValue() + "| ");
                    }
                    else{
                        System.out.print("| | "  );
                    }
                }
                System.out.println("");
            }
        }
        

        
    }

