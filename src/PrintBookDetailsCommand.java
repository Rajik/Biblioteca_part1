public class PrintBookDetailsCommand extends Command
{
    public PrintBookDetailsCommand(Console console)
    {
        this.console=console;
    }

    public void execute()
    {
        console.print(libraryStock.toString());
    }
}