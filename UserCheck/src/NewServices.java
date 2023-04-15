
public class NewServices implements IUserCheck{

    @Override
    public boolean Checkuser(User user) {
                if(user.getAge() >= 18 && user.getName().endsWith("jat")){
            return true;
        }
        return false;
    }
    }




