public class Main {

    public static void main(String[] args) {
        Song[] songsArray = new Song[2];
        songsArray[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        songsArray[1] = new Song("Blinding Lights", "The Weeknd", "R&B");

        System.out.println("\nDisplaying Songs:");
        for (Song song : songsArray) {
            MediaItemFormatter formatter = MediaItemFormatterFactory.getFormatter(song);
            formatter.formatDetails(song);
        }

        Podcast podcast = new Podcast("The Ranveer Show", "BeerBiceps", "Lifestyle", 127);
        System.out.println("\nDisplaying Podcast Details:");
        MediaItemFormatter formatter = MediaItemFormatterFactory.getFormatter(podcast);
        formatter.formatDetails(podcast);
    }
}
