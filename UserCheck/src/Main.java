
public class Main {
    public static void main(String[] args) {
         UserSignUp userSignUp = new UserSignUp(new NewServices());
         userSignUp.usercheckend(new User("Nicat", 19,"123123234"));
         userSignUp.usercheckend(new User("Nijat", 19 , "1223124"));
        
    }
}
