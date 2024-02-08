package app;

//This is a class; "Blueprint" of a book to make instances of more books
public class Book {
    private String author;
    private String title;
    private String publisher;
    private int pages;
    private boolean available;

    //This is a constructor; Initializes properties of a book
    public Book(String author, String title, String publisher, int pages) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.pages = pages;
        this.available = true;
    }

    //Getter; this returns the string of author. Must be public.
    public String getAuthor() {
        return author;
    }

    //Setter; this changes string author for different instances.
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title =  title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
