    import org.junit.Assert;
    import org.junit.Test;


    public class ReserveBookCommandTestLogFalse {

        FakeInput fakeConsole=new FakeInput();
        ReserveBookCommand reserveBookCommand=new ReserveBookCommand(fakeConsole);




        @Test
        public void testExecute()
        {
            ReserveBookCommand.currentUserName=null;
            reserveBookCommand.execute();
            Assert.assertEquals(true, fakeConsole.isPrinted("Login please!!"));
        }




    }









