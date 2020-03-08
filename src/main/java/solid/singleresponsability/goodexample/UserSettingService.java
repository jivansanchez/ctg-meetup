package solid.singleresponsability.goodexample;

public class UserSettingService {

    public void changeEmail(String user)
    {
        if(SecurityService.checkAccess(user))
        {
            //Grant option to change
        }
    }

}
