public class Song extends MediaItem {
    private String artist;

    private static int songCounter = 0; 

    public Song(String title, String artist, String genre) {
        super(title, genre); 
        this.artist = artist;

        songCounter++;
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

    public static void displayTotalSongs() {
        System.out.println("Total Songs Created: " + songCounter);
    }
}
