public class Song {
    private String title;
    private String artist;
    private String genre;

    private static int songCounter = 0;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;

        songCounter++;
    }

    public String displaySongDetails() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Genre: " + genre);
        return "";
    }

    public String getTitle() {
        return title;
    }

    public static void displayTotalSongs() {
        System.out.println("Total Songs Created: " + songCounter);
    }

    public static int getSongCounter() {
        return songCounter;
    }
}
