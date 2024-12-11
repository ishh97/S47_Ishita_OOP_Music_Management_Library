public class Song extends MediaItem {
    private String artist;

    private static int songCounter = 0;

    public Song() {
        super("Unknown Title", "Unknown Genre");
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

    public static void displayTotalSongs() {
        System.out.println("Total Songs Created: " + songCounter);
    }

    @Override
    public void displayDetails() {
        SongDisplay.displaySongDetails(this);
    }
}
