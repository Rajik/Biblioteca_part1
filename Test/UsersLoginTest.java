import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Krinax
 * Date: 9/24/12
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class UsersLoginTest extends TestCase {
    static UsersDB usersLogin=new UsersDB();

    public void testFindUserSuccess() throws Exception {


        Assert.assertEquals(true,usersLogin.findUserbyName("111-1112").isUsername("111-1112"));


    }

    public void testLoginFailure() throws Exception {

        Assert.assertEquals(null,usersLogin.findUserbyName("111-1119"));


    }
}
