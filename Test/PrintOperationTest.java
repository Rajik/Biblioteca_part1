import org.junit.*;
import java.io.*;

public class PrintOperationTest {


    PrintOperation printOperation=new PrintOperation();
    FakeConsole fakeConsole=new FakeConsole();


    @Test
    public void testWelcomeNote()
    {

        printOperation.displayWelcomeNote(fakeConsole);

        Assert.assertEquals(true,fakeConsole.isPrinted("Welcome to the Biblioteca!!\n"));
    }

    @Test
    public void testDisplayMenu()
    {
        printOperation.displayMenu(fakeConsole);

        Assert.assertEquals(true,fakeConsole.isPrinted("**** MAIN MENU ****\n1. View available books\n2. Reserve a book\n3. Check library card\n4.View Movie List\n5. Login\n6. Exit\n"));

    }
}
