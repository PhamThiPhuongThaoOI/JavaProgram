package midtermtest01.exs01;

import javax.swing.plaf.PanelUI;
import java.util.*;

public class BookManager {
    private List<Book> bookList;
    public BookManager(){
        bookList = new LinkedList<>();
    }
    public List<Book> getBookList() {
        return bookList;
    }
    private boolean checkBoundaries( int index, int limit) {
        return index >= 0 && index <= limit;
    }
    public void append( Book book) {
        bookList.add(book);
    }
    public void add( Book book, int index) {
        if( checkBoundaries(index, bookList.size())){
            bookList.add(index, book);
        } else{
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }
    public void remove ( int index) {
        if(checkBoundaries(index, bookList.size())) {
            bookList.remove(index);
        } else {
            throw new IndexOutOfBoundsException(" Index is out of bounds.");
        }
    }
    public void remove( Book book) {
        bookList.remove(book);
    }
    public Book bookAt( int index) {
        if( checkBoundaries(index, bookList.size()-1)){
            return bookList.get(index);
        } else {
            throw new IndexOutOfBoundsException(" Index out of bounds.");
        }
    }
    public List<Book> sortIncreasingByGenreAndTitle() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
             public int compare( Book book1, Book book2) {
                int genreComparison = book1.getGenre().compareTo(book2.getGenre());
                if( genreComparison != 0) {
                    return genreComparison;
                }
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        return bookList;
    }
    public List<Book> sortIncreasingGenreAndPrice() {
        Collections.sort(bookList, ( book1, book2) -> {
            int genreComparison = book1.getGenre().compareTo(book2.getGenre());
            if( genreComparison != 0) {
                return genreComparison;
            }
            return Double.compare(book1.getPrice(), book2.getPrice());
        });
        return bookList;
    }
    public List<Book> sortDecreasingGenreAndPrice() {
        Collections.sort(bookList, ( book1, book2) -> {
            int genreComparison = book2.getGenre().compareTo(book1.getGenre());
            if( genreComparison != 0) {
                return genreComparison;
            }
            return Double.compare(book2.getPrice(), book1.getPrice());
        });
        return bookList;
    }
    public List<Book> sortIncreasingPrice() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare( Book book1, Book book2) {
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        return bookList;
    }
    public List< Book> sortDecreasingPrice() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare( Book book1, Book book2) {
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return bookList;
    }
    public List< Book> sortIncreasingPages() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare( Book book1, Book book2) {
                return Integer.compare( book1.getPages(), book2.getPages());
            }
        });
        return bookList;
    }
    public List< Book> sortDecreasingPages() {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare( Book book1, Book book2) {
                return Integer.compare(book2.getPages(), book1.getPages());
            }
        });
        return bookList;
    }
    public List< Book> filterHighestPages( int howMany) {
        sortDecreasingPages();
        return bookList.subList(0, Math.min(howMany, bookList.size()));
    }
    public List< Book> filterBooksPagesHigherThan( double lowerBound) {
        List< Book> filteredBooks = new ArrayList<>();
        for( Book book : bookList) {
            if( book.getPages() > lowerBound) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
    public List< Book> filterBookLowestPages( int howMany) {
        sortIncreasingPages();
        return bookList.subList(0, Math.min(howMany, bookList.size()));
    }
    public List< Book> filterBookPagesLowerThan( double upperBound) {
        List< Book> filteredBooks = new ArrayList<>();
        for( Book book : bookList) {
            if( book.getPages() < upperBound) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
    public List< Book> filterBookOfPublisher( String publisher) {
        List< Book> filteredBooks = new ArrayList<>();
        for( Book book : bookList) {
            if( book.getPublisher().equals(publisher)) {
                filteredBooks.add( book);
            }
        }
        return filteredBooks;
    }
    public List< Book> filterBookOfGenre( String genre) {
        List< Book> filteredBooks = new ArrayList<>();
        for( Book book : bookList) {
            if( book.getGenre().equals(genre)){
                filteredBooks.add( book);
            }
        }
        return filteredBooks;
    }
    public List< Book> filterBookOfAuthor( String author) {
        List< Book> filteredBooks = new ArrayList<>();
        for( Book book: bookList) {
            if( book.getAuthor().equals(author)){
                filteredBooks.add( book);
            }
        }
        return filteredBooks;
    }
    public static String titleOfBookToString (List< Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for( Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }
    public static void print( List< Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for( Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
