

public abstract class Command
{
    static LibraryStock libraryStock=new LibraryStock();
    static String currentUserName=null;
    Console console;
    abstract public void execute();
}