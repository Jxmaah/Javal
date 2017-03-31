
public class DVD extends Item
{
     private String director;
     private String movieStar;


    public DVD(String theTitle, String theDirector, String star,int time)
    {
		super(theTitle, time);
		director = theDirector;
		movieStar = star;
    }

    public String getDirector()
    {
        return director;
    }

	public String getStar()
    {
        return movieStar;
    }

    public void print()
    {
		super.print();
        System.out.println("DVD details: " + director + movieStar);
    }
}
