import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: Krinax
 * Date: 9/24/12
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest extends TestCase {

    Movie movie=new Movie("Barfi",2012,"Anurag Basu","N/A");
    public void testToString() throws Exception {
        Assert.assertEquals("Barfi 2012 Anurag Basu N/A",movie.toString());

    }
}
