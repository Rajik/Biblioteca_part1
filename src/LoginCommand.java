import java.util.Observable;
import java.util.*;

public class LoginCommand extends Command
{

    public LoginCommand(Console console)
    {
        this.console=console;
    }

    public void execute()
    {
        UsersDB usersDB=new UsersDB();
        console.print("Enter username:");
        String username=console.read();
        console.print("Enter password:");
        String password=console.read();

        boolean output=false;
        User user=usersDB.findUserbyName(username);

        if(user==null)
            console.print("Wrong username/password!!\n");
        else
        {
            output=user.login(username,password);
            if(output)
            {
                console.print("Login Successful !!\n");
                currentUserName=user.returnUserName();
            }

            else
                console.print("Wrong username/password!!\n");
        }

    }


}
