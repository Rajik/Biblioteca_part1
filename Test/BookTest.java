import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;


public class BookTest extends TestCase {

    static Book book=new Book(1,"Domain Specific Languages");

    @Test
    public void testToString() throws Exception {
         Assert.assertEquals("1 Domain Specific Languages", book.toString());

    }

    @Test
    public void testIsBookIDTrue()
    {
        Assert.assertEquals(true,book.isBookID(1));

    }

    @Test
    public void testIsBookIDFalse()
    {
        Assert.assertEquals(false,book.isBookID(10));

    }

    /*@Test
    public void testIsReserved()
    {
        Assert.assertEquals(false,book.isBookReserved());
    }  */

    @Test
    public void testReserveBookSuccess()
    {
        Assert.assertEquals(true,book.reserveBook());

    }

    @Test
    public void testReserveBookFailure()
    {
        Assert.assertEquals(false,book.reserveBook());

    }
}
