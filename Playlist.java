import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

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
