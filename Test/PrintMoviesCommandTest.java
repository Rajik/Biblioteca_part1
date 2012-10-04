import junit.framework.Assert;
import junit.framework.TestCase;


public class PrintMoviesCommandTest extends TestCase {
    FakeConsole fakeConsole=new FakeConsole();

    public void testExecute() throws Exception {
        PrintMoviesCommand printMoviesCommand=new PrintMoviesCommand(fakeConsole);
        printMoviesCommand.execute();
        Assert.assertEquals(true,fakeConsole.isPrinted("Sholay 1975 Ramesh Sippy 9.0\nLagaan 2002 XYZ 9.0\nBarfi 2012 Anurag Basu N/A\n"));
    }
}
