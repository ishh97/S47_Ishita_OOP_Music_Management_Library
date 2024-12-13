public class Main {

    public static void main(String[] args) {
        // Create an array of MediaItem objects
        MediaItem[] mediaItems = new MediaItem[4];
        mediaItems[0] = new Song("Shape of You", "Ed Sheeran", "Pop");
        mediaItems[1] = new Podcast("Tech Talks", "John Doe", "Technology", 30);
        mediaItems[2] = new Song("Blinding Lights", "The Weeknd", "R&B");
        mediaItems[3] = new AudioBook("Atomic Habits", "James Clear", "Self-Help", 320);

        // Display details using polymorphism
        System.out.println("Displaying Media Details:");
        for (MediaItem item : mediaItems) {
            item.displayDetails();
            System.out.println("----------------------");
        }
    }
}
