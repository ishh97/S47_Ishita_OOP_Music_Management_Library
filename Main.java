
public class Main {

    public static void main(String[] args) {

        Song[] songsArray = new Song[4];

        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");
        songsArray[2] = new Song("Dynamite", "BTS", "Disco");
        songsArray[3] = new Song("Delicate", "Taylor Swift", "Country");

        Song.displayTotalSongs();

        System.out.println("\nDisplaying Songs:");
        for (Song song : songsArray) {
            song.displayDetails();
        }
        songsArray[0].displayDetails("Playing now!");
        Podcast podcast = new Podcast("The Ranveer Show", "BeerBiceps", "Lifestyle", 127);
        System.out.println("\nDisplaying Podcast Details:");
        podcast.displayDetails();

        MediaItem item;
        item = songsArray[1];
        System.out.println("\nPolymorphism Demonstration:");
        item.displayDetails();

        item = podcast;
        item.displayDetails();
    }
}
