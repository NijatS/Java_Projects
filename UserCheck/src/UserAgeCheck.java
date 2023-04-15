
public class UserAgeCheck implements IUserCheck{

    @Override
    public boolean Checkuser(User user) {
        if(user.getAge() >= 18 && user.getName().endsWith("at")){
            return true;
        }
        return false;
        }
    

    }

