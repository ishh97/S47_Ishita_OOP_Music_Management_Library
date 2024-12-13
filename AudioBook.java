public class AudioBook extends MediaItem {
    private String author;
    private int totalPages;

    public AudioBook(String title, String author, String genre, int totalPages) {
        super(title, genre);
        this.author = author;
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public void displayDetails() {
        System.out.println("AudioBook Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Genre: " + getGenre());
        System.out.println("Total Pages: " + totalPages);
    }
}
