import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("King", "Shining", 1977);
        Book book1 = new Book("Hitchcock", "Ghostly Gallery", 1962);
        Author author = new Author("Stephen", "King");
        Author author1 = new Author("Alfred", "Hitchcock");
        System.out.println("Книга 1- " + author.getName() + " " + author.getSurName() + " " + book.getBookName() + " Год издания- " + book.getReleaseYear());
        book.setReleaseYear(1990);
        System.out.println("Переиздание Книги 2- " + author1.getName() + " " + author1.getSurName() + " " + book1.getBookName() + " Год переиздания- " + book1.getReleaseYear());
    }
}