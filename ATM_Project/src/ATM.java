
import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("***************");
        System.out.println("1. Hesabdaki mebleg");
        System.out.println("2. Hesabdan cixaris");
        System.out.println("3. Hesaba elave");
        System.out.println("4. Cixis ucun e basin");
        System.out.println("****************");
        
       int hesab=1200;
      
       while(true){
           System.out.print("Addimi daxil edin : ");
           String addim=scan.nextLine();
           
           if(addim.equals("e")){
               System.out.println("Sistemden cixilir....");
               break;
           }
           else if(addim.equals("1")){
               System.out.println("Hesab : " + hesab);
           }
           else if(addim.equals("2")){
               System.out.print("Cixarilacaq mebleg : ");
               int cixilacaq_mebleg = scan.nextInt();
               scan.nextLine();
               if(hesab - cixilacaq_mebleg < 0){
                   System.out.println("Hesabda kifayet qeder mebleg yoxdu..");
           }
               else{
                   hesab-= cixilacaq_mebleg;
                   System.out.println("Hesabda qalan mebleg : " + hesab);
               }
           }
           else if(addim.equals("3")){
               System.out.print("Elave edilecek mebleg : ");
               int elave_mebleg = scan.nextInt();
               scan.nextLine();
               System.out.println("Cari Hesab : " + (hesab+elave_mebleg));
           }
           else{
               System.out.println("Yanlis addim..");
           }
           
               
    }
}
}

