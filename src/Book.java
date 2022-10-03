public class Book {
    private String authorName;
    private String bookName;
    private int releaseYear;

    public Book(String authorName, String bookName, int releaseYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getReleaseYear() { return this.releaseYear; }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
