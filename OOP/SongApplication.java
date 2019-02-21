public class SongApplication
{
    public static void main(String[] args){
        Song song1 = new Song(); 
        Song song2 = new Song(23123123, 3.2, false); 
        System.out.println(song1);
        System.out.println(song2);
    }
}
