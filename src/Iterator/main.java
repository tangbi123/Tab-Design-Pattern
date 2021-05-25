package Iterator;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("test1"));
        bookShelf.appendBook(new Book("test2"));
        bookShelf.appendBook(new Book("test3"));
        bookShelf.appendBook(new Book("test4"));
        MyIterator myIterator = bookShelf.myIterator();
        while(myIterator.hasNext()){
            Book book = (Book)myIterator.next();
            System.out.println(book.getName());
        }
    }
}
