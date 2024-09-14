import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;


    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.displaySongDetails();
        }
    }
}
