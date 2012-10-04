import java.util.*;


public class User extends Observable{

    private String username=null;
    private String password;
    private boolean loginstatus;


    public User(String username, String password)
    {

        this.username=username;
        this.password=password;
        this.loginstatus=false;
        addObserver(new LibraryUI());

    }

    public boolean isAuthentic(String username,String password)
    {
        return (username.equals(this.username) && password.equals(this.password));
    }

    public boolean isUsername(String username)
    {
        return username.equals(this.username);
    }

    public void setLoginstatusTrue()
    {
        this.loginstatus=true;

    }

    public boolean isLoginstatusTrue()
    {
        return loginstatus;
    }

    public boolean login(String username,String password)
    {
        if(isAuthentic(username,password) && !isLoginstatusTrue())
        {
            setLoginstatusTrue();

            notifyObservers();
            return true;
        }
        else
            return false;

    }

    public void notifyObservers()
    {
       /* LoginCommand login=new LoginCommand();
        login.update(this,username); */

        LibraryUI library=new LibraryUI();
        library.update(this,this);
    }

    public String returnUserName()
    {
        return username;
    }


}
