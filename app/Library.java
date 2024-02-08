package app;
import java.util.ArrayList;
import java.util.List;

//Library class; to manage books.
public class Library {
    //Array list to store books.
    private List<Book> books;
    //Constructor to initialize library with an empty list of books.
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        for(Book book: books){
            System.out.println(book.getTitle() + ", " + book.getAuthor());
        }
    }
}
