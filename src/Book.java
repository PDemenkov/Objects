import java.util.Objects;

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

    @Override
    public String toString() {
        return "Книга{" +
                "Автор='" + authorName + '\'' +
                ", Название книги='" + bookName + '\'' +
                ", Год издания=" + releaseYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && Objects.equals(authorName, book.authorName) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, releaseYear);
    }
}
