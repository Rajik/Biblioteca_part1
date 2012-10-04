public class CheckCardCommand extends Command
{
    public CheckCardCommand(Console console)
    {
        this.console=console;
    }

    public void execute()
    {
        String extra="the";
        String name="";
        if(currentUserName!=null)
        {
            extra="your";
            name=currentUserName;
        }
        console.print("Please talk to"+ " "+extra+" librarian!! Thank You "+ name +"!!\n");
    }
}