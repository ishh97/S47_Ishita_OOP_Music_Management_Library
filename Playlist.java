import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    private static int playlistCount = 0;

    public Playlist() {
        this.name = "Untitled Playlist";
        this.songs = new ArrayList<>();
        playlistCount++;
        System.out.println("Default Playlist Constructor Called");
    }

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        playlistCount++;
        System.out.println("Parameterized Playlist Constructor Called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.displayDetails();
        }
    }

    public static int getPlaylistCount() {
        return playlistCount;
    }

    public void cleanup() {
        System.out.println("Cleaning up resources for Playlist: " + name);
        songs.clear();
    }
}
