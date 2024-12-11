public class SongDisplay {

    public static void displaySongDetails(Song song) {
        System.out.println("Song Title: " + song.getTitle());
        System.out.println("Artist: " + song.getArtist());
        System.out.println("Genre: " + song.getGenre());
    }
}
