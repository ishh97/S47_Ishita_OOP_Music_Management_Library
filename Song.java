public class Song extends MediaItem {
    private String artist;

    public Song(String title, String artist, String genre) {
        super(title, genre);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void displayDetails() {
        System.out.println("Song Title: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + getGenre());
    }
}
