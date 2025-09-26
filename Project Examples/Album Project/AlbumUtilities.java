public class AlbumUtilities
{


    /**
     * @param album
     * @param time 
     * @Prints Album list, then total time 
     */

    public static void print(Song[] album,int[] time)
    {
        for (Song album1 : album) {
            System.out.println(album1.getTime() + album1.getName());
            
        }
        System.out.printf("\nTotal Time = %02d:%02d:%02d%n" + "\n",time[0], time[1], time[2]);
        
    }

    /**
     * @param album inputs album from driver
     * @param interval inputs interval from driver (i am tired and unable to process stuff rn so yea)
     * @return total seconds that Song[] object has
     */
    public int convertTo_Seconds(Song[] album,int interval)
    {

        int minutes = Integer.parseInt(album[interval].getTime().substring(0,2))*60;
        int seconds = Integer.parseInt(album[interval].getTime().substring(3,5));
        return minutes + seconds;
    }

    /**
     * @param album sends album from driver
     * @return returns a sorted album that the driver will replace album with
     */
    public Song[] sortAlbum(Song[] album)
    {
        Song[] sortedAlbum = album;

        for(int i = 1; i<album.length; i++)
        {
            while(i > 0 &&sortedAlbum[i].seconds < sortedAlbum[i-1].seconds )
            {
                Song stored = sortedAlbum[i];
                sortedAlbum[i] = sortedAlbum[i-1];
                sortedAlbum[i-1] = stored;
                i--;
            }

        }
        return sortedAlbum;
    }

    /**
     * @param album
     * @Converts seconds into actual time this will be used for 00:00:00 format
     */
    public int[] totalTime(Song[] album)
    {
        int totalSeconds = 0;
        int hours;
        int minutes;
        int seconds;

        for (Song album1 : album) {
            totalSeconds += album1.seconds;
        }

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600)/ 60;
        seconds = totalSeconds % 60;

        return new int[]{hours,minutes,seconds};
    }

}











/*  Other methods i was trying out throuhgout this program:
    public Song[] convertTime(Song[] album)
    {
        Song[] time = album;

        for(int i = 0; i < album.length; i++)
        {
        int minutes = Integer.parseInt((time[i].getTime().substring(0, 2)))*60;
        int seconds = Integer.parseInt(time[i].getTime().substring(3, 5));
        }

        return time;
    }


    

 
    public static void selectionSort(Song[] album)
    {
        Song[] TBD = album;
        for(int i = 1; i<album.length; i++)
        {
            int current = i;
            int previous = i-1;

            while(TBD[i].convertTo_Seconds() < TBD[i-1].convertTo_Seconds())
            {
                int current = TBD[i]
            }

        }


    public void convertTo_Seconds(Song[] album)
    {
        Song[] time = album;

        for(int i = 0; i < album.length; i++)
        {
        int seconds1 = Integer.valueOf(time[i].substring(0,2));
        int seconds2 =  Integer.valueOf(time[i].substring(3,5));
        int[] secondsAlbum = (seconds1*60) + seconds2;

        }
    }

    //Setter
    public void setArray(Song[] album)
    {
        Song[] _album = album;
        

    }
*/

