public class SongFormatter implements MediaItemFormatter {

    @Override
    public void formatDetails(MediaItem mediaItem) {
        if (mediaItem instanceof Song) {
            Song song = (Song) mediaItem;
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Genre: " + song.getGenre());
        } else {
            System.out.println("Invalid media type for SongFormatter.");
        }
    }
}
