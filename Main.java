public class Main {

    public static void main(String[] args) {

        // Songs Array
        Song[] songsArray = new Song[4];

        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");
        songsArray[2] = new Song("Dynamite", "BTS", "Disco");
        songsArray[3] = new Song("Delicate", "Taylor Swift", "Country");

        Song.displayTotalSongs();

        System.out.println("Displaying Songs:");
        for (Song song : songsArray) {
            song.displayDetails();
        }

        Podcast podcast = new Podcast("The Ranveer Show", "BeerBiceps", "Lifestyle", 127);
        System.out.println("\nDisplaying Podcast Details:");
        podcast.displayDetails();

        Playlist playlist = new Playlist("My Favorites");
        for (Song song : songsArray) {
            playlist.addSong(song);
        }
        playlist.displayPlaylist();

        System.out.println("Total Playlists Created: " + Playlist.getPlaylistCount());

        for (Song song : songsArray) {
            song.cleanup();
        }
        playlist.cleanup();
    }
}
