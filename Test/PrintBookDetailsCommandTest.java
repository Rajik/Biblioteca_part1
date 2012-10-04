import org.junit.*;

public class PrintBookDetailsCommandTest {

    FakeConsole fakeConsole=new FakeConsole();

    PrintBookDetailsCommand printCommand=new PrintBookDetailsCommand(fakeConsole);

    @Test
    public void testExecute()
    {

        printCommand.execute();
        Assert.assertEquals(true,fakeConsole.isPrinted("1 Domain Specific Languages\n2 Refactoring: Ruby Edition\n3 Java Developer's Resource\n4 Applying UML and Patterns\n5 Object Oriented Programming\n"));
    }


}
