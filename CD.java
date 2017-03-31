public class CD extends Item
{
    private  String artist;
    private int numberOfTracks;

    public CD(String theTitle, String theArtist, int tracks, int time)
    {
       super(theTitle, time);
	   artist = theArtist;
	   tracks = numberOfTracks;

    }


    public String getArtist()
    {
        return artist;

    }


    public int getNumberOfTracks()
    {
         return numberOfTracks;

    }

    public void print()
    {
		super.print();
		System.out.println("Cd details: "+ artist + numberOfTracks);
		

    }
}
