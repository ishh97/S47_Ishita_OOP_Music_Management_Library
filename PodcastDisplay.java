public class PodcastDisplay {

    public static void displayPodcastDetails(Podcast podcast) {
        System.out.println("Podcast Title: " + podcast.getTitle());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Genre: " + podcast.getGenre());
        System.out.println("Duration: " + podcast.getDuration() + " minutes");
    }
}
