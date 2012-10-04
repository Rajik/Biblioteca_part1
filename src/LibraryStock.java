import java.util.*;

public class LibraryStock
{

    private static ArrayList<Book> booksStock=new ArrayList<Book>();

    public LibraryStock()
    {
        booksStock.add(new Book(1,"Domain Specific Languages"));
        booksStock.add(new Book(2,"Refactoring: Ruby Edition"));
        booksStock.add(new Book(3,"Java Developer's Resource"));
        booksStock.add(new Book(4,"Applying UML and Patterns"));
        booksStock.add(new Book(5,"Object Oriented Programming"));
    }

    public String toString()
    {
        String bookDetails="";

        Iterator<Book> iterator=booksStock.iterator();
        while(iterator.hasNext())
        {
            Book b=iterator.next();
            bookDetails+= b.toString()+"\n";
        }


        return bookDetails;
    }

    public boolean isBookIDValid(int bookID)
    {
        return (bookID>=1 && bookID<=booksStock.size());
    }

    public Book findBook(int bookID)
    {
        Iterator<Book> iterator=booksStock.iterator();
        while(iterator.hasNext())
        {
            Book b=iterator.next();
            if(b.isBookID(bookID))
            {
                return b;
            }
        }

        return null;

    }
}
