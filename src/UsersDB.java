import java.util.*;

public class UsersDB {
    ArrayList<User> users = new ArrayList<User>();

    public UsersDB()
    {
        users.add(new User("111-1111","123"));
        users.add(new User("111-1112","1234"));
        users.add(new User("111-1113","abdul"));

    }

    public User findUserbyName(String username)
    {
        Iterator<User> iterator=users.iterator();
        while(iterator.hasNext())
        {
            User u=iterator.next();
            if(u.isUsername(username))
                return u;
        }
        return null;

    }



    }


