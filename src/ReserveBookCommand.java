public class ReserveBookCommand extends Command
{

    int bookID;

    public ReserveBookCommand(Console console)
    {
        this.console=console;
    }


    public void execute()
    {

        try
        {
            if(currentUserName!=null)
            {
                console.print("Enter book ID:");
                bookID=Integer.parseInt(console.read());
                if(libraryStock.isBookIDValid(bookID))
                {
                    Book b=libraryStock.findBook(bookID);
                    if(b.reserveBook())
                        console.print("Thank You! Enjoy the book!!\n");
                    else
                        console.print("Sorry we dont have that book yet!!\n");
                }
                else
                    console.print("Sorry we dont have that book yet!!\n");

            }
            else
                console.print("Login please!!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}