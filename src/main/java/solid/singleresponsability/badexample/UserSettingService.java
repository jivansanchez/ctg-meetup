package solid.singleresponsability.badexample;

public class UserSettingService {

    //Esta clase rompe el Single Responsability principle porque esta clase tiene 2 responsabiloidades
    //permitir al usuario cambiar el email Y(AND) Verificar si el usuario tiene acceso y permisos para
    //cambiar el email
    public void changeEmail(String user)
    {
        if(checkAccess(user))
        {
            //Grant option to change
        }
    }

    public boolean checkAccess(String user)
    {
        //Verify if the user is valid.
        return false;
    }

}
