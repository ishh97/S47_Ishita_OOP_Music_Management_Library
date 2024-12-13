public abstract class MediaItem {
    private String title;
    private String genre;

    public MediaItem(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    // Abstract method for LSP demonstration
    public abstract void displayDetails();
}
