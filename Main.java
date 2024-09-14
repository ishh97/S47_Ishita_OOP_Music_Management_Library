
public class Main {
    public static void main(String[] args) {

        // Create an array of Song objects
        Song[] songsArray = new Song[3];

        // Initialize songs
        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");
        songsArray[2] = new Song("Dynamite", "BTS", "Disco");


        Playlist playlist = new Playlist("My Favorites");
        for (Song song : songsArray) {
            playlist.addSong(song);
        }
        playlist.displayPlaylist();
    }
}
