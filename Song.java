public class Song {
    private String title;
    private String artist;
    private String genre;

    public String displaySongDetails() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Genre: " + genre);

        return "";
    }

    public String getTitle() {
        return title;
    }
}
