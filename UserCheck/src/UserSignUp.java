
public class UserSignUp {
    
    private IUserCheck iUserCheck;

    public UserSignUp(IUserCheck iUserCheck) {
        this.iUserCheck = iUserCheck;
    }
    
    public void usercheckend(User user){
        if(iUserCheck.Checkuser(user) == true){
            System.out.println(user.getName() + " : Signed Up  ");
        }
        else{
            System.out.println(user.getName() + " : Error....");
        }
    }
}
