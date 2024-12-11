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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displaySongDetails() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Genre: " + genre);
    }

    public static void displayTotalSongs() {
        System.out.println("Total Songs Created: " + songCounter);
    }
}
