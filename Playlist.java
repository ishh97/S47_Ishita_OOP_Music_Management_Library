import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    private static int playlistCount = 0;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        playlistCount++;
    }

    public String getName() {
        return name;
    }

    public void setPlaylistName(String name) {
        this.name = name;
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

    public static int getPlaylistCount() {
        return playlistCount;
    }
}
