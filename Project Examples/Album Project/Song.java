public class Song
{
    private final String time;
    private final String name;
    public int seconds;


    public Song(String newTime, String newName)
    {
        time = newTime; //00:00
        name = newName; //Name
    }

    //GETTERS
    public String getName()
    {
        return name;
    }
    
    public String getTime()
    {
        return time;
    }

    

}