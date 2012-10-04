import junit.framework.TestCase;
import org.junit.*;

public class LibraryStockTest extends TestCase {

    static LibraryStock libraryStock=new LibraryStock();


    public void testToString() throws Exception {
        Assert.assertEquals("1 Domain Specific Languages\n2 Refactoring: Ruby Edition\n3 Java Developer's Resource\n4 Applying UML and Patterns\n5 Object Oriented Programming\n",libraryStock.toString());

    }

    public void testIsBookIDValidFalse() throws Exception {
        Assert.assertEquals(false,libraryStock.isBookIDValid(0));
        Assert.assertEquals(false,libraryStock.isBookIDValid(-3));
        Assert.assertEquals(false,libraryStock.isBookIDValid(10));

    }


    public void testIsBookIDValidTrue() throws Exception {
        for(int i=1; i<=5;i++)
        {
            Assert.assertEquals(true, libraryStock.isBookIDValid(i));
        }

    }

    public void testFindBookSuccess() throws Exception
    {
        Assert.assertEquals(true,libraryStock.findBook(2).isBookID(2));
    }

    public void testFindBookFailure() throws Exception
    {
        Assert.assertEquals(null,libraryStock.findBook(12));
    }
}
