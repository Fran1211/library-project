package app;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Robert Greene", "Laws of Human Nature","Penguin", 350);
        Book book2 = new Book("JK Rowling", "Harry Potter", "NA", 280);

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();



    }
}
