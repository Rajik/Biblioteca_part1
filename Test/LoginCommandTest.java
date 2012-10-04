import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Krinax
 * Date: 9/24/12
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginCommandTest extends TestCase {



    public void testexecuteFailure() throws Exception {
        WrongLogin fakeConsole=new WrongLogin();
        LoginCommand loginCommand=new LoginCommand(fakeConsole);

        loginCommand.execute();
        Assert.assertEquals("Wrong username/password!!\n",fakeConsole.isPrinted());

    }

    public void testexecuteSuccess() throws Exception {
        CorrectLogin fakeConsole=new CorrectLogin();
        LoginCommand loginCommand=new LoginCommand(fakeConsole);

        loginCommand.execute();
        Assert.assertEquals("Login Successful !!\n",fakeConsole.isPrinted());

    }
}


class CorrectLogin extends FakeConsole
{
    protected void initializeInput()
    {

        input.add("111-1112");
        input.add("1234");
    }
}

class WrongLogin extends FakeConsole
{
    protected void initializeInput()
    {

        input.add("111-1115");
        input.add("123");
    }

}