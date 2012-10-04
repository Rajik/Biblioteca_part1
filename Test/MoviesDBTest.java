import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Krinax
 * Date: 9/24/12
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoviesDBTest extends TestCase {
    MoviesDB moviesDB=new MoviesDB();
    public void testToString() throws Exception {
        Assert.assertEquals("Sholay 1975 Ramesh Sippy 9.0\nLagaan 2002 XYZ 9.0\nBarfi 2012 Anurag Basu N/A\n",moviesDB.printAll());


    }
}
