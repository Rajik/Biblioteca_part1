
public class Book {
    private int ID;
    private String Title;
    private boolean reserved;

    public Book(int bookID,String bookTitle)
    {
        this.ID=bookID;
        this.Title=bookTitle;
        this.reserved=false;


    }

    public String toString()
    {
        return ID+" "+Title;
    }

    public boolean isBookID(int bookID)
    {
        return (bookID==this.ID);
    }



    public boolean reserveBook()
    {
        if(!reserved)
        {
            this.reserved=true;
            return true;
        }
        return false;

    }

}
