public class Main {

    public static void main(String[] args) {

        // Create song objects dynamically
        Song[] songsArray = new Song[4];

        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");
        songsArray[2] = new Song("Dynamite", "BTS", "Disco");
        songsArray[3] = new Song("Delicate", "Taylor Swift", "Country");

        // Print total number of songs added using the static variable
        System.out.println("Total Songs Created: " + Song.getSongCounter());

        Playlist playlist = new Playlist("My Favorites");
        for (Song song : songsArray) {
            playlist.addSong(song);
        }
        playlist.displayPlaylist();
        
        // Display the number of playlists created using the static variable
        System.out.println("Total Playlists Created: " + Playlist.getPlaylistCount());

        // Simulate object cleanup
        for (int i = 0; i < songsArray.length; i++) {
            songsArray[i] = null; 
        }

        playlist = null; 
    }
}
