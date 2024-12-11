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

    public void setHost(String host) {
        this.host = host;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        PodcastDisplay.displayPodcastDetails(this);
    }
}
