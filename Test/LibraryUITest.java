
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;



public class LibraryUITest {

    FakeConsole fakeConsole=new FakeConsole();
    LibraryUI libraryUI=new LibraryUI();

    @Before
    public void initialize()
    {
    libraryUI.initializeCommandActions(fakeConsole);
    }



    @Test
    public void testChoicesfor1to4()
    {

        for(int i=1;i<=6;i++)
        {
            Assert.assertEquals(true,libraryUI.validateInput(i));
        }

    }

    @Test
    public void testChoicesforNegativeValues()
    {
        for(int i=-10;i<1;i++)
        {
            Assert.assertEquals(false,libraryUI.validateInput(i));
        }

    }

    @Test
    public void testChoicesGreaterthan4()
    {
        for(int i=7;i<10;i++)
        {
            Assert.assertEquals(false, libraryUI.validateInput(i));
        }
    }

    @Test
    public void testProcessInputforInvalidChoices()
    {
        libraryUI.processInput(10, fakeConsole);
        //Assert.assertEquals("Select valid option!!\n", outContent.toString());
        Assert.assertEquals(true,fakeConsole.isPrinted("Select valid option!!\n"));

    }

    @Test
    public void testProcessInputforViewBooks()
    {
        libraryUI.processInput(1,fakeConsole);
        Assert.assertEquals("1 Domain Specific Languages\n2 Refactoring: Ruby Edition\n3 Java Developer's Resource\n4 Applying UML and Patterns\n5 Object Oriented Programming\n",fakeConsole.isPrinted());

    }



    @Test
    public void testMenuCommandForChoiceOne()
    {
        libraryUI.menuCommand(fakeConsole);
        Assert.assertEquals(true,fakeConsole.isPrinted("1 Domain Specific Languages\n2 Refactoring: Ruby Edition\n3 Java Developer's Resource\n4 Applying UML and Patterns\n5 Object Oriented Programming\n"));


    }

    @Test
    public void testMenuCommandForChoiceTwo()
    {
        ReserveBookCommand.currentUserName="111-1112";
        libraryUI.menuCommand(fakeConsole);
        Assert.assertEquals("Thank You! Enjoy the book!!\n",fakeConsole.isPrinted());

    }
   @Test
    public void testProcessInputforReserveBookSuccess()
    {    ReserveBookCommand.currentUserName="111-1112";
        ReserveBookCommand reserveBookCommand=new ReserveBookCommand(fakeConsole);
        reserveBookCommand.execute();
        Assert.assertEquals("Thank You! Enjoy the book!!\n",fakeConsole.isPrinted());


    }

   @Test
    public void testProcessInputforReserveBookFailure()
    {
        ReserveBookCommand.currentUserName="111-1112";
        ReserveBookCommand reserveBookCommand=new ReserveBookCommand(fakeConsole);
        reserveBookCommand.execute();
        Assert.assertEquals("Sorry we dont have that book yet!!\n",fakeConsole.isPrinted());



    }

    @Test
    public void testCheckCardCommandLoggedInFalse()
    {
        ReserveBookCommand.currentUserName=null;
        libraryUI.menuCommand(fakeConsole);
        Assert.assertEquals(true,fakeConsole.isPrinted("Please talk to the librarian!! Thank You !!\n"));

    }

 @Test
    public void testCheckCardCommandLoggedInTrue()
    {
        ReserveBookCommand.currentUserName="111-1112";
        libraryUI.processInput(3,fakeConsole);
        Assert.assertEquals(true,fakeConsole.isPrinted("Please talk to your librarian!! Thank You 111-1112!!\n"));

    }

    @Test
    public void testMenuForChoiceFour()
    {
        libraryUI.menuCommand(fakeConsole);
        junit.framework.Assert.assertEquals(true,fakeConsole.isPrinted("Sholay 1975 Ramesh Sippy 9.0\nLagaan 2002 XYZ 9.0\nBarfi 2012 Anurag Basu N/A\n"));

    }

    @Test
    public void testMenuForChoiceFiveSuccess()
    {
        FakeCorrectLoginDetails fakeConsole=new FakeCorrectLoginDetails();
        libraryUI.menuCommand(fakeConsole);
        junit.framework.Assert.assertEquals("Login Successful !!\n",fakeConsole.isPrinted());

    }

    @Test
    public void testMenuForChoiceFiveFailure()
    {
        FakeWrongLoginDetails fakeConsole=new FakeWrongLoginDetails();
        libraryUI.menuCommand(fakeConsole);
        junit.framework.Assert.assertEquals(true,fakeConsole.isPrinted("Wrong username/password!!\n"));

    }

}

class FakeCorrectLoginDetails extends FakeConsole
{
    protected void initializeInput()
    {

        input.add("111-1112");
        input.add("1234");
    }

}

class FakeWrongLoginDetails extends FakeConsole
{
    protected void initializeInput()
    {

        input.add("111-1119");
        input.add("1234");
    }

}





