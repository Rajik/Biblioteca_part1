import java.util.*;


public class MoviesDB {
    ArrayList<Movie> movies= new ArrayList<Movie>();

    public MoviesDB()
    {
        movies.add(new Movie("Sholay",1975,"Ramesh Sippy","9.0"));
        movies.add(new Movie("Lagaan",2002,"XYZ","9.0"));
        movies.add(new Movie("Barfi",2012,"Anurag Basu","N/A"));
    }

    public String printAll()
    {
        Iterator<Movie> iterator=movies.iterator();
        String movies="";
        while(iterator.hasNext())
        {
            movies+=iterator.next().toString()+"\n";
        }

        return movies;

    }
}
