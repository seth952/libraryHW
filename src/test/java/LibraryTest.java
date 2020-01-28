import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {


    private Library library;
    private Book book;



    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Jaws", "Henry Tallish", "Crime");
//
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }
    @Test
    public void capacityCheck(){
        assertEquals(5, library.capacityCount());
    }

    @Test
    public void bookAddedIfAllGood(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals();
    }

}
