import java.io.*;
import java.util.Scanner;
public class AlbumDriver
{
    public static void main(String[] args)
    {
        try
        {

            Scanner sc = new Scanner(new File("input.txt"));
            int size = sc.nextInt();
            AlbumUtilities modify = new AlbumUtilities();
            int[] hms_time = new int[3];
            Song[] album = new Song[size];

           for(int i = 0; i < size; i++)
           {
                String time = sc.next(); //00:00
                String name = sc.nextLine(); //Entire line
                album[i] = new Song(time,name);
           }
           sc.close();

           for(int i = 0; i <album.length; i++)
           {
                album[i].seconds = modify.convertTo_Seconds(album, i);
           }
           hms_time = modify.totalTime(album);
           modify.print(album,hms_time);
           album = modify.sortAlbum(album);
           modify.print(album,hms_time);
        }
        

        catch(IOException e)
        {
            System.out.println(e);
        }

    
    }
}
//OUTPUT:
/*00:00 Hi
20:34 E
33:12 V
23:00 oi
04:35 lol
04:36 it be funny if this was a very long song title

Total Time = 01:25:57

00:00 Hi
04:35 lol
04:36 it be funny if this was a very long song title
20:34 E
23:00 oi
33:12 V

Total Time = 01:25:57 */