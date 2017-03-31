public class Item
{
    private  String title;
    private  int  playingTime;

    public Item(String theTitle, int time)
    {
       title = theTitle;
	   playingTime = time;
    }

    public String getTitle()
    {
        return title;
    }

   public int getplayingTime()
    {
        return playingTime;
    }
    public void print()
    {
        System.out.println(title + " " + playingTime);
    }

}
