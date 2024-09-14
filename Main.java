
public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Shape of You", "Ed Sheeran", "Pop");
        Song song2 = new Song("Blinding Lights", "The Weeknd", "R&B");


        Playlist playlist = new Playlist("My Favorites");

        song1.setSongDetails("Shape of You", "Ed Sheeran", "Pop");
        song2.setSongDetails("Blinding Lights", "The Weeknd", "R&B");

        playlist.addSong(song1);
        playlist.addSong(song2);

        playlist.displayPlaylist();
    }
}
