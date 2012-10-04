
import junit.framework.TestCase;
import org.junit.*;

public class UserTest extends TestCase{

    User user=new User("111-1112","1234");


    @Test
    public void testIsUserAuthenticSuccess()
    {
        Assert.assertEquals(true,user.isAuthentic("111-1112","1234"));
    }

    @Test
    public void testIsUserAuthenticFaliure()
    {
        Assert.assertEquals(false,user.isAuthentic("111-1112","123"));
        Assert.assertEquals(false,user.isAuthentic("111-1116","123"));
    }

    @Test
    public void testisUsernameSuccess()
    {
        Assert.assertEquals(true,user.isUsername("111-1112"));
    }

    @Test
    public void testisUsernameFailure()
    {
        Assert.assertEquals(false,user.isUsername("111-1116"));
    }

    @Test
    public void testsetLoginstatusTrue()
    {
        user.setLoginstatusTrue();
        Assert.assertEquals(true, user.isLoginstatusTrue());
    }

    @Test
    public void testLoginSuccess()
    {
        Assert.assertEquals(true,user.login("111-1112","1234"));

    }

    @Test
    public void testLoginFailure()
    {
        Assert.assertEquals(false,user.login("111-1112","123"));
    }

    @Test
    public void testNotification()
    {
        user.notifyObservers("111-1112");
        Assert.assertEquals("111-1112",LoginCommand.currentUserName);
    }

    


}
