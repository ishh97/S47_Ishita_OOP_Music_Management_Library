public class Song extends MediaItem {
    private String artist;

    private static int songCounter = 0;

    public Song() {
        super();
        this.artist = "Unknown Artist";
        songCounter++;
        System.out.println("Default Song Constructor Called");
    }

    public Song(String title, String artist, String genre) {
        super(title, genre);
        this.artist = artist;
        songCounter++;
        System.out.println("Parameterized Song Constructor Called");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + ", Artist: " + artist + ", Genre: " + getGenre());
    }

    public void displayDetails(String message) {
        System.out.println("Title: " + getTitle() + ", Artist: " + artist + ", Genre: " + getGenre() + ", Message: " + message);
    }

    public static void displayTotalSongs() {
        System.out.println("Total Songs Created: " + songCounter);
    }

    public void cleanup() {
        System.out.println("Cleaning up resources for Song: " + getTitle());
    }
}
