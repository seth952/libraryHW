import java.util.ArrayList;

public class Library {



    private ArrayList<Book> books;
    private int capacity;



    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;

    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > bookCount()) {
            this.books.add(book);
        }
    }

    public int capacityCount(){
        return this.capacity;
    }

}
