public class Podcast extends MediaItem {
    private String host;
    private int duration;

    public Podcast(String title, String host, String genre, int duration) {
        super(title, genre);
        this.host = host;
        this.duration = duration;
    }

    public String getHost() {
        return host;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Podcast Title: " + getTitle());
        System.out.println("Host: " + host);
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + duration + " minutes");
    }
}
