import org.junit.Assert;
import org.junit.Test;

public class ReserveBookCommandTestLogTrue {

    FakeInput fakeConsole=new FakeInput();
    ReserveBookCommand reserveBookCommand=new ReserveBookCommand(fakeConsole);





    @Test
    public void testexecuteSuccess()
    {
        ReserveBookCommand.currentUserName="111-1112";
        reserveBookCommand.execute();
        Assert.assertEquals(true,fakeConsole.isPrinted("Thank You! Enjoy the book!!\n"));
    }


    @Test
    public void testexecuteFailure()
    {
        ReserveBookCommand.currentUserName="111-1112";
        reserveBookCommand.execute();
        Assert.assertEquals(true, fakeConsole.isPrinted("Sorry we dont have that book yet!!\n"));
    }


}

class FakeInput extends FakeConsole
{
    protected void initializeInput()
    {

        input.add("1");
        input.add("10");
    }
}






