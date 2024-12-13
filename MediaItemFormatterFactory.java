public class MediaItemFormatterFactory {

    public static MediaItemFormatter getFormatter(MediaItem mediaItem) {
        if (mediaItem instanceof Song) {
            return new SongFormatter();
        } else if (mediaItem instanceof Podcast) {
            return new PodcastFormatter();
        }
        throw new IllegalArgumentException("No formatter available for the given media item.");
    }
}
