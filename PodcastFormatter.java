public class PodcastFormatter implements MediaItemFormatter {

    @Override
    public void formatDetails(MediaItem mediaItem) {
        if (mediaItem instanceof Podcast) {
            Podcast podcast = (Podcast) mediaItem;
            System.out.println("Podcast Title: " + podcast.getTitle());
            System.out.println("Host: " + podcast.getHost());
            System.out.println("Genre: " + podcast.getGenre());
            System.out.println("Duration: " + podcast.getDuration() + " minutes");
        } else {
            System.out.println("Invalid media type for PodcastFormatter.");
        }
    }
}
