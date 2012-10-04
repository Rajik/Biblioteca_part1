public class PrintMoviesCommand extends Command
{
    public PrintMoviesCommand(Console console)
    {
        this.console=console;
    }
    public void execute()
    {
        MoviesDB moviesDB=new MoviesDB();
        console.print(moviesDB.printAll());
    }
}
