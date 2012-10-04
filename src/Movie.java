
public class Movie {
    private String moviename;
    private int year;
    private String director;
    private String rating;

    public Movie(String moviename,int year,String director,String rating)
    {
        this.moviename=moviename;
        this.year=year;
        this.director=director;
        this.rating=rating;
    }

    public String toString()
    {
        return this.moviename+" "+this.year+" "+this.director+" "+this.rating;
    }
}
