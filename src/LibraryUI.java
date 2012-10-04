import java.util.*;

public class LibraryUI implements Observer{

    int ch=0;
    PrintOperation printOperation=new PrintOperation();
    static List<Command> commandObject=new ArrayList<Command>();
    public static User currentUser;
    Console console=new SystemConsole();

    public LibraryUI()
    {
       // initializeCommandActions(console);

    }

    public void initializeCommandActions(Console console)
    {
        commandObject.add(new PrintBookDetailsCommand(console));
        commandObject.add(new ReserveBookCommand(console));
        commandObject.add(new CheckCardCommand(console));
        commandObject.add(new PrintMoviesCommand(console));
        commandObject.add(new LoginCommand(console));
    }



    public void UI(Console console)
    {

        printOperation.displayWelcomeNote(console);
        do
        {
            printOperation.displayMenu(console);
            menuCommand(console);

        }while(ch!=6);


    }

    public void menuCommand(Console console)
    {
        try
        {
            printOperation.displayEnterChoice(console);
            ch=Integer.parseInt(console.read());

            processInput(ch,console);

        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void processInput(int ch, Console console) {
        initializeCommandActions(console);
        boolean valid=validateInput(ch);

        if(valid==false)
            printOperation.displayInvalidOptionMessage(console);
        else
        {
            if(ch==6)
                return;

            commandObject.get(ch-1).execute();

        }

    }

    public boolean validateInput(int input)
    {
        return (input <=6 && input>=1);
    }

    public void update(Observable obj, Object username) {
        currentUser= (User) username;
    }
}


class PrintOperation
{

    public void displayMenu(Console console)
    {
        console.print("**** MAIN MENU ****\n");
        List<String> menu=new ArrayList<String>();

        menu.add("1. View available books\n");
        menu.add("2. Reserve a book\n");
        menu.add("3. Check library card\n");
        menu.add("4.View Movie List\n");
        menu.add("5. Login\n");
        menu.add("6. Exit\n");

        Iterator<String> iterator=menu.iterator();

        while(iterator.hasNext())
        {
            console.print(iterator.next());
        }

    }

    public void displayWelcomeNote(Console console)
    {
        console.print("Welcome to the Biblioteca!!\n");
    }

    public void displayInvalidOptionMessage(Console console)
    {
        console.print("Select valid option!!\n");
    }

    public void displayEnterChoice(Console console)
    {
        console.print("Enter your choice (1/2/3/4/5/6)\n");
    }



}
