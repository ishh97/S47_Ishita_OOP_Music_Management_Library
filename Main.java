public class Main {

    public static void main(String[] args) {

        Song[] songsArray = new Song[2];

        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");

        Song.displayTotalSongs();

        System.out.println("\nDisplaying Songs:");
        for (Song song : songsArray) {
            song.displayDetails(); 
        }

        Podcast podcast = new Podcast("The Ranveer Show", "BeerBiceps", "Lifestyle", 127);
        System.out.println("\nDisplaying Podcast Details:");
        podcast.displayDetails(); 

        MediaItem item;
        item = songsArray[1];
        System.out.println("\nPolymorphism Demonstration with Abstract Class:");
        item.displayDetails(); 
        item = podcast;
        item.displayDetails(); 
    }
}
