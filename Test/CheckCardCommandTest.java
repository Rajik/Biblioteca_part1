import org.junit.*;

public class CheckCardCommandTest {

    FakeConsole fakeConsole=new FakeConsole();
    CheckCardCommand checkCardCommand=new CheckCardCommand(fakeConsole);



    @Test
    public void testExecuteLogInTrue()
    {
        ReserveBookCommand.currentUserName="111-1112";
        checkCardCommand.execute();
        Assert.assertEquals(true,fakeConsole.isPrinted("Please talk to your librarian!! Thank You 111-1112!!\n"));
    }

    @Test
    public void testExecuteLogInFalse()
    {
        ReserveBookCommand.currentUserName=null;
        checkCardCommand.execute();
        Assert.assertEquals(true,fakeConsole.isPrinted("Please talk to the librarian!! Thank You !!\n"));
    }


}


